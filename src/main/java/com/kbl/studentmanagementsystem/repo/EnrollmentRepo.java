package com.kbl.studentmanagementsystem.repo;

import com.kbl.studentmanagementsystem.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepo extends JpaRepository<Enrollment,Integer> {
}