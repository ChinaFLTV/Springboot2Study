package boot.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiGuanda
 * @date 2023/1/7 上午 10:34:14
 * @description no description right now...
 * @filename HelloController.java
 */

/*@ResponseBody
@Controller*/
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, Spring Boot 2!";
    }


}