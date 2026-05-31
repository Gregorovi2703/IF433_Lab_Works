package oop_00000105999_chaychinhendri.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    override fun toString(): String {
        return "Weapon:\nName=${item.name}\nDamage=${item.damage}\nRarity=${item.rarity}\nDurability=$durability)"
    }

    companion object {
        fun forgeStarterSword(): Weapon {
            val starterWeapon = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterWeapon, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicWeapon = GameItem("Dragon Slayer", 50, ItemRarity.EPIC)
            return Weapon(epicWeapon, 150)
        }
    }
}