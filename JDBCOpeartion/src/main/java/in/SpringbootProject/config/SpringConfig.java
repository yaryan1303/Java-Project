package in.SpringbootProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {
	
	@Bean
	public DriverManagerDataSource myDataSource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/student");
		datasource.setUsername("root");
		datasource.setPassword("root@1824");
		
		return datasource;
		
	}
	
	@Bean
	public JdbcTemplate jdbctemplate()
	{
		JdbcTemplate jdbc=new JdbcTemplate();
		jdbc.setDataSource(myDataSource());
		
		return jdbc;
		
		
	}

}
