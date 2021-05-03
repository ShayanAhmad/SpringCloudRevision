package com.microsvc.currencyexchangeservice.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microsvc.currencyexchangeservice.domain.ExchangeValue;
import com.microsvc.currencyexchangeservice.jpaRepo.ExchangeValueJpaRepository;

@RestController
public class CurrencyExchangeController {

    private Environment environment;
    private ExchangeValueJpaRepository jpaRepository;


    public CurrencyExchangeController(Environment environment, ExchangeValueJpaRepository jpaRepository) {
        this.environment = environment;
        this.jpaRepository = jpaRepository;
    }

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getCurrencyExchange(final @PathVariable String from, final @PathVariable String to) {
        ExchangeValue currencyExchange = jpaRepository.findByFromAndTo(from, to);
        Integer portNumber = Integer.parseInt(environment.getProperty("server.port"));
        currencyExchange.setPort(portNumber);
        return currencyExchange;
    }

}
