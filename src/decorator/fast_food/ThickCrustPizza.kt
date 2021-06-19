package decorator.fast_food

class ThickCrustPizza():Pizza() {
    override fun descriptions(): String = "Thick Crust Pizza"
    override fun cost(): Double = .99
}