package oop_00000105999_chaychinhendri.week05

fun main() {
    println("=== PAYMENT METHOD TEST ===")

    val ew = EWallet("Gregor", 50000.0)
    val cc = CreditCard("Dwiky", 100000.0)

    val payments: List<PaymentMethod> = listOf(ew, cc)

    for (method in payments) {
        println("\n${method.accountName} mencoba bayar 75000")
        method.processPayment(75000.0)

        if (method is EWallet) {
            println("Top up otomatis 50000...")
            method.topUp(50000.0)
            method.processPayment(75000.0)
        }
    }
}