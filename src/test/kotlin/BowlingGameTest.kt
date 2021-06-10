import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BowlingGameTest {

    @Test
    fun `all zero`() {
        val bowlingGame = BowlingGame()
        (1..20).forEach {
            bowlingGame.roll(0)
        }
        val score = bowlingGame.score()
        assertEquals(0,score)
    }
}