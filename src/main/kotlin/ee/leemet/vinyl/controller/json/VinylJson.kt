package ee.leemet.vinyl.controller.json

import ee.leemet.vinyl.model.Vinyl

data class VinylJson(
    val title: String,
    val artist: String,
    val coverArtUrl: String?
) {
    companion object {
        fun fromVinyl(vinyl: Vinyl) = with(vinyl) {
            VinylJson(
                title = title,
                artist = artist,
                coverArtUrl = coverArtUrl
            )
        }
    }
}
