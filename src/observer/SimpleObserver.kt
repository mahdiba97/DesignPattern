package observer

class SimpleObserver(
        var subject:ConcreteSubject
):Observer {
    private var value = mutableListOf<String>()
    init {
        val subject = subject
        subject.registerObserver(this)

    }
    override fun update(value: String) {
        this.value.add(value)
        display()
    }
    private fun display(){
        if (value.size >= 5) {
            for (i in value)
                println("$i \n")
        }
    }
}