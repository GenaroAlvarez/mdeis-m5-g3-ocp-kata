package kata3

import kata3.refactored.OcpTaxCalculatorClient
import org.junit.jupiter.api.Test

internal class OcpTaxCalculatorClientTest {

    @Test
    fun calculateTaxes() {
        val client = OcpTaxCalculatorClient()
        client.calculateTaxes()
    }
}