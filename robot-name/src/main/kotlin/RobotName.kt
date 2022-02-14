import java.util.Random

class Robot {

    val name: String
        get() = randomName()

    fun reset() = randomName()

    fun randomName(): String {
        var random = Random()
        var temp = 'A' + random.nextInt('Z' - 'A')
        var temp2 = 'A' + random.nextInt('Z' - 'A')
        var number = random.nextInt((999-100)+1)

        var result = temp.plus(temp2.toString()).plus(number)

        return result
    }
}