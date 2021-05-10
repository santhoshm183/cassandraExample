package com.sam.example.cassandra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.example.cassandra.model.Course;
import com.sam.example.cassandra.service.CourseService;


@RestController
@RequestMapping("/course/")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("getCourse/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable String id){
		return ResponseEntity.ok(courseService.getCourse(id));
	}
	
	@PostMapping("createCourse/")
	public void createCourse(@RequestBody Course course){
		courseService.createCourse(course);
		//return ResponseEntity.ok();
	}
	
}
