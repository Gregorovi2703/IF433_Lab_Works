package oop_00000105999_chaychinhendri.week06

fun main() {
    println("\n=== Instansiasi Smart Home Devices ===")
    val lampuRuangTamu = SmartLamp("L01", "Ruang Tamu")
    val speakerDapur = SmartSpeaker("S01", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("C01", "Ezviz Garasi")
    val hub = SmartHomeHub()
    hub.addDevice(lampuRuangTamu)
    hub.addDevice(speakerDapur)
    hub.addDevice(cctvGarasi)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}