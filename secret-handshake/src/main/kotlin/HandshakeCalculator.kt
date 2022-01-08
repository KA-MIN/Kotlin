object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val result = mutableListOf<Signal>()

        if (number and 1 == 1) {
            result.add(Signal.WINK)
        }
        if (number and 2 == 2) {
            result.add(Signal.DOUBLE_BLINK)
        }
        if (number and 4 == 4) {
            result.add(Signal.CLOSE_YOUR_EYES)
        }
        if (number and 8 == 8) {
            result.add(Signal.JUMP)
        }
        if (number and 16 == 16) {
            return result.reversed()
        }

        return result;
    }
}
