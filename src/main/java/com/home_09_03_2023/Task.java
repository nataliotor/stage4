package com.home_09_03_2023;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

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
    private String assigned;//R
    private Status status;//G
    private Priority priority;
    private boolean isImportant;
    private boolean isUrgent;
    private Category category;
    private int points;
    private double ratePerHours;

    public Task(String topic, String description, LocalDateTime due, String assigned) {
        this.topic = topic;
        this.description = description;
        this.due = due;
        this.assigned = assigned;
        this.created = LocalDateTime.now();
        this.updated = LocalDateTime.now();
        this.status = Status.NEW;
        this.id = generateId();
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

    public int generateId() {
        Random rnd = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int number = rnd.nextInt(10);
            stringBuilder.append(number);

        }

       return Integer.parseInt(stringBuilder.toString());
    }


}


