package com.microsvc.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microsvc.currencyconversionservice.client.CurrencyExchangeFeignClient;
import com.microsvc.currencyconversionservice.domain.CurrencyConversion;

@RestController
public class CurrencyConversionController {

    private CurrencyExchangeFeignClient proxy;

    public CurrencyConversionController(CurrencyExchangeFeignClient proxy) {
        this.proxy = proxy;
    }

    @GetMapping("currency-conversion/amount/{amount}/from/{from}/to/{to}")
    public CurrencyConversion getCurrencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal amount) {
        CurrencyConversion currencyConversion = proxy.getCurrencyExchangeInfo(from, to);
        return new CurrencyConversion(currencyConversion.getId(),
                from,
                to,
                amount,
                currencyConversion.getConversionMultiple(),
                amount.multiply(currencyConversion.getConversionMultiple()),
                currencyConversion.getPort());
    }

}
