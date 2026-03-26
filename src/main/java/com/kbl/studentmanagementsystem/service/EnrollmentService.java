package com.kbl.studentmanagementsystem.service;

import com.kbl.studentmanagementsystem.dto.EnrollmentDTO;
import com.kbl.studentmanagementsystem.dto.EnrollmentSaveDTO;
import com.kbl.studentmanagementsystem.dto.EnrollmentUpdateDTO;

import java.util.List;

public interface EnrollmentService {
    String addEnrollment(EnrollmentSaveDTO entrollmentSaveDTO);

    List<EnrollmentDTO> getAllEnrollments();

    String updateEnrollment(EnrollmentUpdateDTO enrollmentUpdateDTO);

    boolean deleteEnrollment(int id);
}