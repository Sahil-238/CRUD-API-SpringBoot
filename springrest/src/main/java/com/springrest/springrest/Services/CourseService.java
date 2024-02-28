package com.springrest.springrest.Services;

import java.util.List;

import com.springrest.springrest.entities.Courses;

public interface CourseService {
	
	public List<Courses> getCourses();
	
	public Courses getCourse(long courseid);
	
	public Courses addCourse(Courses course);
	
}
