package oop_00000105999_chaychinhendri.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var baseDamage: Int

    println("------ GREGOR COMPANY ------")
    println("FACE THE LUST, SAVE THE LOVE")
    println("")

    print("Luster Name: ")
    val name = scanner.nextLine()

    do {
        print("Base Damage (Max 20): ")
        baseDamage = scanner.nextInt()
        if (baseDamage <= 0 || baseDamage > 20) println("Please choose 1 to 20!")
    } while (baseDamage <= 0 || baseDamage > 20)

    scanner.nextLine()

    val luster = Hero(name, baseDamage)
    var enemyHp: Int = 100
    var choice: Int

    println("")
    println("")
    println("In a world consumed by lust, you, ${luster.name}, were chosen to purify the corruption.")
    println("Yet, here you are now, standing before your enemy - the Lord of Desire himself.")
    println("")

    while(luster.isAlive() && enemyHp > 0) {
        println("")
        println("Lord of Desire ($enemyHp/100)")
        println("${luster.name} (${luster.hp}/100)")
        println("--- Available Actions ---")
        println("1. Attack")
        println("2. Retreat")

        do {
            print("Choose Action (1/2): ")
            choice = scanner.nextInt()
            scanner.nextLine()

            if (choice == 1) {
                luster.attack()
                enemyHp -= baseDamage
                if (enemyHp < 0) enemyHp = 0
                luster.takeDamage((1..20).random())
            } else if (choice != 2){
                println("Please choose 1 or 2!")
                println("")
            }

        } while (choice != 1 && choice != 2)

        if (choice == 2) {
            println("")
            println("${luster.name} chose to retreat.")

            if (enemyHp > luster.hp) {
                println("It seems that Lord of Desire had the upper hand. It was a good choice to retreat!")
                println("You lost the battle but you are alive. The End?")
            } else if (luster.hp > enemyHp) {
                println("It seems that ${luster.name} had the upper hand. It was a bad choice to retreat...")
                println("You win the battle but Lord of Desire is still alive. Game Over?")
            } else {
                println("It seems that no one attacked. Are you scared?")
                println("Tie.")
            }

            break
        }
    }

    if (enemyHp == 0) {
        println("You have slain the Lord of Desire, Congratulations!")
        println("The world has purified thanks to you, ${luster.name}!")
        println("THE END")
    } else if (luster.hp == 0) {
        println("You have fallen into the Lord's temptation!")
        println("The world fell into darkness because of your lost, ${luster.name}...")
        println("GAME OVER")
    }
}