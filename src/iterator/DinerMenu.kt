package iterator

import iterator.data.MenuItem

class DinerMenu : Menu {
    private var items = mutableListOf<MenuItem>(MenuItem(1, "A", .9),
            MenuItem(2, "B", .3))

    override fun createIterator(): Iterator<MenuItem> {
        return DinerMenuIterator(items)
    }
}