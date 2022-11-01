package strategy

class BasicCameraApp(shareBehavior: ShareBehavior):PhoneCameraApp(shareBehavior) {
    override fun edit() {
        println("I'm editing by basic editor app...")
    }
}