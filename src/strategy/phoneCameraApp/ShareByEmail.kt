package strategy.phoneCameraApp

open class ShareByEmail(): ShareBehavior {
    override fun share() {
        println("Share by Email")
    }
}