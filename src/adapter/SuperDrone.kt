package adapter

class SuperDrone(): Drone {
    override fun beep() {
        println("Beep beep beep!")
    }

    override fun spin_rotors() {
        println("Rotors are spinning")
    }

    override fun take_off() {
        println("Taking off")
    }
}