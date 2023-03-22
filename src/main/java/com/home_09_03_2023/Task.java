package com.home_09_03_2023;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Task {
    private int id;//G
    private String topic;//R
    private String description;//R
    private LocalDateTime created;//G
    private LocalDateTime updated;//G
    private LocalDateTime due;//R
    private LocalDateTime started;
    private LocalDateTime finished;

    private Author author;
    private  String assigned;//R
    private Status status;//G
    private Priority priority;
    private boolean isImportant;
    private boolean isUrgent;

    private Category category;
    private int points;
    private double ratePerHours;


    public Task(int id, String topic, String description, LocalDateTime created, LocalDateTime updated, LocalDateTime due, LocalDateTime started, LocalDateTime finished, Status status, boolean isImportant, boolean isUrgent, int points, double ratePerHours) {
        this.id = id;
        this.topic = topic;
        this.description = description;
        this.created = created;
        this.updated = updated;
        this.due = due;
        this.started = started;
        this.finished = finished;
        this.status = status;
        this.isImportant = isImportant;
        this.isUrgent = isUrgent;
        this.points = points;
        this.ratePerHours = ratePerHours;
    }


    public Task(String mathematics, String theory_of_probability, String random_events, LocalDate now, LocalDate date, Priority critical) {
        id = 0;
    }

    public boolean isImportant() {
        return this.isImportant;
    }

    public boolean isUrgent() {
        return this.isUrgent;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Task;
    }

}


