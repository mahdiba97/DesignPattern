package weather

class UserInterface(
        var weatherStation: WeatherStation
) : Observer {
    init {
        weatherStation.registerObserver(this)
    }
    private val any: MutableList<Any?> = mutableListOf()
    override fun update(windSpeed: Double, humidity: Int, temperature: Int) {
        any.add(windSpeed)
        any.add(humidity)
        any.add(temperature)
        display()
    }

    private fun display() {
        println("This message is from userInterface")
        println("Wind: ${any[0]} km/h \nHumidity: ${any[1]}% \nTemperature: ${any[2]} C")
    }
}