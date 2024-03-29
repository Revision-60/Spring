package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.PojoOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/
public class AppInitializer {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        PojoOne pojoOne1 = (PojoOne) ctx.getBean("pojoOne");
        PojoOne pojoOne2 = (PojoOne) ctx.getBean("pojoOne");

        System.out.println(pojoOne1 == pojoOne2);

    }

}
