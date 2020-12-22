package ee.leemet.vinyl.controller.json

import ee.leemet.vinyl.model.Vinyl

data class VinylJson(
    val id: Long?,
    val title: String,
    val artist: String,
    val coverArtUrl: String?
) {
    companion object {
        fun fromVinyl(vinyl: Vinyl) = with(vinyl) {
            VinylJson(
                id = id,
                title = title,
                artist = artist,
                coverArtUrl = coverArtUrl
            )
        }
    }
}
