package strategy

class ShareByText() : ShareBehavior {
    override fun share() {
        println("I'm Sharing via Text.")
    }
}