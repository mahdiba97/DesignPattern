package observer.weather

interface Subject {
    fun observe(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObserver(type:LocalWeather)
}