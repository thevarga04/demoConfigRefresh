package demo.api;

import demo.service.RootConfigPropService;
import demo.service.RootValueService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootRest {
    private final RootConfigPropService service;
    private final RootValueService value;

    public RootRest(RootConfigPropService service, RootValueService value) {
        this.service = service;
        this.value = value;
    }


    @PutMapping("/demo")
    void demo(){
        service.obtainQueueName();
        value.obtainAnotehrName();
    }

}
