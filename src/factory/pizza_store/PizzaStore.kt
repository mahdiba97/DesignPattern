package factory.pizza_store

import factory.Pizza
import factory.pizza_type.PizzaType

abstract class PizzaStore {
    abstract fun createPizza(type: PizzaType): Pizza
    fun orderPizza(type: PizzaType): Pizza {
        val pizza = createPizza(type)
        println("Making a " + pizza.getPizzaName())
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}