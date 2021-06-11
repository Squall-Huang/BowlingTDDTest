class BowlingGame {

    var list = mutableListOf<Int>()

    fun roll(pins: Int) {
        list.add(pins)
    }

    fun score(): Int {
        var score = 0
        var rollIndex = 0
        for (i in 1..10) {
            if (isStrike(rollIndex)) {
                score += strikeScore(rollIndex)
                rollIndex += 1
            } else if (isSpare(rollIndex)) {
                score += spareScore(rollIndex)
                rollIndex += 2
            } else {
                score += list[rollIndex] + list[rollIndex + 1]
                rollIndex += 2
            }
        }
        return score
    }

    private fun spareScore(rollIndex: Int) = 10 + list[rollIndex + 2]

    private fun isSpare(rollIndex: Int) = list[rollIndex] + list[rollIndex + 1] == 10

    private fun strikeScore(rollIndex: Int) = 10 + list[rollIndex + 1] + list[rollIndex + 2]

    private fun isStrike(rollIndex: Int) = list[rollIndex] == 10

}
