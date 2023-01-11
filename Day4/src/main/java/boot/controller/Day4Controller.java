package boot.controller;

import boot.bean.Wife;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiGuanda
 * @date 2023/1/10 上午 10:47:29
 * @description no description right now...
 * @filename Day4Controller.java
 */

@RestController
public class Day4Controller {


    @Autowired
    private Wife JuJingyi;

    @RequestMapping("/day4")
    String day4() {

        return "DAY4 : JuJingyi loves Dage!";

    }

    @RequestMapping("/wife")
    String wife() {

        return JuJingyi.toString();

    }


}
