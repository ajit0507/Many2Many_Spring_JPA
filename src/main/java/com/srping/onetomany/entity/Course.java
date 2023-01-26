package com.srping.onetomany.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Course_3")
public class Course {
	
	@Id
	@SequenceGenerator(
			 name="techer_sequence",
			 sequenceName = "techer_sequence",
			 allocationSize = 1
			
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "techer_sequence"
			)
	
	private Long courseId;
	private String courseName;
	private String refBook;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "student_course_mapping",
			joinColumns = @JoinColumn(
					name="course_id",
					referencedColumnName = "courseId"
					),
			
			inverseJoinColumns = @JoinColumn(
					name="student_id",
					referencedColumnName = "studentId"
					)
			)
	private List<Student> students;

	
	public void addStudent(Student student)
	{
		
		if(student==null) students=new ArrayList<>();
		else
			students.add(student);
	}
}
