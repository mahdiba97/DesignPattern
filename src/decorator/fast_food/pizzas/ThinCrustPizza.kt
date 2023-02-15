package decorator.fast_food.pizzas

import decorator.fast_food.Pizza

class ThinCrustPizza() : Pizza() {
    init {
        description = "Thin Crust Pizza"
    }

    override fun cost(): Double = .49
}
