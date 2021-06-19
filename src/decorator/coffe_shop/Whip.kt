package decorator.coffe_shop

class Whip(
        var beverage: Beverage
) : CondimentDecorator() {
    override fun descriptions(): String = beverage.descriptions() + ", Whip"
    override fun cost(): Double = beverage.cost() + .10
}