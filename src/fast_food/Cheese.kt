package fast_food

class Cheese(var pizza: Pizza):ToppingDecorator() {
    override fun descriptions() = "${pizza.descriptions()}, Cheese "
    override fun cost() = pizza.cost() + .2
}