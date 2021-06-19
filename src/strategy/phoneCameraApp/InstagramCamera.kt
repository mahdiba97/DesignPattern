package strategy.phoneCameraApp

class InstagramCamera():PhoneCamera(
        object : ShareByEmail() {
            override fun share() {
                super.share()
            }
        }
){
    override fun edit() {
        println("I wanna edit this way")
    }
}