package oop_00000105999_chaychinhendri.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
): SmartDevice, Switchable {
    override fun turnOn() {
        println("$name Speaker telah menyala.")
    }

    override fun turnOff() {
        println("$name Speaker telah mati.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}