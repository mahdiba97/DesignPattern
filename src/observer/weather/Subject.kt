package observer.weather

interface Subject {
    fun registerObserver(o:Observer)
    fun notifyObserver()
}