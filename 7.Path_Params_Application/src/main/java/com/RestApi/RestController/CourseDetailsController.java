package com.RestApi.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseDetailsController {

	@GetMapping(value="/course/{studycourse}/chooseCourse/{position}") // in the url we can specify the study course and position directly without key value pair
	public String getCourseDetails(@PathVariable("studycourse") String course, @PathVariable("position") String position) {		
		String msg="If we choose the course "+course+", then we will get the "+position+", It will Benifites to us";
		return msg;		
	}
}
