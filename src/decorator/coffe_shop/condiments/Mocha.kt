package decorator.coffe_shop.condiments

import decorator.coffe_shop.Beverage
import decorator.coffe_shop.CondimentDecorator

class Mocha(
    private var beverage: Beverage
) : CondimentDecorator() {
    override fun getDescriptions() = beverage.getDescriptions() + ", Mocha"
    override fun cost(): Double = beverage.cost() + .20
}