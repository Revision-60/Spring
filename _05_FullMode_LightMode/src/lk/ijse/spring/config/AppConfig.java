package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoOne;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

@Configuration
@ComponentScan("lk.ijse.spring")
public class AppConfig {

    @Bean
    public PojoOne pojoOne() {
        PojoTwo pojoTwo1 = pojoTwo();
        PojoTwo pojoTwo2 = pojoTwo();
        return new PojoOne();
    }

    @Bean
    public PojoTwo pojoTwo(){
        return new PojoTwo();
    }

}
