import kotlin.test.Test
import kotlin.test.assertEquals

class CalculateApertureTest {

    @Test
    fun convertIsoTest100() {
        val iso = convertIso("100")
        assertEquals(iso, ISO.I100)
        assertEquals(iso.index, 2)
    }

    @Test
    fun convertIsoTest200() {
        val iso = convertIso("200")
        assertEquals(iso, ISO.I200)
        assertEquals(iso.index, 3)
    }

    @Test
    fun convertIsoTestFallback() {
        val iso = convertIso("1")
        assertEquals(iso, ISO.I100)
        assertEquals(iso.index, 2)
    }

    @Test
    fun convertDistanceExact() {
        val distance = convertDistance("2.5")
        assertEquals(distance, 2.5)
    }

    @Test
    fun convertDistanceFloor() {
        val distance = convertDistance("2.6")
        assertEquals(distance, 2.5)
    }

    @Test
    fun convertDistanceCeil() {
        val distance = convertDistance("3.4")
        assertEquals(distance, 3.5)
    }

    @Test
    fun convertDistanceFail() {
        val distance = convertDistance("abc")
        assertEquals(distance, null)
    }

    @Test
    fun convertDistanceNull() {
        val distance = convertDistance(null)
        assertEquals(distance, null)
    }

}