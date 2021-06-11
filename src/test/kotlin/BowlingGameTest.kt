import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BowlingGameTest {
    val bowlingGame = BowlingGame()

    @Test
    fun `all zero`() {
        rolls(20, 0)

        scoreShouldBe(0)
    }

    @Test
    fun `all three`() {
        rolls(20, 3)

        scoreShouldBe(60)
    }

    @Test
    fun `one spare`() {
        rolls(1, 3)
        rolls(1, 7)
        rolls(18, 3)

        scoreShouldBe(67)
    }

    @Test
    fun `one strike`() {
        rolls(1, 10)
        rolls(18, 3)

        scoreShouldBe(70)
    }

    private fun scoreShouldBe(score: Int) {
        assertEquals(score, bowlingGame.score())
    }

    private fun rolls(rollNumber: Int, pins: Int) {
        (1..rollNumber).forEach {
            bowlingGame.roll(pins)
        }
    }
}