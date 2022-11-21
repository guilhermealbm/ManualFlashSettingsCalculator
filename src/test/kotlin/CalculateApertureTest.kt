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

}