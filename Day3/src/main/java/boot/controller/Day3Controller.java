package boot.controller;

import boot.bean.Wife;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiGuanda
 * @date 2023/1/9 上午 10:02:31
 * @description no description right now...
 * @filename Day3Controller.java
 */

@RestController
public class Day3Controller {


    @Autowired
    private Wife wife;


    @RequestMapping("/day3")
    String day3() {

        return "DAY3 : JuJingyi loves Dage!";

    }


    @RequestMapping("/myWife")
    String myWife() {

        return "My wife is " + wife.getName() + " whose age is " + wife.getAge();

    }


}
