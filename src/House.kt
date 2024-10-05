import java.util.Calendar

open class House(
    private var houseNumber: Int,
    private var apartmentsNumber: Int,
    private var constructionYear: Int
) {
    public open fun getQuality(): Double {
        val calendar: Calendar = Calendar.getInstance()
        return (this.apartmentsNumber + 2 * (calendar.get(Calendar.YEAR) - this.constructionYear)).toDouble()
    }
}