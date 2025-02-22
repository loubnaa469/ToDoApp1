package com.example.ToDoApp1.service;


import com.example.ToDoApp1.Model.task;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class productService {

    List<task> tasks = new ArrayList<>(Arrays.asList(
            new task(1, "Iphone", true),
            new task(2, "Canon", false),
            new task(3, "Shure", true) // Pas de point-virgule ici
    ));

    public task getTaskById(int TaskId) {
        return tasks.stream().filter(t -> t.getId()== TaskId)
                             .findFirst().orElse(new task(10,"NoItem",true));

    }

    public void addTask(task t) {
        tasks.add(t);
    }

    public void updatTask(task t) {
        int index=0;
        for (int i=0;i< getTasks().size();i++){
            if (getTasks().get(i).getId()== t.getId())
                index=i;
        }
        tasks.set(index,t);
    }

    public void deleteTask(int taskId) {
        int index=0;
        for (int i=0;i< getTasks().size();i++){
            if (getTasks().get(i).getId()== taskId )
                index=i;
        }
        tasks.remove(index);
    }
}
