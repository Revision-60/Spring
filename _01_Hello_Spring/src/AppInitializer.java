import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Customer;

import java.util.ArrayList;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        // Default Bean Id =  Customer -> customer (first letter simple)
        Customer customer1 = (Customer) context.getBean("customer");

        //Given Bean Id
        Customer customer2 = (Customer) context.getBean("customer1");

        System.out.println(customer1 == customer2);
//
        ArrayList arrayList = (ArrayList) context.getBean("getArrayList");

    }
}
