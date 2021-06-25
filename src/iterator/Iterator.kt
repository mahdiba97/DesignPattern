package iterator

import iterator.data.MenuItem

interface Iterator<T> {
    fun hasNex():Boolean
    fun next(): MenuItem?
}