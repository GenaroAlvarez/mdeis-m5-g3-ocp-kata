package kata3.refactored

class OcpTaxCalculatorClient {
    fun calculateTaxes() {
        val income = 15000.0
        val usTaxCalculator = USTaxCalculator(income)
        val ukTaxCalculator = UKTaxCalculator(income)
        val canadaTaxCalculator = CanadaTaxCalculator(income)

        val taxCalculators: List<TaxCalculator> = listOf(
            usTaxCalculator,
            ukTaxCalculator,
            canadaTaxCalculator
        )

        for (taxCalculator in taxCalculators) {
            println(taxCalculator.calculateTax())
        }
    }
}