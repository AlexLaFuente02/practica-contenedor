package com.example.demo.model;

import java.sql.Date;

public class Task {
    private final String id;
    private final String name;
    private final String dueDate;
    private final String status;

    public Task(String id, String name, String dueDate, String status) {
        this.id = id;
        this.name = name;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    @Override

    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dueDate=" + dueDate +
                ", status='" + status + '\'' +
                '}';
    }

    public int taskId() {
        return 0;
    }

}
