package decorator.coffe_shop.condiments

import decorator.coffe_shop.Beverage
import decorator.coffe_shop.CondimentDecorator

class Whip(
    private var beverage: Beverage
) : CondimentDecorator() {
    override fun getDescriptions() = beverage.getDescriptions() + ", Whip"
    override fun cost(): Double = beverage.cost() + .10
}