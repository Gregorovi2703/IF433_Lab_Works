package oop_00000105999_chaychinhendri.week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Legendary Weapon drop chance: ${ItemRarity.LEGENDARY.dropChance}%")
    val userSword = Weapon.forgeStarterSword()
    println("Your current $userSword")
}