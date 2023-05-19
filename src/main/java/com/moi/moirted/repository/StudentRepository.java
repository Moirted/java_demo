package com.moi.moirted.repository;

import com.moi.moirted.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<Student, Long>{

}
