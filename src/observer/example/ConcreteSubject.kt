package observer.example

class ConcreteSubject(

) : Subject {
    private val observer: MutableList<Observer> = mutableListOf()
    private var value: String = ""
    override fun registerObserver(o: Observer) {
        observer.add(o)
    }

    override fun removeObserver(o: Observer) {
        TODO("Not yet implemented")
    }

    override fun notifyObserver() {
        for (i in observer) {
            i.update(value)
        }
    }

    fun setValue(value: String) {
        this.value = value
        notifyObserver()
    }

}