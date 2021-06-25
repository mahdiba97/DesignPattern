package iterator

import iterator.data.MenuItem

class Cafe(var dinerMenu: Iterator<MenuItem>) {
    fun printMenu() {
        while (dinerMenu.hasNex()){
            val menuItem = dinerMenu.next()
            println(menuItem?.name)
        }
    }
}