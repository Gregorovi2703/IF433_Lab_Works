package oop_00000105999_chaychinhendri.week05

fun main() {
    println("=== MATH HELPER TEST ===")

    val math = MathHelper()

    println("Luas Persegi (4 x 4): ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang (4 x 5): ${math.hitungLuas(4, 5)}")
    println("Luas Lingkaran (r = 7): ${math.hitungLuas(7.0)}")
}