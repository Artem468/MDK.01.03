fun main() {
    // Задача 11.34
    // В массиве хранятся сведения о количестве осадков, выпавших за каждый
    // день июня. Определить:
    // а) в какой период выпало больше осадков: в первую половину июня или во
    // вторую;
    // б) в какую декаду месяца выпало больше всего осадков
    task1134()

    // Задача 12.51
    // Дан двумерный массив. Определить:
    // а) среднее арифметическое элементов n-го столбца массива;
    // б) среднее арифметическое элементов первой строки массива.
    task1251()
}


fun task1134() {
    val days: Array<Int> = Array(30) { (0..30).random() }

    for (item in days) print("$item ")
    println()

    val firstPart = days.slice(0..14).sum()
    val secondPart = days.slice(15..29).sum()

    if (firstPart > secondPart) {
        println("В первую половину месяца выпало больше осадков")
    } else if (secondPart > firstPart) {
        println("Во вторую половину месяца выпало больше осадков")
    } else {
        println("Одинаково")
    }

    println(" ------------------------------------- ")

    val firstDecade = days.slice(0..9).sum()
    val secondDecade = days.slice(10..19).sum()
    val thirdDecade = days.slice(20..29).sum()

    if (firstDecade > secondDecade && firstDecade > thirdDecade) {
        println("В первую декаду месяца выпало больше")
    } else if (secondDecade > firstDecade && secondDecade > thirdDecade) {
        println("Во вторую декаду месяца выпало больше")
    } else if (thirdDecade > firstDecade && thirdDecade > secondDecade) {
        println("В третью декаду месяца выпало больше")
    }

}

fun task1251() {

    val rows = 10
    val columns = 10

    val arithmeticMean = (0..columns).random() // Номер столбца массива

    val matrix: Array<IntArray> = Array(rows) { IntArray(columns) { (0..50).random() } }
    for (item in matrix) {
        for (i in item) {
            print("$i ".padEnd(3))
        }
        println()
    }

    println()

    val arithmeticMeanColumn = matrix.sumOf { item -> item[arithmeticMean] } / rows
    val arithmeticMeanRow = matrix[0].sum() / columns
    println("Среднее арифметическое столбца $arithmeticMean (отсчет с 0) равно $arithmeticMeanColumn")
    println("Среднее арифметическое первой строки равно $arithmeticMeanRow")


}