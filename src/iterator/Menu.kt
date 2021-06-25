package iterator

import iterator.data.MenuItem

interface Menu {
    fun createIterator(): Iterator<MenuItem>
}