package oop_00000105999_chaychinhendri.week07

fun processEvent(event: BattleState) {
    when(event) {
        is BattleState.SafeZone -> {
            println("Memasuki area damai. Kamu dapat memulihkan stamina sejenak.")
        }
        is BattleState.MonsterEncounter -> {
            println("Awas! Sesosok monster berjenis [${event.monsterName}] mendadak muncul menghadang!")
        }
        is BattleState.LootDropped -> {
            val (itemName, itemDamage, itemRarity) = event.item
            println("Hore! Monster menjatuhkan barang rampasan: $itemName (Dmg: $itemDamage, Rarity: $itemRarity)")
        }
        is BattleState.GameOver -> {
            println("Permainan Selesai! Karakter gugur karena: ${event.reason}")
        }
    }
}