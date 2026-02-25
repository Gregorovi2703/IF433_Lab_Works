package oop_00000105999_chaychinhendri.week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name sedang bekerja.")
    }
    open fun calculateBonus(): Int {
        return baseSalary * 10/100
    }
}