fun main() {
    val parallelepiped = Parallelepiped(2.0, 3.0, 4.0)
    println("Площадь параллелепипеда: ${parallelepiped.getArea()}")
    println("Длина диагонали: ${parallelepiped.getDiagonalLength()}")

    println("\n--------------------------\n")

    val metalBar = MetalBar(2.0, 3.0, 4.0, 4.5)
    println("Площадь металлического бруса: ${metalBar.getArea()}")
    println("Длина диагонали металлического бруса: ${metalBar.getDiagonalLength()}")
    println("Вес металлического бруса: ${metalBar.getWeight()}")

    println("\n--------------------------\n")

    val house = House(2, 100, 2000)
    val houseWithDistrictInCenter = HouseWithDistrict(2, 100, 2000, District.Center)
    val houseWithDistrictInOutskirts = HouseWithDistrict(2, 100, 2000, District.Outskirts)
    println("Дом Q = ${house.getQuality()}")
    println("Дом в центре Q = ${houseWithDistrictInCenter.getQuality()}")
    println("Дом на окраине Q = ${houseWithDistrictInOutskirts.getQuality()}")
}