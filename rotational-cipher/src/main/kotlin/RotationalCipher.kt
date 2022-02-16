class RotationalCipher {

    var i: Int

    constructor(key: Int)  {
        i= key
    }
    fun encode(sentance: String): String = sentance.map {
        when(it){
            in 'a'..'z' -> 'a' + (((it + i) - 'a') % 26)
            in 'A'..'Z'-> 'A' + (((it + i) - 'A') % 26)
            else -> it
        }
    }.joinToString ("")
}


