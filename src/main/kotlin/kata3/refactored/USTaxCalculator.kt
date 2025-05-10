package kata3.refactored

class USTaxCalculator(private val income: Double) : TaxCalculator {
    private val tax = .24

    override fun calculateTax(): Double {
        return income * tax
    }
}