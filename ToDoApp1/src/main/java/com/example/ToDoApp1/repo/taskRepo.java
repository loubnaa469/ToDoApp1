package com.example.ToDoApp1.repo;

import com.example.ToDoApp1.Model.task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;


@Repository
public interface taskRepo extends JpaRepository<task,Integer> {
}
