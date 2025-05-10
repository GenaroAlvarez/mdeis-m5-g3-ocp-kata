package kata3.legacy

class TaxCalculator(val countryCode: CountryCode, private val income: Double) {
    private val usTax = .24
    private val ukTax = .20

    fun calculateUsTax(): Double {
        return usTax * income
    }

    fun calculateUkTax(): Double {
        return ukTax * income
    }
}

