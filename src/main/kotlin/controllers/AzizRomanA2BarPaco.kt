package controllers
class AzizRomanA2BarPaco(private val capacitat: Int) {
    private var numPersonesDins = 0

    @Synchronized
    fun entrar(nomPersona: String) {
        while (numPersonesDins >= capacitat) {
            try {
                println("El par esta ple la persona $nomPersona no pot entrar")
                (this as Object).wait()
            } catch (e: InterruptedException) {
                Thread.currentThread().interrupt()
            }
        }
        numPersonesDins++
        println("La persona $nomPersona ha entrat, hi ha $numPersonesDins persones dins")
    }
    @Synchronized
    fun sortir(nomPersona: String){
        numPersonesDins--
        println("La persona $nomPersona ha sortit, hi queden $numPersonesDins persones dins")

    }
}
