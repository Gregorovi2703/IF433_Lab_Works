package oop_00000105999_chaychinhendri.week02

class Hero (
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack() {
        println("")
        println("$name used Dragon Slash on Lord of Desire!")
        println("Lord of Desire has taken $baseDamage damage!")
    }
    fun takeDamage(damage: Int) {
        println("")
        println("Lord of Desire used Arousal on $name!")
        println("$name has taken $damage damage!")
        println("")
        hp -= damage
        if (hp < 0) hp = 0
    }
    fun isAlive(): Boolean = hp > 0
}