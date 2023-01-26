package com.srping.onetomany.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
@Table(name = "Student_3")
public class Student {
	@Id
	@SequenceGenerator(
			 name="Student_sequence",
			 sequenceName = "Student_sequence",
			 allocationSize = 1
			
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "Student_sequence"
			)
	
	private Long studentId;
	private String firstName;
	private String lastName;
	
	
}
