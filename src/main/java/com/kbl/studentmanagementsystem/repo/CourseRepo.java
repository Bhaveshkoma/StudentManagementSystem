package com.kbl.studentmanagementsystem.repo;

import com.kbl.studentmanagementsystem.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
