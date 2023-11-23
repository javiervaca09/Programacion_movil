package Clases

abstract class Travel {
    abstract val country: String
    abstract val city: String
    protected val serviceType = "viaje"
    protected var reserved = false
    protected var paidAmound = 0

    abstract fun quotePrice(numDays:Int)
    protected abstract fun getPrice(numDays: Int): Int

    fun reserve(numDays:Int) {
        if (reserved){
            println(""" ¡Ya reservaste tu viaje!
                pais:$country
                ciudad:$city
                precio:$paidAmound""".trimMargin())
            return
        }
        val amount= getPrice(numDays)
        if(amount==0){
            return
        }
        reserved = true
        paidAmound = amount
        println(""" ¡Viaje reservado exitosamente!
                pais:$country
                ciudad:$city
                precio:$paidAmound""".trimMargin())
    }
}