package strategy.duckSimulator

class MallardDuck(): Duck(
        object : FlyWithWings() {
            override fun fly() {
                super.fly()
            }
        }
,
object : Quack() {
    override fun quack() {
        super.quack()
    }
}) {
    override fun display() {
        println("I'm a real Mallard duck!")

    }
}