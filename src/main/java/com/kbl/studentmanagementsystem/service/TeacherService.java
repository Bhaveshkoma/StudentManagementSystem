package com.kbl.studentmanagementsystem.service;

import com.kbl.studentmanagementsystem.dto.TeacherDTO;
import com.kbl.studentmanagementsystem.dto.TeacherSaveDTO;
import com.kbl.studentmanagementsystem.dto.TeacherUpdateDTO;

import java.util.List;

public interface TeacherService {
    String addTeacher(TeacherSaveDTO teacherSaveDTO);

    List<TeacherDTO> getAllTeachers();

    String updateTeacher(TeacherUpdateDTO teacherUpdateDTO);

    boolean deleteTeacher(int id);
}
