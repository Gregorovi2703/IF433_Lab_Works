package oop_00000105999_chaychinhendri.week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Legendary Weapon drop chance: ${ItemRarity.LEGENDARY.dropChance}%")
    val userSword = Weapon.forgeStarterSword()
    println("Your current $userSword")

    val upgradedSword = userSword.item.copy(damage = 15)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedSword))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}