package strategy

class ShareByEmail() : ShareBehavior {
    override fun share() {
        println("I'm sharing via email.")
    }
}