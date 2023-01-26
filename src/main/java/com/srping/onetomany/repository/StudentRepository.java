package com.srping.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srping.onetomany.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
