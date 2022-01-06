class Squares (var n : Int){

    fun sumOfSquares(): Int {
        var num = 0;
        if(n < 1){
            throw Exception()
        }else{
            for(i in 1..n){
                num += i*i
            }
            return num
        }
    }

    fun squareOfSum(): Int {
        var num = 0;
        if(n < 1){
            throw Exception()
        }else{
            for(i in 1..n){
                num += i
            }
            return num*num
        }
    }

    fun difference(): Int {
        return squareOfSum()- sumOfSquares()
    }

}