package com.example.ToDoApp1.Controller;

import com.example.ToDoApp1.Model.task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ToDoApp1.service.productService;

import java.util.List;
@RestController
public class TaskController {

    @Autowired
    productService service;


    @GetMapping("/tasks")
    public List<task> getTasks(){
        return service.getTasks();
    }


    @GetMapping("/tasks/{taskId}")
    public task getTaskById(@PathVariable int taskId){
        return service.getTaskById(taskId);
    }


    @PostMapping("/tasks")
    public void addTask(@RequestBody task t){
        service.addTask(t);
    }


    @PutMapping("/tasks")
    public void updatTask(@RequestBody task t){
        service.updatTask(t);
    }

    @DeleteMapping("/tasks/{taskId}")
    public void deleteTask(@PathVariable int taskId){
        service.deleteTask(taskId);
    }













}
