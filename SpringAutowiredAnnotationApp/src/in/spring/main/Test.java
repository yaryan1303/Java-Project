package in.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.servlet.config.AnnotationsConfig;
import in.spring.bean.Employee;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationsConfig.class);
        
        // Fetch the Employee bean from the Spring context
        Employee employee = applicationContext.getBean(Employee.class);
        System.out.println(employee);
        
        // Close the ApplicationContext
        applicationContext.close();
    }
}
