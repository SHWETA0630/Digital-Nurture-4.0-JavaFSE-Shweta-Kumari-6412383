package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.spring_learn.entity.Country;
import com.cognizant.spring_learn.repository.CountryRepository;
import com.cognizant.spring_learn.service.CountryService;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class CountryApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryApplication.class);

    @Autowired
    private CountryService countryService;

    @Autowired
    private CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(CountryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testAddCountry();
        getCountryByCodeTest();
    }

    private void testAddCountry() {
        LOGGER.info("Start - testAddCountry");

        Country newCountry = new Country();
        newCountry.setCoCode("ZZ");
        newCountry.setCoName("Zootopia");

        countryService.addCountry(newCountry);

        try {
            Country fetched = countryService.findCountryByCode("ZZ");
            LOGGER.debug("Added Country: {}", fetched);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Country not found after adding: {}", e.getMessage());
        }

        LOGGER.info("End - testAddCountry");
    }

    private void getCountryByCodeTest() {
        LOGGER.info("Start - getCountryByCodeTest");
        try {
            Country country = countryService.findCountryByCode("IN");
            LOGGER.debug("Country: {}", country);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Exception: {}", e.getMessage());
        }
        LOGGER.info("End - getCountryByCodeTest");
    }
}
