package adapter

class DroneAdapter(private val drone: Drone) : Duck {
    override fun quack() {
        drone.beep()
    }

    override fun fly() {
        drone.takeOff()
        drone.spinRotors()
    }
}