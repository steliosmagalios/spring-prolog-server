package me.stelios.prologserver.models;

import java.util.List;

public class Schedule {

    private final List<Task> tasks;

    public Schedule(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}

