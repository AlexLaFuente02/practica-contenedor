package com.example.demo.dto;

import java.util.Date;

public class Task {
    private int taskId;
    private String name;
    private Date dueDate;
    private String status;

    public Task(int taskId, String name, Date dueDate, String status) {
        this.taskId = taskId;
        this.name = name;
        this.dueDate = dueDate;
        this.status = status;
    }

    public int taskId() {
        return taskId;
    }
}
