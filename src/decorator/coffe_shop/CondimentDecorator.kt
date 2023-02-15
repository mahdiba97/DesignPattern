package decorator.coffe_shop

abstract class CondimentDecorator : Beverage() {
     abstract override fun getDescriptions(): String
}