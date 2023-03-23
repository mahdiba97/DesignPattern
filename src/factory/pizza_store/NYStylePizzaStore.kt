package factory.pizza_store

import factory.pizza_type.PizzaType
import factory.pizza_type.nystylepizza.NYStyleCheesePizza
import factory.pizza_type.nystylepizza.NYStyleClamPizza
import factory.pizza_type.nystylepizza.NYStylePepperoniPizza
import factory.pizza_type.nystylepizza.NYStyleVeggiePizza

class NYStylePizzaStore : PizzaStore() {
    override fun createPizza(type: PizzaType) = when (type) {
        PizzaType.CHEESE -> NYStyleCheesePizza()
        PizzaType.VEGGIE -> NYStyleVeggiePizza()
        PizzaType.CLAM -> NYStyleClamPizza()
        PizzaType.PEPPERONI -> NYStylePepperoniPizza()
    }

}