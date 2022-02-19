object Pangram {

    fun isPangram(input: String): Boolean {
        var alphabet: String = "abcdefghijklmnopqrstuvwxyz"

        for(char in alphabet){
            if(!input.toLowerCase().contains(char)) return false
        }
        return true
    }
}
