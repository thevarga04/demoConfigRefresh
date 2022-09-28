package demo.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "tibco")
@RefreshScope
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class RootConfigPropService {
    private String queueName;

    public void obtainQueueName() {
        log.info("Queue Name: " + queueName);
    }


}
