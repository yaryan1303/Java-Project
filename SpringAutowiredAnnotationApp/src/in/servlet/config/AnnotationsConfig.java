package in.servlet.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.spring.bean")
public class AnnotationsConfig {
    static {
        System.out.println("Creating the annotations method");
    }
}
