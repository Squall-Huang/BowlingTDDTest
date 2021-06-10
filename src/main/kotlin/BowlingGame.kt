class BowlingGame {

    var list = mutableListOf<Int>()

    fun roll(pins: Int) {
        list.add(pins)
    }

    fun score(): Int {
        return list.sum()
    }

}
