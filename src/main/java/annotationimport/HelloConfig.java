package annotationimport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by linhtran on 27/04/2017.
 */
@Configuration
public class HelloConfig {

    @Bean(name="helloWorldBean")
    public HelloWorldService helloWorldService() {
        return new HelloWorldService();
    }

}
