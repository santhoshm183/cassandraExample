
package com.sam.example.cassandra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.example.cassandra.model.Course;
import com.sam.example.cassandra.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public Course getCourse(String id) {
		return courseRepository.findById(id).orElse(null);
	}
	
	public void createCourse(Course course) {
		courseRepository.save(course);
	}
}
