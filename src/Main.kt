fun main() {
    val data: List<Int> = listOf(1, 2, 3, 3, 5, 5, 7, 7, 9, 1)
    println(deleteDuplicates(data))

    val data1: List<Int> = listOf(1, 2, 3, 4, 5, 5, 4, 3, 2, 1)
    println(toSet(data1))
    val data2: String = "qwertyqwerty"
    println(toSet(data2))

    val mapMatryoshka = mapOf(
        "1" to mapOf(
            "2.5" to mapOf(
                "3+4i" to mapOf(
                    "[]" to mapOf(
                        "(42,)" to "Ok!"
                    )
                )
            )
        )
    )

    println(mapMatryoshka.get("1")?.get("2.5")?.get("3+4i")?.get("[]")?.get("(42,)"))

}

fun <T> deleteDuplicates(data: List<T>): List<T> {
    return data.toSet().toList()
}

fun toSet(data: String): SetData<Char> {
    val dataSet = data.toSet()
    return SetData(dataSet, dataSet.size)
}

fun toSet(data: List<Int>): SetData<Int> {
    val dataSet = data.toSet()
    return SetData(dataSet, dataSet.size)
}

data class SetData<T>(val data: Set<T>, val power: Int)