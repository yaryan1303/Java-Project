package in.SpringbootProject.JDBCOpeartion;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.SpringbootProject.bean.demo;
import in.SpringbootProject.config.SpringConfig;
import in.SpringbootProject.mappers.demoMapper;

public class App 
{
    public static void main(String[] args) 
    {
        // Create the application context from the Spring configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        // Retrieve the JdbcTemplate bean from the context
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        
//        int id = 103;
//      String name = "chotu";
//      
//      // Define the SQL insert query
//      String insertQuery = "INSERT INTO demo (id, name) VALUES (?, ?)";
//      
//      // Execute the insert query
//      int result = jdbcTemplate.update(insertQuery, id, name);
//      
//      // Output the result of the operation
//      System.out.println("Number of records inserted: " + result);
        
        // Define the SQL select query
        String selectQuery = "SELECT * FROM demo";
        
        // Execute the select query and map results using demoMapper
        List<demo> list = jdbcTemplate.query(selectQuery, new demoMapper());
        
        // Print out the results
        for (demo d : list) {
            System.out.println("ID: " + d.getId() + ", Name: " + d.getName());
        }
        
        // Close the application context to release resources
        ((AnnotationConfigApplicationContext) context).close();
    }
}
