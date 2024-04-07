package pl.amidura.delivery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.amidura.NamingService;

@RestController
public class WebController {
    private final NamingService namingService = new NamingService();

    @GetMapping
    public String index() {
        return namingService.getDeliveryAppName();
    }
}
