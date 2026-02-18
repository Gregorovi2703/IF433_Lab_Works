package oop_00000105999_chaychinhendri.week03

fun main() {
    val player = Player("Gregor")

    //player.xp = 70 (Error)

    println("Level awal: ${player.level}")

    println("")
    println("Tambah XP 50")
    player.addXp(50)
    println("Level sekarang: ${player.level}")

    println("")
    println("Tambah XP 60")
    player.addXp(60)
    println("Level sekarang: ${player.level}")
}