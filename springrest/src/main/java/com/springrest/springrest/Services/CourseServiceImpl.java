package com.springrest.springrest.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	
	List<Courses> list;
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Courses(145,"Java Core Course","This course is Good"));
		list.add(new Courses(146,"Spring Boot","Creating Rest Api Using Spring Boot"));
	}
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Courses getCourse(long courseid) {
		// TODO Auto-generated method stub
		Courses c =null;
		for(Courses cour :list)
		{
			if(cour.getId()==courseid)
			{
				c=cour;
				break;
			}
		}
		
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		
		list.add(course);
		return course;
	}
	
	
	
}
