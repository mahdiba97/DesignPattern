package observer.weather

class Logger(var weatherStation:WeatherStation
):Observer {
    init {
        weatherStation.registerObserver(this)
    }
    private val any: MutableList<Any?> = mutableListOf()
    override fun update(windSpeed: Double, humidity: Int, temperature: Int) {
        any.add(windSpeed)
        any.add(humidity)
        any.add(temperature)
        log()
    }

    private fun log(){
        println("This message is from logger")
        println("Wind: ${any[0]} km/h \tHumidity: ${any[1]}% \tTemperature: ${any[2]} C")
    }
}