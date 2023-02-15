package decorator.coffe_shop

abstract class Beverage {
    var description = "Unknown Beverage"
    open fun getDescriptions() = description
    abstract fun cost():Double
}