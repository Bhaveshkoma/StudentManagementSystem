package com.kbl.studentmanagementsystem.service;

import com.kbl.studentmanagementsystem.dto.StudentDTO;
import com.kbl.studentmanagementsystem.dto.StudentSaveDTO;
import com.kbl.studentmanagementsystem.dto.StudentUpdateDTO;

import java.util.List;

public interface StudentService {
    String addStudent(StudentSaveDTO studentSaveDTO);

    List<StudentDTO> getAllStudents();

    String updateStudent(StudentUpdateDTO studentUpdateDTO);

    boolean deleteStudent(int id);
}