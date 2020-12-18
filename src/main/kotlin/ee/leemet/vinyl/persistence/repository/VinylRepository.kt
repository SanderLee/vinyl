package ee.leemet.vinyl.persistence.repository

import com.googlecode.objectify.ObjectifyService
import com.googlecode.objectify.ObjectifyService.ofy
import ee.leemet.vinyl.persistence.entity.VinylEntity

class VinylRepository {
    fun getVinylWishlist() =
        ObjectifyService.run {
            ofy().load().type(VinylEntity::class.java).list().map { it.toVinyl() }
        }
}
