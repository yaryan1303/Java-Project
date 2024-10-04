package in.springboot.aryan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.aryan.dao.UserRep;
import in.springboot.aryan.entity.User;

@RestController
public class UserController {
	
	@Autowired
	private UserRep repo;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody List<User> userdata)
	{
		repo.saveAll(userdata);
		return ResponseEntity.ok("success");
	}
	
	
    
}
