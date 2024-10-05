import kotlin.math.pow
import kotlin.math.sqrt

open class Parallelepiped(
    private var length: Double,
    private var width: Double,
    private var height: Double
) {

    public fun getArea(): Double {
        return this.length * this.width * this.height
    }

    public fun getDiagonalLength(): Double {
        return sqrt(this.length.pow(2.0) + this.width.pow(2.0) + this.height.pow(2.0))
    }

}