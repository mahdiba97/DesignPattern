package strategy.duckSimulator

abstract class Duck(
        private val flyBehavior: FlyBehavior,
        private val quackBehavior: QuackBehavior
) {
    abstract fun display()
    fun performFly(){
        flyBehavior.fly()
    }
    fun performQuack(){
        quackBehavior.quack()
    }

    fun swim(){
        println("All ducks float")
    }
}