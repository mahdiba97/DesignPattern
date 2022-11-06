package observer.weather

interface Observer {
    fun update(value: Pair<LocalWeather, Double>)
}