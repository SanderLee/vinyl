package ee.leemet.vinyl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VinylApplication

fun main(args: Array<String>) {
	runApplication<VinylApplication>(*args)
}
