package boot.config;

import boot.bean.Wife;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author LiGuanda
 * @date 2023/1/8 上午 10:26:36
 * @description no description right now...
 * @filename MyConfig.java
 */
@Import({Wife.class})
@Configuration
public class MyConfig {


    //@ConditionalOnBean(name = "hehe")
    @Bean
    public Wife myWife() {

        return new Wife("JuJingyi", 27);

    }


}
