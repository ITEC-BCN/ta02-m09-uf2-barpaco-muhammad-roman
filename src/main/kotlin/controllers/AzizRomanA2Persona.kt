package controllers

import kotlin.random.Random


class AzizRomanA2Persona(private val nom: String, private val bar: AzizRomanA2BarPaco) : Runnable {
    override fun run() {
        val tempsVoltes = Random.nextLong(1000, 5000)


        Thread.sleep(tempsVoltes)

        bar.entrar(nom)

        val tempsDins = Random.nextLong(1000, 5000)
        Thread.sleep(tempsDins)

        bar.sortir(nom)
    }
}
