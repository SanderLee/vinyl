package ee.leemet.vinyl.persistence.entity

import com.googlecode.objectify.annotation.Entity
import com.googlecode.objectify.annotation.Id
import ee.leemet.vinyl.model.Vinyl

@Entity(name = "vinyl")
data class VinylEntity(
    @Id var id: Long? = null,
    var title: String = "",
    var artist: String = "",
    var coverArtUrl: String? = null
) {
    fun toVinyl() = Vinyl(
        id = id,
        title = title,
        artist = artist,
        coverArtUrl = coverArtUrl
    )
}
