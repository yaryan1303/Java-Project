package in.servlet.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Student;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("XMLfile.xml");
        
        //used the object created by the IOC-Container
        Student std= applicationContext.getBean("student",Student.class);
        System.out.println(std);
        
        
        //Closing the Container
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
