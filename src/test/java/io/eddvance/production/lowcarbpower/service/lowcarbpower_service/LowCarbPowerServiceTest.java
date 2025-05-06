package io.eddvance.production.lowcarbpower.service.lowcarbpower_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LowCarbPowerServiceTest {

    private LowCarbPowerService service;

    @Autowired
    public LowCarbPowerServiceTest(LowCarbPowerService service) {
        this.service = service;
    }

    @Test
    void testGeneRateFormat() {
        String rate = service.geneRate();
        assertTrue(rate.matches("\\d\\.\\d{2}"), "Le format doit être 0.00");
    }

    @Test
    void testGeneRateWithinExpectedRange() {
        for (int i = 0; i < 100; i++) {
            String rateStr = service.geneRate();
            double rate = Double.parseDouble(rateStr);
            assertTrue(rate >= 0.20 && rate <= 0.40, "Le taux doit être entre 0.20 et 0.40 : " + rate);
        }
    }
}