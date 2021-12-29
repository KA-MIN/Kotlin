object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        var count = 0;

        if(leftStrand.length != rightStrand.length){
            throw IllegalArgumentException("left and right strands must be of equal length.")
        }else{
            for(i in 0..leftStrand.length-1){
                if(leftStrand[i] != rightStrand [i]){
                    count++
                }
            }
        }
        return count
    }
}
