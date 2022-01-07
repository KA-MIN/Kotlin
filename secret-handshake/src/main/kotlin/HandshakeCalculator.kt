object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val result = mutableListOf<Signal>()

        if (number % 2 == 1) {
            result.add(Signal.WINK)
        }
        if (number % 4 > 1) {
            result.add(Signal.DOUBLE_BLINK)
        }
        if (number % 8 > 3) {
            result.add(Signal.CLOSE_YOUR_EYES)
        }
        if (number % 16 > 7) {
            result.add(Signal.JUMP)
        }
        if (number % 32 > 15) {
            return result.reversed()
        }

        return result;
    }
}
