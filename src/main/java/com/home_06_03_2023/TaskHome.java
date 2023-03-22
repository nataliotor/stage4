package com.home_06_03_2023;

import com.github.javafaker.Faker;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TaskHome implements Comparable<TaskHome> {

    private String subject; // название предмета
    private String topic; // тема завдання
    private String description; // описание задания
    private LocalDate dateOf; /// дата выдачи задания
    private LocalDate duDate; // доки треба здати
    private LocalDate finished;
    private boolean isStatus; // выполнено или не выполнено задание
    private boolean isPriority; // приоритете задания

    public TaskHome(String name, String topic, LocalDate finished, String description) {

    }


    public TaskHome() {
        this.subject = subject;
        this.topic = topic;
        this.description = description;
        this.dateOf = dateOf;
        this.duDate = duDate;
        this.isStatus = isStatus;
        this.isPriority = isPriority;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateOf() {
        return dateOf;
    }

    public void setDateOf(LocalDate dateOf) {
        this.dateOf = dateOf;
    }

    public LocalDate getDuDate() {
        return duDate;
    }

    public void setDuDate(LocalDate duDate) {
        this.duDate = duDate;
    }

    public boolean isStatus() {
        return isStatus;
    }

    public void setStatus(boolean status) {
        isStatus = status;
    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

    @Override
    public String toString() {
        return "TaskHome{" +
                "subject='" + subject + '\'' +
                ", topic='" + topic + '\'' +
                ", description='" + description + '\'' +
                ", dateOf=" + dateOf +
                ", duDate=" + duDate +
                ", isStatus=" + isStatus +
                ", isPriority=" + isPriority +
                '}';
    }

    public static TaskHome getInstance() { // метод рандомного выбора данных
        Faker faker = new Faker();
        TaskHome some = new TaskHome();
        some.subject = faker.name().name();
        some.topic = faker.name().name();
        some.description = faker.name().name();
        some.dateOf = faker.date().past(0, TimeUnit.HOURS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        some.duDate = faker.date().future(2, TimeUnit.HOURS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        some.isStatus = faker.random().nextBoolean();
        some.isPriority = faker.random().nextBoolean();


        return some;
    }

    public void printTaskHome() {  // метод печати

    }


    public int compareTo(TaskHome anotherTaskHome) { // метод сравнения
        return this.duDate.compareTo(anotherTaskHome.duDate);
    }

    @Override
    public Object clone() {
        try {
            TaskHome taskHome = (TaskHome) super.clone(); // Створюємо новий об'єкт TaskHome та копіюємо всі його поля з поточного об'єкту
            taskHome.topic = this.topic; // копіюємо поля topic
            taskHome.description = this.description; // копіюємо поля description
            return taskHome;  /// Повертаємо клонований об'єкт TaskHome
        } catch (CloneNotSupportedException exception) {
            //Якщо клонування не підтримується, генеруємо виняток RuntimeException
            throw new RuntimeException(exception);
        }
    }

    public void saveToFile(String fileName, List<TaskHome> taskHomes) {
        try {
            File file = new File(fileName); // створюємо новий об'ект файл
            FileWriter writer = new FileWriter(file); // Створюється новий об'єкт FileWriter, який буде записувати дані у файл
            BufferedWriter bufferedWriter = new BufferedWriter(writer); // Створюється новий об'єкт BufferedWriter, який зберігає звернення до об'єкта
            for (TaskHome taskHome : taskHomes) { // перебираемо кожний об'ект
                bufferedWriter.write(taskHome.toCSV1()); // додаемо його запис, CSV-формат
                bufferedWriter.write("\n"); // кожен запис закінчуется символом нового рядку
            }
            bufferedWriter.close(); // закриваемо
        } catch (
                IOException exception) {  // Якщо виникає помилка під час запису до файлу, метод генерує виняток RuntimeException.
            throw new RuntimeException(exception);
        }


    }

    private String toCSV1() {


        return null;
    }
}

