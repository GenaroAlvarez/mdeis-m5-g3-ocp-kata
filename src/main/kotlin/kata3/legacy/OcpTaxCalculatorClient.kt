package kata3.legacy

class OcpTaxCalculatorClient {
    fun calculateTax() {
        val income = 15000.0
        val usTaxCalculator = TaxCalculator(CountryCode.US, income)
        val ukTaxCalculator = TaxCalculator(CountryCode.UK, income)

        val taxCalculators: List<TaxCalculator> = listOf(
            usTaxCalculator, ukTaxCalculator
        )

        for (taxCalculator in taxCalculators) {
            if (taxCalculator.countryCode == CountryCode.US) {
                println(taxCalculator.calculateUsTax())
            }
            if (taxCalculator.countryCode == CountryCode.UK) {
                println(taxCalculator.calculateUkTax())
            }
        }
    }
}