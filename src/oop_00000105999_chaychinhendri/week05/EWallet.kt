package oop_00000105999_chaychinhendri.week05

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Payment success. Saldo: $balance")
        } else {
            println("Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up success. Saldo: $balance")
    }
}