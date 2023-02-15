package decorator.fast_food.pizzas

import decorator.fast_food.Pizza

class ThickCrustPizza() : Pizza() {
    init {
        description = "Thick Crust Pizza"
    }

    override fun cost(): Double = .99
}