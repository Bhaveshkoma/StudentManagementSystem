package com.kbl.studentmanagementsystem.controller;

import com.kbl.studentmanagementsystem.dto.BatchDTO;
import com.kbl.studentmanagementsystem.dto.BatchSaveDTO;
import com.kbl.studentmanagementsystem.dto.BatchUpdateDTO;
import com.kbl.studentmanagementsystem.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/batch")
public class BatchController {

    @Autowired
    private BatchService batchService;

    @PostMapping(path = "/save")
    public String saveBatch(@RequestBody BatchSaveDTO batchSaveDTO)
    {
        String batch = batchService.addBatch(batchSaveDTO);
        return batch;
    }

    @GetMapping("/getAllBatches")
    public List<BatchDTO> getAllBatches()
    {
        List<BatchDTO> allBatches = batchService.getAllBatches();
        return allBatches;
    }


    @PutMapping(path = "/update")
    public String updateBatch(@RequestBody BatchUpdateDTO batchUpdateDTO)
    {
        String course = batchService.updateBatch(batchUpdateDTO);
        return course;

    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteBatch(@PathVariable(value = "id")int id)
    {
        boolean deleteCourse = batchService.deleteBatch(id);
        return "deletedddddd!!!!";

    }

}