package oop_00000105999_chaychinhendri.week01

fun main() {
    val gameTitle: String = "Split Fiction"
    val price: Int = 725000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)
    printReceipt(title = gameTitle, price = price, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price - (price * 20/100) else price - (price * 10/100)

//Saya buat menjadi Judul, Harga Asli, dan Harga Akhir karena di nomor 1b expected outputnya adalah 3 aspek tersebut
//Meskipun pada langkah 3 perintahnya adalah printReceipt(title: String, finalPrice: Int)
fun printReceipt(title: String, price: Int, finalPrice: Int, note: String?) {
    println("Judul      : $title")
    println("Harga Asli : Rp$price")
    println("Harga Akhir: Rp$finalPrice")
    println("Catatan    : ${note ?: "Tidak ada catatan"}")
}