class Matrix(matrixAsString: String) {

    private val matrix : List<List<Int>>

    init {
        val v1 = matrixAsString.split("\n")
        val v2 = mutableListOf<List<Int>>()


        for (line in v1) {
            //정규식
            val v3 = line.split(" ").filter { it.isNotEmpty() }
            val v4 = mutableListOf<Int>()
            for (number in v3) {
                v4.add(number.toInt())
            }
            v2.add(v4)

        }
        this.matrix = v2
        println(this.matrix)
    }

    fun column(colNr: Int): List<Int> {
        return matrix.map { it[colNr - 1] }
    }

    fun row(rowNr: Int): List<Int> {
        return matrix[rowNr-1]
    }
}
