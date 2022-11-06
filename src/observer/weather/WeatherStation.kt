package observer.weather

import observer.weather.LocalWeather.*

class WeatherStation : Subject {
    private var observers: MutableList<Observer> = mutableListOf()
    private var temperature: Int = 0
    private var windSpeed: Double = 0.0
    private var humidity: Int = 0
    override fun observe(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun setWindSpeed(windSpeed: Double) {
        this.windSpeed = windSpeed
        notifyObserver(WIND_SPEED)
    }

    fun setHumidity(humidity: Int) {
        this.humidity = humidity
        notifyObserver(HUMIDITY)
    }

    fun setTemperature(temperature: Int) {
        this.temperature = temperature
        notifyObserver(TEMPERATURE)
    }


    override fun notifyObserver(type: LocalWeather) {
        val newValue = when (type) {
            WIND_SPEED -> Pair(type, windSpeed)
            HUMIDITY -> Pair(type, humidity.toDouble())
            TEMPERATURE -> Pair(type, temperature.toDouble())
        }
        for (observe in observers) {
            observe.update(newValue)
        }
    }
}