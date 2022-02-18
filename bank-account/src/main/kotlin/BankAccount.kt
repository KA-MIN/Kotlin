class BankAccount {

    var balance: Int = 0
        get() {
            if(closed){
                throw IllegalStateException()
            }
            return field
        }
    var closed = false

    init {
        if (closed) throw IllegalStateException()
    }

    fun adjustBalance(amount: Int): Int {
        if (closed) {
            throw IllegalStateException()
        }
        balance += amount
        return balance
    }

    fun close() {
        closed = true
    }
}