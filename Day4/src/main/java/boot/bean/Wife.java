package boot.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author LiGuanda
 * @date 2023/1/8 上午 10:24:42
 * @description no description right now...
 * @filename Wife.java
 */

@Slf4j
@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "wife")
public class Wife {


    private String name;
    private int age;


    public Wife() {


    }


    public Wife(String name, int age) {

        this.name = name;
        this.age = age;

    }


    public void setName(String name) {

        this.name = name;

    }


    public void setAge(int age) {

        this.age = age;

    }


    public String getName() {

        return name;

    }


    public int getAge() {

        return age;

    }


    @Override
    public String toString() {

        return "Wife{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }


}
