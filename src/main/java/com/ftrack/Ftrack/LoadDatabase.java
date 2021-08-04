package com.ftrack.Ftrack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CoordinatesTools cTools) {

        return args -> {
            log.info("Preloading " + cTools.save(new Coordinates("0.00", "0.00","0","Network")));
            log.info("Preloading " + cTools.save(new Coordinates("1.00", "1.00", "0", "GPS")));
        };
    }
}
