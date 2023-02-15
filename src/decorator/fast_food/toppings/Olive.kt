package decorator.fast_food.toppings

import decorator.fast_food.Pizza
import decorator.fast_food.ToppingDecorator

class Olive(private var pizza: Pizza) : ToppingDecorator() {
    override fun getDescriptions() = pizza.getDescriptions() + ", Olive"
    override fun cost() = pizza.cost() + .3
}