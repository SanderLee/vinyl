package ee.leemet.vinyl.configuration

import com.googlecode.objectify.ObjectifyService
import ee.leemet.vinyl.persistence.entity.VinylEntity
import ee.leemet.vinyl.persistence.repository.VinylRepository
import ee.leemet.vinyl.service.VinylService
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.UrlBasedCorsConfigurationSource

fun beans() = beans {
    bean<VinylService>()
    bean<VinylRepository>()

    bean(isPrimary = true) {
        val config = CorsConfiguration()
        config.allowedOrigins = listOf("*")
        config.allowedMethods = listOf("*")
        config.allowedHeaders = listOf("*")
        val source = UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/vinyl/**", config)
        source
    }
}

class BeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {
    override fun initialize(context: GenericApplicationContext) {
        beans().initialize(context)
        ObjectifyService.init()
        ObjectifyService.register(VinylEntity::class.java)
    }
}