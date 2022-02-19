import java.lang.invoke.MethodHandles

object BinarySearch {
     fun searchBinary(list: List<Int>, item: Int, startIndex: Int, endIndex: Int): Int {
        if (startIndex > endIndex) {
            throw NoSuchElementException()
        }
        val index = (startIndex + endIndex) / 2

        if (list[index] == item) {
            return index
        }
        if (list[index] > item) {
            return searchBinary(list, item, startIndex, index - 1)
        }
        return searchBinary(list, item, index + 1, endIndex)
    }

    fun search(list: List<Int>, item: Int) = searchBinary(list, item, 0, list.lastIndex)
}
