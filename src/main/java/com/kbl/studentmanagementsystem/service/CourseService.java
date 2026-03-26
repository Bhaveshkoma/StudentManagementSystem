package com.kbl.studentmanagementsystem.service;

import com.kbl.studentmanagementsystem.dto.CourseDTO;
import com.kbl.studentmanagementsystem.dto.CourseSaveDTO;
import com.kbl.studentmanagementsystem.dto.CourseUpdateDTO;

import java.util.List;

public interface CourseService {
    String addCourse(CourseSaveDTO courseSaveDTO);

    List<CourseDTO> getAllCourses();

    String updateCourse(CourseUpdateDTO courseUpdateDTO);

    boolean deleteCourse(int id);
}