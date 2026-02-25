package oop_00000105999_chaychinhendri.week04

fun main() {
    println("--- Testing Manager ---")
    val manager = Manager("Gregor", 3600000)
    manager.work()
    println("Bonus ${manager.name} = Rp${manager.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val developer = Developer("Zansky", 2700000, "Kotlin")
    developer.work()
    println("Bonus ${developer.name} = Rp${developer.calculateBonus()}")
}