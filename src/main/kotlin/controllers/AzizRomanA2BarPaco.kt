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



//        if (numPersonesDins < capacitat) {
//            numPersonesDins++
//            println("$nomPersona ha entrat al bar. Persones dins: $numPersonesDins/$capacitat")
//        } else {
//            println("El bar està ple. $nomPersona no pot entrar.")
//        }
//    }

//        fun sortir(nomPersona: String) {
//            if (numPersonesDins > 0) {
//                numPersonesDins--
//                println("$nomPersona ha sortit del bar. Persones dins: $numPersonesDins/$capacitat")
//            } else {
//                println("No hi ha ningú dins del bar, així que $nomPersona no pot sortir.")
//            }
//        }
//    }