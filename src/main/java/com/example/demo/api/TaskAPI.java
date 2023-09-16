package com.example.demo.api;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bl.TaskBl;
import com.example.demo.model.Task;

@RestController
@RequestMapping("/api/v1/task")
public class TaskAPI {
    private TaskBl taskBl;

    public TaskAPI() {
        taskBl = new TaskBl();
    }
    
    @GetMapping("/")
    public Map create(Task task){
        taskBl.create(task);
        Map result = new HashMap();
        result.put("code", "TASK-0000");
        result.put("result", "Task created successfully");
        result.put("errorMessage", "");  //lo dejamos en vacio aunque no es correcto, pero by now
        System.out.println("Task created successfully:\n"+result);
        return result;      
    }

    /*public Map listAll(){
        return taskBl.listAll();        
    }

    public Map delete(int taskId){
        taskBl.delete(taskId);
    }*/
}
