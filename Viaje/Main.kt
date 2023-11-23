import Clases.National
import Clases.NationalLowSeason
import Clases.Movie
import Clases.Vehicle

fun main() {
    val scaryMovie= Movie ("scaryMovie", "Comedia", 88.27)

    println(scaryMovie)
    scaryMovie.createdAt = "2000"
    println(scaryMovie.component1())
    println(scaryMovie.createdAt)
    val (name2,gender2,duration2) = scaryMovie
    println("Nuevas Variables $name2 $gender2 $duration2")
    val scaryMovie2= scaryMovie.copy(name="scaryMovie2", duration=83.0)
    println("""
        scaryMovie: $scaryMovie
        scaryMovie2: $scaryMovie2
        """.trimIndent())
val VehicleInstance = Vehicle.create()

    val suma = {a: Int, b: Int -> a+b}
    val saverGrade: (Double,Double) -> String = { expected: Double, saved: Double ->
        val percentage = saved / expected

        when {
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "Aprendiz saver"
        }
    }
println(saverGrade(100.0,120.0))


    val saverGrade2 = fun(expected:Double, saved:Double): String{
        val percentage = saved / expected
        return when {
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "aprendiz saver"
        }
    }
    println(saverGrade2(100.0,70.0))

fun sumaOrdenSuoerior(a: Int, b: Int, suma:(Int, Int) -> Int): Int {
    return suma(a,b)

}
    println(sumaOrdenSuoerior(4 , 5, suma))

}
