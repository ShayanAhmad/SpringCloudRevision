package com.microsvc.limitsservice.bean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsvc.limitsservice.config.LimitServiceAppConfiguration;

@RestController
public class LimitsConfigurationController {

    private LimitServiceAppConfiguration configuration;

    public LimitsConfigurationController(LimitServiceAppConfiguration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitConfiguration getLimitConfig() {
        return new LimitConfiguration(configuration.getMin(), configuration.getMax());
    }

}
