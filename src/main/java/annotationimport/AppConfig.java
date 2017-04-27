package annotationimport;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by linhtran on 27/04/2017.
 */

@Configuration
@Import({HelloConfig.class, GoodbyeConfig.class})
@ImportResource(locations = "bean-import.xml")
    public class AppConfig {
}
