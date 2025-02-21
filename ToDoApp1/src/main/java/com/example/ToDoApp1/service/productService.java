package com.example.ToDoApp1.service;


import com.example.ToDoApp1.Model.task;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class productService {

    List<task> tasks = Arrays.asList(
            new task(1, "Iphone", true),
            new task(2, "Canon", false),
            new task(3, "Shure", true) // Pas de point-virgule ici
    );

}
