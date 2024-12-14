package com.example.ToDList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String title;
    private String descraption;
    private boolean completed;

    public Todo(String title, String descraption, boolean completed) {
        this.title = title;
        this.descraption = descraption;
        this.completed = completed;
    }
    public Todo(){};

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescraption() {
        return descraption;
    }

    public void setDescraption(String descraption) {
        this.descraption = descraption;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
