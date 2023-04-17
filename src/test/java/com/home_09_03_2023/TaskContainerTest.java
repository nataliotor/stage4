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
    /// 3 - робимо перевірку

    @Test // маємо перевіримо, що таск з таким самим топіком не створиться
    void createTaskTestIfSame(){ // в нас е умова (якщо цей таск існує з таким топіком, поверни -1
        TaskContainer taskContainer = new TaskContainer(); // створюэмо об'ект TaskContainer
        int id = taskContainer.createdTask("English", "war", LocalDateTime.now(), "Natasha"); // викликаємо createdTask та зберігаемо те, що повертаеться (int id = )
        int nextCreatedTask = taskContainer.createdTask("English", "war", LocalDateTime.now(), "Natasha");
        assertEquals(-1, nextCreatedTask);

    }
    @Test
    void readTaskIdTest() {
        TaskContainer taskContainer = new TaskContainer(); // создаем новый объект TaskContainer
        int id = taskContainer.createdTask("English", "war", LocalDateTime.now(), "Natasha");
        Task task = taskContainer.readTaskId(id); // вызываем метод readTaskId с Id 2365 и сохраняем его Task
        assertEquals(id,task.getId()); // сравниваем два значения (2365 и task.getId). Если значения не равны, то тест завершится неудачей
        assertEquals("English", task.getTopic());

    }
    @Test
    void readTaskIdNegativTest(){  /// негативный тест - проверяет, что код работает неправильно
        TaskContainer taskContainer = new TaskContainer(); // создаем новый объект TaskContainer
        Task task = taskContainer.readTaskId(25); // вызываем метод readTaskId с отрицательный Id (25) и сохраняется в Task
        assertNull(task); // Метод assertNull()означает, что «переданный параметр должен быть null»: если он не равен нулю, то тестовый пример не пройден.
        // т.к у нас значение -1, то тест будет не пройден
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