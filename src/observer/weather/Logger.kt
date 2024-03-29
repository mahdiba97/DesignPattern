package observer.weather

class Logger(
    weatherStation: WeatherStation
) : Observer {
    init {
        weatherStation.observe(this)
    }

    private var weatherData: Pair<LocalWeather, Double>? = null

    override fun update(value: Pair<LocalWeather, Double>) {
        weatherData = value
        log()
    }

    private fun log() {
        weatherData?.let {
            println("Hello I'm Logger! I get the new data...${it.first.title} : ${it.second}")
        }
    }
}