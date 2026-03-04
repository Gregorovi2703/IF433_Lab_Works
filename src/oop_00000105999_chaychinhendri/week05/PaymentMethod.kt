package oop_00000105999_chaychinhendri.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}