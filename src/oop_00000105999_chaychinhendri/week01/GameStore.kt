package oop_00000105999_chaychinhendri.week01

fun main() {
    val gameTitle: String = "Split Fiction"
    val price: Int = 725000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price - (price * 20/100) else price - (price * 10/100)