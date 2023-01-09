package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pojo.Item;

import java.util.ArrayList;

@Configuration
@ComponentScan(basePackages = "pojo")
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig Created");
    }

    @Bean
    public Item item() {
        return new Item();
    }

    @Bean
    public ArrayList arrayList(){
        return new ArrayList();
    }

}
