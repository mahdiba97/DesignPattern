package observer.weather

interface Observer {
    fun update(windSpeed:Double, humidity:Int, temperature:Int)
}