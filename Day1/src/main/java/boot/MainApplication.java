package boot;

import boot.bean.Wife;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author LiGuanda
 * @date 2023/1/7 上午 10:33:10
 * @description no description right now...
 * @filename MainApplication.java
 */

@SpringBootApplication
public class MainApplication {


    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
        Wife wife = context.getBean("myWife", Wife.class);
        System.out.println(wife);

    }


}
