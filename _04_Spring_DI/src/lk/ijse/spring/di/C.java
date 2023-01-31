package lk.ijse.spring.di;

import org.springframework.stereotype.Component;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

@Component
public class C implements SuperB{
    @Override
    public void methodB() {
        System.out.println("MethodC");
    }
}
