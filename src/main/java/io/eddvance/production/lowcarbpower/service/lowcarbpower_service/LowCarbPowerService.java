package io.eddvance.production.lowcarbpower.service.lowcarbpower_service;

import org.springframework.stereotype.Service;

@Service
public class LowCarbPowerService {
    String rate;

 public String geneRate(){
    double random = 1.00 + Math.random();
    rate = String.format("%.2f", random);
     System.out.println(rate);
    return rate;
 }
}