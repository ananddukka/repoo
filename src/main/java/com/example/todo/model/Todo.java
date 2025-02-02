package com.example.todo.model;

public class Todo {
    private int id;
    private String todo;
    private String status;
    private String priority;

    public Todo(int id, String todo, String status, String priority) {
        this.id = id;
        this.todo = todo;
        this.priority = priority;
        this.status = status;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}