package oop_00000105999_chaychinhendri.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generateVehicle = Vehicle("Sepeda Onthel")
    generateVehicle.honk()
    generateVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Tesla", 4, 80)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()
}