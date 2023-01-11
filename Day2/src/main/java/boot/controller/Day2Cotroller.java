package boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2Cotroller {


    @RequestMapping("/hello")
    String hello() {

        return "DAY2 Hello World";

    }


}
