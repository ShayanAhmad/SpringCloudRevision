package com.microsvc.currencyexchangeservice.jpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsvc.currencyexchangeservice.domain.ExchangeValue;

public interface ExchangeValueJpaRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
