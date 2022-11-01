package strategy

abstract class PhoneCameraApp(
    private val share: ShareBehavior
) {
    abstract fun edit()
    fun take() {
        println("I'm taking a photo...")
    }

    fun save() {
        println("I'm Saving the photo...")
    }

    fun performShare() {
        share.share()
    }
}