package io.eddvance.production.lowcarbpower.service.lowcarbpower_service;

import org.springframework.stereotype.Service;

@Service
public class LowCarbPowerService {
    String greenRate;
    String blackRate;

    //generation du prix de l'energie verte
    public String greenGeneRate() {
        double random = 0.20 + Math.random() * 0.20;
        greenRate = String.format("%.2f", random);
        System.out.println(greenRate);
        return greenRate;
    }

    //recuperation du prix de l'energie carbonnee a CoalFired
    public String getCarbonRate() {

        return blackRate;
    }

    //calcul energie carbonnee provisoire
    public String getCarbonFinalRate() {
        Double bloc256 = 256.00;
        Double bloc256Price = 10.00;
        Double finalRatePrice;
        Double rating;
        String provisoire = "";
        Double provisoireDouble;
        provisoireDouble = Double.parseDouble(provisoire);
        rating = provisoireDouble / bloc256;
        finalRatePrice = rating * bloc256Price;
        return finalRatePrice.toString();
    }
}