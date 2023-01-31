package lk.ijse.spring.di;

import lk.ijse.spring.pojo.PojoOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

@Component
public class A {

    @Autowired
    @Qualifier("b")
    SuperB name; // Property Injection

//    public A(SuperB name) {
//        this.name = name;
//        System.out.println("Invoked");
//    }

    //
////    @Autowired
////    public A(SuperB b) {
////        this.b = b; // Constructor through Injection
////    }
//
//
//    public void callMethodBFromA() {
//        b.methodB();
//    }
//
////    @Autowired
//    @Override
//    public void inject(SuperB b) {
//        this.b = b; // Interface through Injection
//    }
//
////    @Autowired
//    public void setInject(SuperB b){
//        this.b = b; // Setter Method through Injection
//    }
}
