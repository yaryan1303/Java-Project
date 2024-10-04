package in.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("India")
	private String country;
	@Value("Maharastra")
	private String State;
	@Value("233444")
	private Integer pincode;
	@Override
	public String toString() {
		return "Address [country=" + country + ", State=" + State + ", pincode=" + pincode + "]";
	}
	
	

}
