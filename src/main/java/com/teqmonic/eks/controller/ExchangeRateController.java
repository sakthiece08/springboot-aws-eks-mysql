package com.teqmonic.eks.controller;


import com.teqmonic.eks.model.ExchangeRate;
import com.teqmonic.eks.service.ExchangeRateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ExchangeRateController {

    private final ExchangeRateService exchangeRateService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/exchange-rate")
    public void addExchangeRate(@RequestBody ExchangeRate exchangeRate) {
        log.info("AddExchangeRate - {}", exchangeRate);
        exchangeRateService.addExchangeRate(exchangeRate);
    }

    @GetMapping("/exchange-rate/source_currency/{source}/target_currency/{target}")
    public ExchangeRate getExchangeRate(@PathVariable String source, @PathVariable String target) {
        log.info("GetExchangeRate - Source currency: {}, Target currency: {}", source, target);
      return exchangeRateService.getExchangeRate(source, target);
    }

    @GetMapping("/")
    public String health() {
        return "UP";
    }
}
