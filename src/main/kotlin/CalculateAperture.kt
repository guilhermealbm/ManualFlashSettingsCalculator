import kotlin.math.abs

val distances = listOf(1.2, 1.8, 2.5, 3.5, 5.0, 7.0)

fun calculateAperture(iso_: String?, distance_: String?) : String {
    val iso = convertIso(iso_)
    val distance = convertDistance(distance_)
    distance?.let {
        return ""
    } ?: run {
        return "Unable to convert distance."
    }
}

fun convertDistance(distance_: String?) : Double? =
    distance_?.toDouble()?.let {
        distances.closestValue(it)
    } ?: run {
        null
    }

private fun List<Double>.closestValue(value: Double) = minByOrNull { abs(value - it) }

fun convertIso(iso: String?) : ISO =
    when(iso?.trim()) {
        "25" -> ISO.I25
        "50" -> ISO.I50
        "100" -> ISO.I100
        "200" -> ISO.I200
        "400" -> ISO.I400
        "800" -> ISO.I800
        "1000" -> ISO.I1000
        else -> ISO.I100
    }

enum class ISO(val index: Int) {
    I25(0),
    I50(1),
    I100(2),
    I200(3),
    I400(4),
    I800(5),
    I1000(6)
}
