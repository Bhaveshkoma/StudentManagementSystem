package com.kbl.studentmanagementsystem.repo;

import com.kbl.studentmanagementsystem.entity.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepo extends JpaRepository<Batch,Integer> {

}