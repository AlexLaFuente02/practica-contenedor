package com.example.demo.bl;

import java.util.*;

import com.example.demo.model.Task;

public class TaskBl {
    
    List<Task> database = new ArrayList();
    public Map create(Task task){
        database.add(task);
        return null;
    }

    public List<Task> listAll(){
        return database;
    }

    public void delete(int taskId){
        for(int i = 0; i < database.size(); i++){
            Task t = database.get(i);
            if(t.taskId() == taskId){
                database.remove(i);
                break;
            }
        }
    }
}
