package iterator

import iterator.data.MenuItem

class PancakeHouseMenu:Menu {
    private val menuItem = ArrayList<MenuItem>()
    init {
        menuItem.add(MenuItem(22, "cc", 4.5))
        menuItem.add(MenuItem(22, "dd", 4.5))
        menuItem.add(MenuItem(22, "bb", 4.5))
    }
    override fun createIterator(): Iterator<MenuItem> {
        return PancakeHouseIterator(menuItem)
    }
}