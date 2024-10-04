 package in.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    
    @Value("7")
    private Integer empId;
    
    @Value("Dhoni")
    private String empname;
    
    @Value("34")
    private Integer empage;
    
    @Value("34443")
    private double empsalary;
    
    @Autowired(required=false)
    private Address address; 
    
    static {
        System.out.println("EMPLOYEE.CLASS FILE IS LOADING");
    }
    
    public Employee() {
        System.out.println("Employee bean instantiated");
    }

    

    @Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empage=" + empage + ", empsalary=" + empsalary
				+ ", address=" + address + "]";
	}



	// Getters and setters
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getEmpage() {
        return empage;
    }

    public void setEmpage(Integer empage) {
        this.empage = empage;
    }

    public double getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(double empsalary) {
        this.empsalary = empsalary;
    }
}
