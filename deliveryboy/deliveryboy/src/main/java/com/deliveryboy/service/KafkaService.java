package com.deliveryboy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.deliveryboy.config.AppConstants.LOCATION_TOPIC_NAME;

@Service
public class KafkaService {

    private KafkaTemplate<String, String> kafkaTemplate;
    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public KafkaService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public boolean updateLocation(String location) {

            this.kafkaTemplate.send(LOCATION_TOPIC_NAME, location);
            this.logger.info("message produced");
            return true;
    }
}
