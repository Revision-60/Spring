import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Customer;

import java.util.ArrayList;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Customer customer1 = (Customer) context.getBean("customer");
        Customer customer2 = (Customer) context.getBean("customer");

        System.out.println(customer1 == customer2);

        ArrayList arrayList = (ArrayList) context.getBean("arrayList");
        System.out.println(arrayList.size());

    }
}
