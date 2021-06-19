package weather

class WeatherStation() : Subject {
    var observers: MutableList<Observer> = mutableListOf()
    private var temperature: Int = 0
    private var windSpeed: Double = 0.0
    private var humidity: Int = 0
    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    fun setValue(windSpeed: Double, humidity: Int, temperature: Int) {
        this.windSpeed = windSpeed
        this.humidity = humidity
        this.temperature = temperature
        notifyObserver()
    }


    override fun notifyObserver() {
        for (observe in observers) {
            observe.update(windSpeed, humidity, temperature)
        }
    }
}