package oop_00000105999_chaychinhendri.week03

class Player (
    val username: String
) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    public fun addXp (amount: Int) {
        if (amount < 0) {
            println("XP harus bernilai positif!")
            return
        }

        val oldLevel = this.level
        xp += amount
        val newLevel = this.level

        if (newLevel > oldLevel) {
            println("Level up! Selamat $username naik ke level $level")
        }
    }
}