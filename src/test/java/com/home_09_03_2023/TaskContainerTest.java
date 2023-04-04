package com.home_09_03_2023;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TaskContainerTest {

    @Test
    void createTaskTest() {
        TaskContainer taskContainer = new TaskContainer(); // створюємо об'ект TaskContainer
        int id = taskContainer.createdTask("History", "war", LocalDateTime.now(), "Natasha"); // викликаємо createdTask та зберігаемо те, що повертаеться (int id = )
        Task createdTask = taskContainer.readTaskId(id); // викликаємо метод readTaskId і зберігаємо його в Task
        assertEquals("History", createdTask.getTopic());   /// позволяет сравнивать два параметра, проверяем два значения - одно значение, которе мы ожидаем получить, второе, то, которое мы в итоге получаем
    }
    /// 1 - підготувати щось (підготовл.ємо данні)
    /// 2 - робимо дію (виконуємо дію), щоб переконатись, що вона правильно спрацювала нам доволится створювати метод (Task createdTask = taskContainer.readTaskId(id))
    /// 3 - робио перевірку
    @Test
    void readTaskId() {
    }

    @Test
    void readTaskBetween() {
    }

    @Test
    void deleteTask() {
    }

    @Test
    void printAll() {
    }

    @Test
    void compare() {
    }

    @Test
    void getTotalTask() {
    }

    @Test
    void testCompare() {
    }

    @Test
    void sortTask() {
    }
}