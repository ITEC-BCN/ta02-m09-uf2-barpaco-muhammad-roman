package controllers

import kotlin.random.Random

class AzizRomanA2AccessControl {
    fun iniciarAplicacio() {
        val bar = AzizRomanA2BarPaco(4)

        val numPersones = 10
        val persones = mutableListOf<Thread>()

        for (i in 1..numPersones) {
            val nomPersona = "Persona $i"
            val persona = AzizRomanA2Persona(nomPersona, bar)
            val threadPersona = Thread(persona)
            persones.add(threadPersona)
        }

        persones.forEach { it.start() }
        persones.forEach { it.join() }
    }
}
