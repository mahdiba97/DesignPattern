package iterator

import iterator.data.MenuItem

class DinerMenuIterator(var menuItem: List<MenuItem>) : Iterator<MenuItem> {
    var position = 0
    override fun hasNex(): Boolean {
        return position < menuItem.size
    }

    override fun next(): MenuItem? {
        return if (hasNex()){
            menuItem[position++]
        }else null

    }

}