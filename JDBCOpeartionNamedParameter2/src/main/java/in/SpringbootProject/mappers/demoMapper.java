package in.SpringbootProject.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.SpringbootProject.bean.demo;

public class demoMapper implements RowMapper<demo> {
    
    @Override
    public demo mapRow(ResultSet rs, int rowNum) throws SQLException {
        demo demo = new demo();
        
        // Assuming your Demo class has fields id and name, and appropriate setters
        demo.setId(rs.getInt("id"));
        demo.setName(rs.getString("name"));
        
        return demo;
    }
}
