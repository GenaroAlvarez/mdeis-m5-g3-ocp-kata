package kata3.refactored

// Introducir un nuevo cálculo de impuestos para CanadaTaxCalculator.
class CanadaTaxCalculator(private val income: Double) : TaxCalculator {
    private val tax = .15

    override fun calculateTax(): Double {
        return income * tax
    }
}