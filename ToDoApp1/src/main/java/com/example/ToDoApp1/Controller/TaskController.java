package com.example.ToDoApp1.Controller;

import com.example.ToDoApp1.Model.task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ToDoApp1.service.productService;

import java.util.List;
@RestController
public class TaskController {

    @Autowired
    productService service;

    @RequestMapping("/tasks")
    public List<task> getTasks(){
        return service.getTasks();
    }

}
