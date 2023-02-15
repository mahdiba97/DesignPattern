package decorator.fast_food.toppings

import decorator.fast_food.Pizza
import decorator.fast_food.ToppingDecorator

class Peppers(private var pizza: Pizza) : ToppingDecorator() {
    override fun getDescriptions() = pizza.getDescriptions() + ", Peppers"
    override fun cost() = pizza.cost() + .1
}