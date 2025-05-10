package kata3.legacy

import org.junit.jupiter.api.Test

internal class OcpTaxCalculatorClientTest {

    @Test
    fun calculateTax() {
        val client = OcpTaxCalculatorClient()
        client.calculateTax()
    }
}