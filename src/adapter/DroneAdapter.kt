package adapter

import strategy.duckSimulator.Duck
import strategy.duckSimulator.FlyBehavior
import strategy.duckSimulator.QuackBehavior

class DroneAdapter(val drone: Drone):Duck(
        object : FlyBehavior {
            override fun fly() {
                drone.spin_rotors()
                drone.take_off()
            }
        }
,
        object : QuackBehavior {
            override fun quack() {
                drone.beep()
            }
        }
) {
    override fun display() {
        TODO("Not yet implemented")
    }
}