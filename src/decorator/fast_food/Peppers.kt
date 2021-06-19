package decorator.fast_food

class Peppers (var pizza: Pizza):ToppingDecorator() {
    override fun descriptions() = "${pizza.descriptions()}, Peppers "
    override fun cost() = pizza.cost() + .1
}