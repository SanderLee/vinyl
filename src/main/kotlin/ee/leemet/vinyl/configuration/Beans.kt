package ee.leemet.vinyl.configuration

import ee.leemet.vinyl.controller.VinylController
import ee.leemet.vinyl.persistence.repository.VinylRepository
import ee.leemet.vinyl.service.VinylService
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

fun beans() = beans {
    bean<VinylService>()
    bean<VinylRepository>()
}

class BeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {
    override fun initialize(context: GenericApplicationContext) =
        beans().initialize(context)
}