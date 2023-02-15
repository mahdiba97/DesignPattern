package decorator.fast_food.toppings

import decorator.fast_food.Pizza
import decorator.fast_food.ToppingDecorator

class Cheese(private var pizza: Pizza) : ToppingDecorator() {
    override fun getDescriptions() = pizza.getDescriptions() + ", Cheese"

    override fun cost() = pizza.cost() + .2
}