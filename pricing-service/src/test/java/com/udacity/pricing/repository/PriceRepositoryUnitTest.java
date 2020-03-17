package com.udacity.pricing.repository;

import static org.junit.Assert.assertEquals;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.domain.price.PriceRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PriceRepositoryUnitTest{
    @Autowired
    private PriceRepository priceRepository;

    @Test
    public void givenPriceJsonPopulatorThenShouldInsertRecordOnStart() {
        List<Price> prices = priceRepository.findAll();
        assertEquals("record count is not matching", 2, prices.size());

        prices.forEach(price -> {
            if (1 == price.getId()) {
                assertEquals("USD", price.getCurrency());
            } else if (2 == price.getId()) {
                assertEquals("INR", price.getCurrency());
            }
        });
    }
}