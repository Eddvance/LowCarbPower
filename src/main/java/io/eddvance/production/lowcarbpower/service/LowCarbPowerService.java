package io.eddvance.production.lowcarbpower.service;

import org.springframework.stereotype.Service;

@Service
public class LowCarbPowerService {

    public String greenGeneRate() {
        double random = 0.20 + Math.random() * 0.20;
        String greenRate = String.format("%.2f", random);
        System.out.println(greenRate);
        return greenRate;
    }
}