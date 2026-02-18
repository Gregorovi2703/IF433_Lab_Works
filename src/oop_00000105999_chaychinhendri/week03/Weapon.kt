package oop_00000105999_chaychinhendri.week03

class Weapon (
    val name: String,
    damage: Int
) {
    var damage: Int = damage
        set(value) {
            if (value < 0) {
                println("Damage can't be negative!")
            } else if (value > 1000) {
                println("Damage can't be greater than 1000! Damage will be set to 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}