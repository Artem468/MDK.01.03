fun main() {
    println(getMassive(25, 1200).joinToString(", "))
    println(getMassive(12, 100).joinToString(", "))
    println(getMassive(4, 333).joinToString(", "))
}

fun getMassive(k: Int, n: Int): List<Int> {

    val response: MutableList<Int> = mutableListOf();

    for (item in 0..n) {
        val numbers = item.toString().toList().map { it.toString().toInt() }
        if (numbers.sum() == k) {
            response.add(item)
        }
    }

    return response
}
