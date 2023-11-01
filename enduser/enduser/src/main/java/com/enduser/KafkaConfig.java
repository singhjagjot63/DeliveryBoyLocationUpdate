package com.enduser;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static com.enduser.Constant.AppConstant.GROUP_ID;
import static com.enduser.Constant.AppConstant.LOCATION_UPDATE_TOPIC;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = LOCATION_UPDATE_TOPIC, groupId = GROUP_ID)
    public void updatedLocation(String value) {
        System.out.println(value);
    }
}
