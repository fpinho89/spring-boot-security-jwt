package br.com.poc.config

import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import java.util.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class TokenAuthenticationService {

    companion object {

        private const val EXPIRATION_TIME = 900_000
        private const val SECRET = "MY_SECRET_KEY"
        private const val TOKEN_PREFIX = "Bearer"
        private const val HEADER_STRING = "Authorization"

        fun addAuthentication(response: HttpServletResponse,
                              username:String) {

            val jwt = Jwts.builder()
                    .setSubject(username)
                    .setExpiration(Date(System.currentTimeMillis() + EXPIRATION_TIME))
                    .signWith(SignatureAlgorithm.HS512, SECRET)
                    .compact()
            response.addHeader(HEADER_STRING, "$TOKEN_PREFIX $jwt")
        }

        fun getAuthentication(request: HttpServletRequest): Authentication? {

            val token = request.getHeader(HEADER_STRING)

            if(token != null) {
                val user = Jwts.parser()
                        .setSigningKey(SECRET)
                        .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                        .body
                        .subject

                if(user != null) {
                   return UsernamePasswordAuthenticationToken(user, null, Collections.emptyList())
                }
            }
            return null
        }
    }
}