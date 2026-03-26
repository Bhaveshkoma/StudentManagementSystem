package com.kbl.studentmanagementsystem.repo;

import com.kbl.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer > {
}
