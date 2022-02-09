object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        val v1 = phrase.toLowerCase()
                .split(Regex("[^a-z'\\d]+"))

        var v2 = v1.filterNot { it.isEmpty() }
                .map { it.trim('\'') }
                .groupingBy { it }.eachCount() as HashMap<String, Int>
        return v2
    }
}


