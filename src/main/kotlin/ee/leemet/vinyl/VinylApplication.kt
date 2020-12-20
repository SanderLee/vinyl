package ee.leemet.vinyl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.cors.CorsConfiguration

@SpringBootApplication
class VinylApplication

@EnableWebSecurity
class VinylApplicationConfiguration : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity) {
        http.cors().configurationSource { CorsConfiguration().applyPermitDefaultValues() }
    }
}

fun main(args: Array<String>) {
    runApplication<VinylApplication>(*args)
}
