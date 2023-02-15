package decorator.coffe_shop.beverages

import decorator.coffe_shop.Beverage

class DarkRoast : Beverage() {
    init {
        description = "Dark Roast Coffee"
    }
    override fun cost(): Double = .99
}
