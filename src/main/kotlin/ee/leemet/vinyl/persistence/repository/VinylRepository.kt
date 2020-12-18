package ee.leemet.vinyl.persistence.repository

import ee.leemet.vinyl.model.Vinyl

class VinylRepository {
    fun getVinylWishlist(): List<Vinyl> {
        return listOf(Vinyl("vinüül 1"), Vinyl("Vibyl 2"))
    }
}
