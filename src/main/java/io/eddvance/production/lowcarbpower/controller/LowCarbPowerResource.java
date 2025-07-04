package io.eddvance.production.lowcarbpower.controller;

import io.eddvance.production.lowcarbpower.service.LowCarbPowerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/low-carb-power")
public class LowCarbPowerResource {
    private final LowCarbPowerService lowCarbPowerService;
    public LowCarbPowerResource(LowCarbPowerService lowCarbPowerService) {
        this.lowCarbPowerService = lowCarbPowerService;
    }

    @GetMapping("/rate")
    public String getRate(){
        return lowCarbPowerService.greenGeneRate();
    }
}