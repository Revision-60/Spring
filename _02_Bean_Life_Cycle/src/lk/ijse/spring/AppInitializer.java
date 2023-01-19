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


        ctx.close();

    }


    /*
    *           Spring Bean Life Cycle
    *
    *               1. Instantiate
    *               2. Populate Properties
    *               3. Bean Name Awareness
    *               4. Bean Factory Awareness
    *               5. Application Context Awareness
    *               6. Initializing
    *               7. Disposable Bean
    *
    * */

}
