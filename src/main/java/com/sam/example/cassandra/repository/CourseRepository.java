package com.sam.example.cassandra.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.sam.example.cassandra.model.Course;

@Repository
public interface CourseRepository extends CassandraRepository<Course, String>{

}
