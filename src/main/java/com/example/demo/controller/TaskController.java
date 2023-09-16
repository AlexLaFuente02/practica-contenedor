package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.model.TaskID;
import com.example.demo.model.Task;

@RestController
public class TaskController {
    
    @GetMapping("/api/v1/task")
    public List<Task> getAllTasks(){
        List<Task> result = new ArrayList<>();
        result.add(new Task("1", "Task 1", "2020-01-01", "Done"));
        result.add(new Task("2", "Task 2", "2020-01-02", "Done"));
        result.add(new Task("3", "Task 3", "2020-01-03", "Done"));
        result.add(new Task("4", "Task 4", "2020-01-04", "Done"));
        return result;
    }

    @PostMapping("/api/v1/task")
    public ResponseEntity<TaskID> createTask(@RequestBody final Task task){
        System.out.println(task.toString());
        TaskID newTaskID = new TaskID(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED)
            .contentType(MediaType.APPLICATION_JSON)
            .body(newTaskID);
    }

    //@DeleteMapping("/api/v1/task/{id}")

}
