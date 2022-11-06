package observer.weather

class UserInterface(
    weatherStation: WeatherStation
) : Observer {
    init {
        weatherStation.observe(this)
    }

    private var weatherData: Pair<LocalWeather, Double>? = null

    override fun update(value: Pair<LocalWeather, Double>) {
        weatherData = value
        display()
    }

    private fun display() {
        weatherData?.let {
            println("Hello I'm UserInterface! I get the new data...${it.first.title} : ${it.second}")
        }
    }
}