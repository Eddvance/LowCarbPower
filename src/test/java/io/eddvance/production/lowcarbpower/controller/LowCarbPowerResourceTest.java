package io.eddvance.production.lowcarbpower.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LowCarbPowerResourceTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testGetRate() {
        String url = "http://localhost:" + port + "/lowcarbpower/rate";
        String response = this.restTemplate.getForObject(url, String.class);

        assertThat(response).isNotNull();
        assertThat(response).matches("\\d\\.\\d{2}");
        double value = Double.parseDouble(response);
        assertThat(value).isBetween(0.20, 0.40);
    }
}