package com.kbl.studentmanagementsystem.service;

import com.kbl.studentmanagementsystem.dto.BatchDTO;
import com.kbl.studentmanagementsystem.dto.BatchSaveDTO;
import com.kbl.studentmanagementsystem.dto.BatchUpdateDTO;

import java.util.List;

public interface BatchService {
    String addBatch(BatchSaveDTO batchSaveDTO);


    List<BatchDTO> getAllBatches();

    String updateBatch(BatchUpdateDTO batchUpdateDTO);

    boolean deleteBatch(int id);
}
