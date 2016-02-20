package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Lucas on 20/02/2016.
 */

@Component
public class SetterBasedInjectionService {
    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage(){
        helloWorldService.sayHello();
    }
}
