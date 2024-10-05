class MetalBar(
    length: Double,
    width: Double,
    height: Double,
    private var specificGravity: Double
) : Parallelepiped(length, width, height) {

    public fun getWeight(): Double {
        return specificGravity * this.getArea()
    }
}