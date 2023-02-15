package decorator.fast_food

abstract class Pizza {
    var description = "Unknown pizza"
    open fun getDescriptions() = description
    abstract fun cost(): Double
}