package com.home_09_03_2023;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.*;


public class TaskContainer {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void createdTask(String topic, String description, LocalDateTime due, String assigned) { // метод створити завдання, який бере на вхід данні
        Task mathematics = new Task(topic, description, due, assigned); // створюємо новий об'ект з параметрами
        tasks.add(mathematics); // двізьми tasks та додай до нього новий об'ект mathematics


    }

    public Task readTaskId(int id) { // метод прочитай завдання, з вхідним параметром id
        for (Task task : tasks) { // проходимося по циклу
            if (task.generateId() == id) { // якщо завдання з генерованим id співпадає з заданим id
                return task;
//
            } else {
                System.out.println("No task with ID " + id); // то, напиши, що завдання не знайдено

            }
        }

        return null;
    }

    public List<Task> readTaskBetween(LocalDateTime created, LocalDateTime finished) { // метод який шукає завдання, які знаходяться між двома датами
        ArrayList<Task> result = new ArrayList<>(); // створюємо ArrayList result, де будемо зберігати завдання
        for (Task task : tasks) { // проходимося по масиву
            LocalDateTime due = task.getDue(); // змінній due присовоюємо значання getDue, яке ми отримали з task
            if (due != null && due.isAfter(created) && due.isBefore(finished)) { // якщо due не равна null та не знаходится між двома даиами (isAfter(created) && due.isBefore(finished))
                result.add(task); // то додай завдання до списку
            }
        }
        return result;
    }


    public void deleteTask() { // видалити завдання
        LocalDate finished = LocalDate.of(2023, 3, 12);
        for (Task some : tasks) { // пройдемося по циклу
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

    public int compare(String firstAuthor, String secondAuthor) { // сравненние, оголушемо метод, на вхід беремо назву авторів
        int result = secondAuthor.length() - firstAuthor.length(); // определяем разницу между длиной авторов, это разрешит нам отссортировать строки по увелечению

        if (result == 0) { // если результат этих авторов имеют одинаковую длину
            result = firstAuthor.compareTo(secondAuthor); /// сравни Author1 и Author2 и отсортируй по алфавиту
        }
        return result;
    }

//    public int countTask() {
//        ArrayList<Task> result = new ArrayList<>();
//        int count = 0;
//        for (Task task : tasks) {
//            result.add(task);
//            count++;
//        }
//        return count;
//    }

    public int getTotalTask() { // порахувати кількість завдань
        int sumTask = 0; // створюємо зміну sumTask, яка дорівнює 0
        for (Task task : tasks) { // проходимося по масиву
            sumTask++; // порахуй завдання
        }
        return sumTask;

    }

    public int compare(Task p1, Task p2) {  /// порівняння двох об'єктів
        return p1.getTopic().compareTo(p2.getTopic());

    }

    public void sortTask (List<Task> tasks, Comparator<Task> comparator){ // сотрування //Я НЕ ЗРОЗУМІЛА
        Collections.sort(tasks, comparator);

    }




}
