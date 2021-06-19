package strategy.phoneCameraApp

abstract class PhoneCamera(
        private val shareBehavior: ShareBehavior
) {
    abstract fun edit()

    fun performShare() {
        shareBehavior.share()
    }

    fun take() {
        println("I can take a photo")

    }

    fun save() {
        println("Saving photo")
    }
}