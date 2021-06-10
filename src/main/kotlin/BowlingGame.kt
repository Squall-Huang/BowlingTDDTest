class BowlingGame {

    var list = mutableListOf<Int>()

    fun roll(pins: Int) {
        list.add(pins)
    }

    fun score(): Int {
        var score = 0
        var rollIndex = 0
        for (i in 1..10) {
            score += list[rollIndex] + list[rollIndex + 1]
            rollIndex += 2
        }
        return score
    }

}
