package demo.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class RootValueService {
    @Value("${tibco.anotherName}")
    String anotherName;


    public void obtainAnotehrName() {
        log.info("Another Name: " + anotherName);
    }


}
