package com.kbl.studentmanagementsystem.controller;

import com.kbl.studentmanagementsystem.dto.TeacherDTO;
import com.kbl.studentmanagementsystem.dto.TeacherSaveDTO;
import com.kbl.studentmanagementsystem.dto.TeacherUpdateDTO;
import com.kbl.studentmanagementsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping(path = "/save")
    public String saveTeacher(@RequestBody TeacherSaveDTO teacherSaveDTO)
    {
        String teachername = teacherService.addTeacher(teacherSaveDTO);
        return teachername;
    }
    @GetMapping("/getAllTeachers")
    public List<TeacherDTO> getAllTeachers()
    {
        List<TeacherDTO> allTeachers = teacherService.getAllTeachers();
        return allTeachers;
    }
    @PutMapping(path = "/update")
    public String updateTeacher(@RequestBody TeacherUpdateDTO teacherUpdateDTO)
    {
        String teachername = teacherService.updateTeacher(teacherUpdateDTO);
        return teachername;
    }
    @DeleteMapping(path = "/delete/{id}")
    public String deleteTeacher(@PathVariable (value = "id")int id)
    {
        boolean deleteTeacher = teacherService.deleteTeacher(id);
        return "deleted!!";
    }
}