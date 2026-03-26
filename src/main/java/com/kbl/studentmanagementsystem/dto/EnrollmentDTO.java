package com.kbl.studentmanagementsystem.dto;

import com.kbl.studentmanagementsystem.entity.Batch;
import com.kbl.studentmanagementsystem.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EnrollmentDTO {

    private int enrollid;
    private Student student;
    private Batch batch;
    private String joindate;
    private int fee;


}
