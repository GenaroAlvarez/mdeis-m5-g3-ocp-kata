package kata3.refactored

class UKTaxCalculator(private val income: Double) : TaxCalculator {
    private val tax = .20

    override fun calculateTax(): Double {
        return income * tax
    }
}