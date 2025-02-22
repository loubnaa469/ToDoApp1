package com.example.ToDoApp1.service;


import com.example.ToDoApp1.Model.task;
import com.example.ToDoApp1.repo.taskRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class taskService {

    @Autowired
    taskRepo repo;

//    List<task> tasks = new ArrayList<>(Arrays.asList(
//            new task(1, "Iphone", true),
//            new task(2, "Canon", false),
//            new task(3, "Shure", true) // Pas de point-virgule ici
//    ));

    public List<task> getTasks() {
        return repo.findAll();
    }

    public task getTaskById(int TaskId) {
        return repo.findById(TaskId).orElse(new task());

    }

    public void addTask(task t) {
        repo.save(t);
    }

    public void updatTask(task t) {
       repo.save(t);
    }

    public void deleteTask(int taskId) {
       repo.findById(taskId);
    }


}
