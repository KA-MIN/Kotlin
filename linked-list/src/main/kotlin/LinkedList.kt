class Deque<T> {

    val list = mutableListOf<T>()

    fun push(value: T) {
        list.add(value)
    }

    fun pop(): T? {
        return list.removeLast()
    }

    fun unshift(value: T) {
        list.add(0, value)
    }

    fun shift(): T? {
        return list.removeFirst()
    }
}
