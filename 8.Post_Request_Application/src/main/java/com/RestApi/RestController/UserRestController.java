package com.RestApi.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.bindings.User;

@RestController
public class UserRestController {
	
	@PostMapping(value="/user", 
			consumes= {"application/json","application/xml"},
			produces= {"application/json","application/xml"} //{"text/plain"} or we can use produces= {"application/json","application/xml"} to produce the requested or consumed data
	)
	public String addtUser(@RequestBody User user) {
		System.out.println(user);
		String msg="User Saved Successfully";
		return msg;	
	}

}
