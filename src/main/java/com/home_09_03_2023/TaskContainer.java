package com.home_09_03_2023;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;


public class TaskContainer {
    private ArrayList<Task> tasks = new ArrayList<>();

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void createdTask(String name, String topic, LocalDate finished, String description) { // метод створити завдання, який бере на вхід данні
        Task mathematics = new Task("Mathematics", "Theory of probability", "Random events", LocalDate.now(), LocalDate.ofYearDay(2023, 25), Priority.CRITICAL); // створюємо новий об'ект з параметрами
        tasks.add(mathematics); // двізьми tasks та додай до нього новий об'ект mathematics

    }

    public void addTask(String name, String topic, LocalDate finished, String description) { // метод додати завдання
        tasks.add(new Task("Geometry", "are", "coordinates", LocalDate.now(), LocalDate.now(), Priority.LOW)); // візьми Task та додай завдання
    }


    public void readTask(String name) { // прочитай завдання
        for (Task some : tasks) { //  проходимося по циклу
            if (some.getTopic().equals(name)) { // якщо some.getTopic співпадае name
                System.out.println("Task " + some.getTopic()); // надрукуй це завдання
            }
        }
        System.out.println("No found"); // якщо такої назви немає, напиши, що не знайшов
    }

    public void updateTask() { // метод оновити завдання (порахуй букви)
        int current = 0; // значення дорівнює 0
        for (Task some : tasks) { // пройдемося по циклу
            if (Character.isAlphabetic(tasks.size())) { // якщо символ в tasks є буквою - порахуй його
                current++; // увеличь на один
                System.out.println(current);
            }

        }
        System.out.println();


    }

    public void deleteTask() { // видалити завдання
        LocalDate finished = LocalDate.of(2023, 03, 12);
        for (Task some : tasks) { // пройдемося по циклу
            some.isUrgent(); // завдання є правдою
            if (some.isUrgent() && some.getFinished().isBefore(ChronoLocalDateTime.from(finished))) { // якщо завдання я правдою ы дата здачі до finished
                tasks.remove(some); // видали це завдання
            }

        }
    }

    public void printAll() {// распечайтай все
        for (Task some : tasks) {
            System.out.println(some + " ");
        }
        System.out.println();


    }

    public int compare(String Author1, String Author2) { // сравненние, оголушемо метод, на вхід беремо назву авторів
        int result = Author2.length() - Author1.length(); // определяем разницу между длиной авторов, это разрешит нам отссортировать строки по увелечению

        if (result == 0) { // если результат этих авторов имеют одинаковую длину
            result =Author1.compareTo(Author2); /// сравни Author1 и Author2 и отсортируй по алфавиту
        }


        return result;
    }

}
