package observer.weather

class Alert(
    val value: (Pair<LocalWeather, Double>) -> Unit
) : Observer {

    private var weatherData: Pair<LocalWeather, Double>? = null

    override fun update(value: Pair<LocalWeather, Double>) {
        weatherData = value
        alert()
    }

     fun alert() {
        weatherData?.let {
            value(it)
        }
    }
}