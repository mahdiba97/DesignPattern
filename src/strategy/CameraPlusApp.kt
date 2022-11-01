package strategy

class CameraPlusApp(shareBehavior: ShareBehavior):PhoneCameraApp(shareBehavior) {
    override fun edit() {
        println("I'm editing by a professional editor...")
    }
}