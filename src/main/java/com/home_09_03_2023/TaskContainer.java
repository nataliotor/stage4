package com.home_09_03_2023;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class TaskContainer {
    private ArrayList<Task> tasks = new ArrayList<>();

    //TODO 1 - Check if topic already exist amoung other tasks, if exist not add it!!!
    public int createdTask(String topic, String description, LocalDateTime due, String assigned) { // метод створити завдання, який бере на вхід данні
        for (Task task : tasks) { // проходимося по циклу
            if (task.getTopic().equals(topic)) { // якщо таск з доданним топиком співпадає з існуючим топиком, то поверни -1
                return -1; // (-1, то що не існуюча id
            }
        }
        Task mathematics = new Task(topic, description, due, assigned); // створюємо новий об'ект з параметрами
        tasks.add(mathematics); // двізьми tasks та додай до нього новий об'ект mathematics
        return mathematics.getId();
    }

    public Task readTaskId(int id) { // метод прочитай завдання, з вхідним параметром id
        for (Task task : tasks) { // проходимося по циклу
            if (task.getId() == id) { // якщо завдання з генерованим id співпадає з заданим id
                return task;
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

    ///•	Назва методу: saveTasksToFile
//•	Вхідні параметри: рядок, що представляє шлях до файлу, де будуть зберігатися завдання.
//•	Тип повернення: порожній
//•	Опис: Цей метод зберігає всі завдання в TaskContainer до файлу у форматі CSV (або будь-якому іншому форматі) за вказаним шляхом файлу.
//    public int saveTasksToFile(String path, String delimiter, String format) {
//        try {
//            PrintWriter pw = new PrintWriter(new FileOutputStream(path)); // создаем объект PrintWriter для записи в файл по пути, указанному в параметре path.
//
//            for (Task task : tasks) { // проходимся по масиву
//                pw.printf(format, task.getTopic(), task.getDescription(), task.getFinished()); // Форматируем строку с помощью printf и записывает ее в файл.
//                pw.print(delimiter); // Записываем разделитель в файл между задачами.
//            }
//            pw.close(); // закрываем объект PrintWriter
//            System.out.println("Tasks successfully saved to file: " + path);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found: " + e.getMessage());
//        }
//        return 0;
//    }


    public int saveTasksToFile(ArrayList<Task> tasks, String filename) {

        try {
            PrintWriter pw = new PrintWriter(new File(filename));
            pw.printf("topic,id,description,created,updated");
            for(Task task: tasks){
                pw.println(task.toString());
        }
            return 1;

        }catch (IOException exception){
            exception.printStackTrace();
            return -1;
        }



    }


    }

// TODO to csv метод






