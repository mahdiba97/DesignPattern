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
    println("--------Strategy--------")
}

