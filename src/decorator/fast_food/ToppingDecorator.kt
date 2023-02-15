package decorator.fast_food

abstract class ToppingDecorator : Pizza() {
    abstract override fun getDescriptions(): String
}