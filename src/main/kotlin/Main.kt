fun main() {
    println("Insert your ISO:")
    val iso = readLine()
    println("Iso: $iso")
    println("Insert your Distance:")
    val distance = readLine()
    println("Distance: $distance")
    println("Your aperture should be: ${calculateAperture(iso, distance)}")
}
