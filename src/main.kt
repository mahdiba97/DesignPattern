import iterator.Cafe
import iterator.DinerMenu
import iterator.PancakeHouseMenu

fun main() {
//    val mallardDuck = MallardDuck()
//    mallardDuck.display()
//    mallardDuck.performFly()
//    mallardDuck.performQuack()
//    mallardDuck.swim()
//
//
//    val instagramCamera = InstagramCamera()
//    instagramCamera.take()
//    instagramCamera.save()
//    instagramCamera.edit()
//    instagramCamera.performShare()
//
//    val adapter = DroneAdapter(SuperDrone())
//    test(adapter)

//    val mySubject:ConcreteSubject = ConcreteSubject()
//    SimpleObserver(mySubject)
//    for (i in 0 until 10){
//        mySubject.setValue(readLine().toString())
//    }
//    val weatherStation = WeatherStation()
//    UserInterface(weatherStation)
//    Logger(weatherStation)
//    weatherStation.setValue(21.3, 11, 37)
//}
//
//fun test(duck: Duck){
//    duck.performFly()
//    duck.performQuack()

//    var beverage: Beverage = DarkRoast()
//    beverage = Whip(beverage)
//    beverage = Whip(beverage)
//    println(beverage.descriptions() + "\n$${beverage.cost()}")
//    println()
//    var pizza: Pizza = ThickCrustPizza()
//    pizza = Olive(pizza)
//    pizza = Cheese(pizza)
//    pizza = Peppers(pizza)
//    println(pizza.descriptions() + "\n$${pizza.cost()}")

    val dinerMenu = DinerMenu().createIterator()
    val pancakeHouseMenu = PancakeHouseMenu().createIterator()
    var cafe = Cafe(dinerMenu)
    cafe.printMenu()
    cafe = Cafe(pancakeHouseMenu)
    cafe.printMenu()
}

