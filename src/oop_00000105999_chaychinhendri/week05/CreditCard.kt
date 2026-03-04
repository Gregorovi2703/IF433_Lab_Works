package oop_00000105999_chaychinhendri.week05

class CreditCard(accountName: String, val limit:Double): PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if ((usedAmount + amount) <= limit) {
            usedAmount += amount
            println("Transaction success.")
        } else {
            println("Transaction denied. Limit reached")
        }
    }
}