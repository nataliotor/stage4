package com.home_09_03_2023;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;


public class TaskContainer {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void createdTask(String topic, String description, LocalDateTime due, String assigned) { // метод створити завдання, який бере на вхід данні
        Task mathematics = new Task(topic, description, due, assigned); // створюємо новий об'ект з параметрами
        tasks.add(mathematics); // двізьми tasks та додай до нього новий об'ект mathematics


    }

    //TODO ->id>task
    //TODO -> LocalDate from -> LocalDate to
//    public void readTask(String name) { // прочитай завдання
//        for (Task some : tasks) { //  проходимося по циклу
//            if (some.getTopic().equals(name)) { // якщо some.getTopic співпадае name
//                System.out.println("Task " + some.getTopic()); // надрукуй це завдання
//            }
//        }
//        System.out.println("No found"); // якщо такої назви немає, напиши, що не знайшов
//    }
    public void readTaskId(int id) { // метод прочитай завдання, з вхідним параметром id
        for (Task task : tasks) { // проходимося по циклу
            if (task.generateId() == id) { // якщо завдання з генерованим id співпадає з заданим id
                System.out.println("Task Id " + task.generateId()); // то, надрукуй його
//
            } else {
                System.out.println("No task with ID " + id); // то, напиши, що завдання не знайдено

            }
        }

    }

    public void readTaskBetween(LocalDateTime created, LocalDateTime finished) { // метод який шукає завдання, які знаходяться між двома датами
        ArrayList<Task> result = new ArrayList<>(); // створюємо ArrayList result, де будемо зберігати завдання
        for (Task task : tasks) { // проходимося по масиву
            LocalDateTime due = task.getDue(); // змінній due присовоюємо значання getDue, яке ми отримали з task
            if (due != null && due.isAfter(created) && due.isBefore(finished)) { // якщо due не равна null та не знаходится між двома даиами (isAfter(created) && due.isBefore(finished))
                result.add(task); // то додай завдання до списку
            }
        }
    }


        //public void updateTask () { // метод оновити завдання (порахуй букви)
//        int current = 0; // значення дорівнює 0
//        for (Task some : tasks) { // пройдемося по циклу
//            if (Character.isAlphabetic(tasks.size())) { // якщо символ в tasks є буквою - порахуй його
//                current++; // увеличь на один
//                System.out.println(current);
//            }
//
//        }
//        System.out.println();



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

    public int compare(String firstAuthor, String secondAuthor) { // сравненние, оголушемо метод, на вхід беремо назву авторів
        int result = secondAuthor.length() - firstAuthor.length(); // определяем разницу между длиной авторов, это разрешит нам отссортировать строки по увелечению

        if (result == 0) { // если результат этих авторов имеют одинаковую длину
            result = firstAuthor.compareTo(secondAuthor); /// сравни Author1 и Author2 и отсортируй по алфавиту
        }
        return result;
    }

}
