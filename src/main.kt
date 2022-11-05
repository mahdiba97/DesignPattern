import adapter.DroneAdapter
import adapter.Duck
import adapter.MallardDuck
import adapter.SupperDrone
import strategy.BasicCameraApp
import strategy.CameraPlusApp
import strategy.ShareByEmail
import strategy.ShareByText

fun main() {
    println("--------Strategy--------")
    val cameraPlus = CameraPlusApp(ShareByEmail())
    val basicCameraApp = BasicCameraApp(ShareByText())
    cameraPlus.take()
    cameraPlus.save()
    cameraPlus.edit()
    basicCameraApp.edit()
    cameraPlus.performShare()
    basicCameraApp.performShare()
    println("--------Adapter--------")
    val supperDrone = SupperDrone()
    val droneAdapter = DroneAdapter(supperDrone)

    val mallardDuck = MallardDuck()
    setAdapter(mallardDuck)
    setAdapter(droneAdapter)
}


fun setAdapter(adapter: Duck) {
    adapter.quack()
    adapter.fly()
}

