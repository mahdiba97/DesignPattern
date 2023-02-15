import adapter.DroneAdapter
import adapter.Duck
import adapter.MallardDuck
import adapter.SupperDrone
import decorator.coffe_shop.Beverage
import decorator.coffe_shop.beverages.DarkRoast
import decorator.coffe_shop.condiments.Mocha
import decorator.coffe_shop.condiments.Whip
import decorator.fast_food.Pizza
import decorator.fast_food.pizzas.ThinCrustPizza
import decorator.fast_food.toppings.Cheese
import decorator.fast_food.toppings.Olive
import decorator.fast_food.toppings.Peppers
import observer.weather.Alert
import observer.weather.Logger
import observer.weather.UserInterface
import observer.weather.WeatherStation
import strategy.BasicCameraApp
import strategy.CameraPlusApp
import strategy.ShareByEmail
import strategy.ShareByText

fun main() {
    println("--------Strategy--------")
    val cameraPlus = CameraPlusApp(ShareByEmail())
    val basicCameraApp = BasicCameraApp(ShareByText())
    cameraPlus.take()
    cameraPlus.save()
    cameraPlus.edit()
    basicCameraApp.edit()
    cameraPlus.performShare()
    basicCameraApp.performShare()

    println("--------Adapter--------")
    val supperDrone = SupperDrone()
    val droneAdapter = DroneAdapter(supperDrone)
    val mallardDuck = MallardDuck()
    setAdapter(mallardDuck)
    setAdapter(droneAdapter)

    println("--------Observer--------")
    val subject = WeatherStation()
    val observer1 = Logger(subject)
    val observer2 = UserInterface(subject)
    val observer3 = Alert { newValue ->
        println("Hello I'm Alert! ${newValue.first.title} : ${newValue.second}")
    }
    subject.observe(observer3)
    subject.setHumidity(37)
    subject.removeObserver(observer1)
    subject.setTemperature(18)
    subject.removeObserver(observer2)
    subject.setWindSpeed(20.4)

    println("--------Decorator--------")
    var beverage: Beverage = DarkRoast()
    beverage = Mocha(beverage)
    beverage = Mocha(beverage)
    beverage = Whip(beverage)
    println(beverage.getDescriptions() + " $" + beverage.cost())
    var pizza: Pizza = ThinCrustPizza()
    pizza = Cheese(pizza)
    pizza = Olive(pizza)
    pizza = Peppers(pizza)
    println(pizza.getDescriptions() + " $" + pizza.cost())
}


fun setAdapter(adapter: Duck) {
    adapter.quack()
    adapter.fly()
}

