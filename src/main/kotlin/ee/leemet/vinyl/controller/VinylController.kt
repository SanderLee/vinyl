package ee.leemet.vinyl.controller

import ee.leemet.vinyl.service.VinylService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/vinyl")
class VinylController(private val vinylService: VinylService) {

    @GetMapping("/wishlist")
    fun getVinylWishlist() = vinylService.getVinylWishlist()
}