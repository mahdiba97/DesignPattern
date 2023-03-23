package factory

interface Pizza {
    fun getPizzaName(): String
    fun prepare()
    fun bake()
    fun cut()
    fun box()
}