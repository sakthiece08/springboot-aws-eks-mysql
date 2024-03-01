package com.teqmonic.eks.service;

import com.teqmonic.eks.ExchangeRateRepository;
import com.teqmonic.eks.model.ExchangeRate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ExchangeRateService {

    private final ExchangeRateRepository exchangeRateRepository;

    public void addExchangeRate(ExchangeRate exchangeRate) {
        exchangeRateRepository.save(exchangeRate);
    }

    public ExchangeRate getExchangeRate(String source, String target) {
       return exchangeRateRepository.findBySourceAndTarget(source, target).orElseThrow();
    }
}
