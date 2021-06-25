package iterator

import iterator.data.MenuItem

class PancakeHouseIterator(private val items: List<MenuItem>) : Iterator<MenuItem> {
    var position = 0
    override fun hasNex(): Boolean {
        return position < items.size
    }

    override fun next(): MenuItem? {
        return if (hasNex()) items[position++]
        else null
    }
}