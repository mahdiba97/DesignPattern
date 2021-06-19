package fast_food

class Olive(var pizza: Pizza) : ToppingDecorator() {
    override fun descriptions() = "${pizza.descriptions()}, Olive "
    override fun cost() = pizza.cost() + .3
}