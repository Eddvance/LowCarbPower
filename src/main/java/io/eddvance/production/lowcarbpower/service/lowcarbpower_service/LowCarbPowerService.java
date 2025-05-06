package io.eddvance.production.lowcarbpower.service.lowcarbpower_service;

import org.springframework.stereotype.Service;

@Service
public class LowCarbPowerService {
    String rate;

 public String geneRate(){
    double random = 0.20 + Math.random() * 0.20;
    rate = String.format("%.2f", random);
     System.out.println(rate);
    return rate;
 }
}