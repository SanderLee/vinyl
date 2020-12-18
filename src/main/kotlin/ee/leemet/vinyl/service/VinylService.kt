package ee.leemet.vinyl.service

import ee.leemet.vinyl.persistence.repository.VinylRepository

class VinylService(private val vinylRepository: VinylRepository) {
    fun getVinylWishlist() = vinylRepository.getVinylWishlist()
}
