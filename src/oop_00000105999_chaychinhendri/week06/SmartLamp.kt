package oop_00000105999_chaychinhendri.week06

class SmartLamp(
    override val id: String,
    override val name: String
): SmartDevice, Switchable {
    override fun turnOn() {
        println("$name Lamp dinyalakan.")
    }

    override fun turnOff() {
        println("$name Lamp dimatikan.")
    }
}