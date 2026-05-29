package oop_00000105999_chaychinhendri.week06

class SmartCCTV(
    override val id: String,
    override val name: String
): SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("$name CCTV aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("$name CCTV dinonaktifkan.")
        stopRecord()
    }

    override fun startRecord() {
        println("Perekaman dimulai...")
    }
}