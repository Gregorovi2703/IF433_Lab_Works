package oop_00000105999_chaychinhendri.week03

fun main() {

    val weapon = Weapon("Dragon Slayer", 400)

    println("Nama Weapon : ${weapon.name}")
    println("Damage Awal : ${weapon.damage}")
    println("Tier Awal   : ${weapon.tier}")

    println("")
    println("Set damage ke -50")
    weapon.damage = -50
    println("Damage Sekarang : ${weapon.damage}")
    println("Tier Sekarang   : ${weapon.tier}")

    println("")
    println("Set damage ke 9999")
    weapon.damage = 9999
    println("Damage Sekarang : ${weapon.damage}")
    println("Tier Sekarang   : ${weapon.tier}")
}