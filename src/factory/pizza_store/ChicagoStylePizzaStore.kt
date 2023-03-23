package factory.pizza_store

import factory.pizza_type.PizzaType
import factory.pizza_type.chicagostylepizza.ChicagoStyleCheesePizza
import factory.pizza_type.chicagostylepizza.ChicagoStyleClamPizza
import factory.pizza_type.chicagostylepizza.ChicagoStylePepperoniPizza
import factory.pizza_type.chicagostylepizza.ChicagoStyleVeggiePizza

class ChicagoStylePizzaStore : PizzaStore() {
    override fun createPizza(type: PizzaType) = when (type) {
        PizzaType.CHEESE -> ChicagoStyleCheesePizza()
        PizzaType.VEGGIE -> ChicagoStyleVeggiePizza()
        PizzaType.CLAM -> ChicagoStyleClamPizza()
        PizzaType.PEPPERONI -> ChicagoStylePepperoniPizza()
    }
}