package com.srping.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.srping.onetomany.entity.Course;
import com.srping.onetomany.entity.Student;
import com.srping.onetomany.repository.CourseRepository;
import com.srping.onetomany.repository.StudentRepository;

@SpringBootTest
public class StudentTest {

	@Autowired
	CourseRepository courseRepository;
	
	@Test
	void saveCourseInfo()
	{
		
		Student student=Student.builder().firstName("amol").lastName("parab").build();
		Student student2=Student.builder().firstName("amruta").lastName("kale").build();
		
		Course course=Course.builder()
				.courseName("ABCUS")
				.students(List.of(student,student2))
				.build();
		
		courseRepository.save(course);  
		 
	}
	
}
