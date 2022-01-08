class Squares (var n: Int){

    fun sumOfSquares(): Int {
        return (1..n).sumOf { pow(it, 2) }
    }

    fun squareOfSum(): Int {
        val number = (1..n).fold(0) { acc, number -> acc + number }
        return pow(number, 2)
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }

    fun pow(base: Int, exp: Int): Int {
        if (exp < 0) {
            return 0
        } else if (exp < 1) {
            return 1
        } else {
            var result = base
            var e = 1
            if (e < exp) {
                result *= base
                e += 1
            }
            while (e < exp) {
                if (exp / 2 < e) {
                    result *= base
                    e += 1
                } else {
                    result *= result
                    e *= 2
                }
            }
            return result
        }
    }
}

fun main() {
    val s = Squares(1)
    for (i in -10..10) {
        println("$i ${s.pow(2, i)}")
    }
}