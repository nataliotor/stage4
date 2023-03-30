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
        Random rnd = new Random(); // створюємо Random для генерації рандомних чисел
        StringBuilder stringBuilder = new StringBuilder(); // створюємо об'ект stringBuilder, який викорустовуємо для збирання чисел
        for (int i = 0; i < 6; i++) { // починаємо цикл, який повторюється 6 разів
            int number = rnd.nextInt(10); // генеруємо випадкове число від 0 до 9, та зберігаємо його в number
            stringBuilder.append(number); // додаємо згенеровано число number до stringBuilder

        }

       return Integer.parseInt(stringBuilder.toString()); // повертаємо число, конвертувавши його з String до int, виористовуючи метод parseInt
    }



}
// append - це метод класу StringBuilder, який використовується для додавання рядків або символів до кінця поточного рядка, що вже зберігається у змінній StringBuilder.

// Наприклад, якщо ми маємо об'єкт StringBuilder зі значенням "hello", ми можемо додати до нього інші рядки чи символи, використовуючи метод append(). Наприклад, stringBuilder.append(" world"); додаст до поточного рядка рядок " world", так що stringBuilder.toString() поверне "hello world".


// Integer.parseInt - це статичний метод класу Integer, який використовується для перетворення рядка, що містить ціле число, в еквівалентне ціле число типу int. Цей метод виконує ті самі операції, що й метод parseInt, але знаходиться в класі Integer.
//Синтаксис методу Integer.parseInt виглядає так: Integer.parseInt(String s). Де s - рядок, який містить ціле число, яке потрібно перетворити на тип int.
//Наприклад, якщо ми маємо рядок "123", ми можемо використати Integer.parseInt("123") для отримання числового значення 123 у вигляді цілого числа типу int.
//Якщо рядок не можна сконвертувати в ціле число, метод parseInt() згенерує помилку NumberFormatException. Наприклад, якщо ми спробуємо використати Integer.parseInt("abc"), буде згенерована помилка, оскільки "abc" не може бути перетворено в ціле число.