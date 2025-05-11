package io.eddvance.production.lowcarbpower.service.lowcarbpower_service;

import org.springframework.stereotype.Service;

@Service
public class LowCarbPowerService {
    String greenRate;
    String blackRate;

//generation du prix de l'energie verte
 public String greenGeneRate(){
    double random = 0.20 + Math.random() * 0.20;
    greenRate = String.format("%.2f", random);
     System.out.println(greenRate);
    return greenRate;
 }
//recuperation du prix de l'energie carbonnee
 public String getBlackRate(){

     return blackRate;
 }
}