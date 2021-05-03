package com.microsvc.currencyconversionservice.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microsvc.currencyconversionservice.domain.CurrencyConversion;

@FeignClient(value = "currency-exchange-service")
@RibbonClient(value = "currency-exchange-service")
public interface CurrencyExchangeFeignClient {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversion getCurrencyExchangeInfo(@PathVariable("from") String from, @PathVariable("to") String to);

}
