package ee.leemet.vinyl.persistence.repository

import ee.leemet.vinyl.model.Vinyl

class VinylRepository {
    fun getVinylWishlist() =
        listOf(
            Vinyl("vinüül 1"),
            Vinyl("Vibyl 2"),
            Vinyl("uus"),
            Vinyl("kskdfkskfskfksd"),
            Vinyl("SEE TÖÖTAB RAISK")
        )//TODO
}
