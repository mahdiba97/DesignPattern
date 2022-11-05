package adapter

class SupperDrone : Drone {
    override fun beep() {
        println("Beep beep beep!")
    }

    override fun spinRotors() {
        println("Rotors are spinning!")
    }

    override fun takeOff() {
        println("Taking off!")
    }
}