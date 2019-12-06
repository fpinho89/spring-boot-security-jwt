package br.com.poc.config

class AccountCredentials(var username: String? = null, var password: String? = null) {

    operator fun component1(): String? {
        return  this.username
    }

    operator fun component2(): String? {
        return  this.password
    }
}
