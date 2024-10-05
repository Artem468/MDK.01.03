class HouseWithDistrict(
    houseNumber: Int,
    apartmentsNumber: Int,
    constructionYear: Int,
    private var district: District
) : House(houseNumber, apartmentsNumber, constructionYear) {

    public override fun getQuality(): Double {
        return if (district == District.Center) {
            super.getQuality() * 2
        } else {
            super.getQuality() * 0.5
        }
    }
}

enum class District {
    Center,
    Outskirts
}