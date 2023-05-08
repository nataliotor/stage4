package com.dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {


    @Test
    void ADD_TEST() { // Этот код представляет тестовый метод с именем "ADD_TEST", который проверяет правильность работы метода "add" из класса "MyArrayList".
        MyArrayList myArrayList = new MyArrayList(); // создание нового объекта "MyArrayList" с именем "myArrayList".
        ///myArrayListTests = 2; // наш размер массива равен 2
        myArrayList.add(2); // вызов метода "add" на объекте "myArrayList" с аргументом "2".
        myArrayList.add(1); // вызов метода "add" на объекте "myArrayList" с аргументом "1".
        myArrayList.add(3); // вызов метода "add" на объекте "myArrayList" с аргументом "3".

        int expectedSize = 3; /// ожидаемый размер массива после добавления трех элементов равен 3.
        int actualSize = myArrayList.size(); // вызов метода "size" на объекте "myArrayList" для получения фактического размера массива.
        assertEquals(expectedSize, actualSize); // сравнение ожидаемого размера массива "expectedSize" с фактическим размером "actualSize" с помощью метода "assertEquals" из библиотеки тестирования JUnit. Если ожидаемый и фактический размеры массива не совпадают, то тест не пройден.

    }

    /// Этот код представляет тестовый метод с именем "ADD_WITH_DUPLICATE_TEST", который проверяет правильность работы метода "add" из класса "MyArrayList" в случае, если в массиве уже есть элемент с добавляемым значением.
    @Test
    void ADD_WITH_DUPLICATE_TEST() {
        MyArrayList myArrayList = new MyArrayList(); // создание нового объекта "MyArrayList" с именем "myArrayList".
        myArrayList.add(2); // вызов метода "add" на объекте "myArrayList" с аргументом "2".
        myArrayList.add(1); // вызов метода "add" на объекте "myArrayList" с аргументом "1".
        myArrayList.add(3); // вызов метода "add" на объекте "myArrayList" с аргументом "3".
        myArrayList.add(2); // вызов метода "add" на объекте "myArrayList" с аргументом "2".

        int expectedSize = 3; /// ожидаемый размер массива после добавления трех уникальных элементов равен 3.
        int actualSize = myArrayList.size(); // вызов метода "size" на объекте "myArrayList" для получения фактического размера массива.
        assertEquals(expectedSize, actualSize); // сравнение ожидаемого размера массива "expectedSize" с фактическим размером "actualSize" с помощью метода "assertEquals" из библиотеки тестирования JUnit. Если ожидаемый и фактический размеры массива не совпадают, то тест не пройден. Тест не должен пройти, поскольку метод "add" должен игнорировать дубликаты элементов.


    }

    @Test
    void DELETE_ELEMENT_AT_BEGINNING_TEST() { // цей метод тестує видалення першого елемента з масиву
        MyArrayList myArrayList = new MyArrayList(); // створення нового об'єкту myArrayList
        myArrayList.add(1); // додаємо елемент зі значенням 1 до кінця списку
        myArrayList.add(2); // додаємо елемент зі значенням 2 до кінця списку
        myArrayList.add(3); // додаємо елемент зі значенням 3 до кінця списку
        myArrayList.delete(0); // викликаємо метод delete для видалення першого елемента(перший елемент з індексом 0)
        assertEquals(2,myArrayList.size()); // перевіряємо, що розмір самого списка дорівнює 2
        assertEquals(2,myArrayList.get(0)); // перевіряємо, що перший елемент зі списку дорівнює 2
        assertEquals(3,myArrayList.get(1));  // перевіряємо, що другий елемент зі списку дорівнює 3

    }
    @Test
    void DELETE_ELEMENT_AT_END_TEST(){ // метод тестує видалення останнього елемента
        MyArrayList myArrayList = new MyArrayList(); // створюємо новий об'єкт myArrayList
        myArrayList.add(1); // додаємо елемент зі значенням 1 до кінця списку
        myArrayList.add(2); // додаємо елемент зі значенням 2 до кінця списку
        myArrayList.add(3); // додаємо елемент зі значенням 3 до кінця списку
        myArrayList.delete(2); // викликаємо метод delete для видалення останнього елемента (останній елемент - 2)
        assertEquals(2,myArrayList.size()); // перевіряємо розмір списку, він повинен бути дорівнювати 2
        assertEquals(1,myArrayList.get(0)); // перевіряємо, що перший елемент зі списку дорівнює 1
        assertEquals(2,myArrayList.get(1)); // перевіряємо, що перший другий зі списку дорівнює 2

    }

    @Test
    void GET_EXISTED_ELEMENT_BY_INDEX_TEST() {
        MyArrayList myArrayList = new MyArrayList(); // // создание нового объекта "MyArrayList" с именем "myArrayList".
        myArrayList.add(100); // // вызов метода "add" на объекте "myArrayList" с аргументом "1".
        myArrayList.add(200); // вызов метода "add" на объекте "myArrayList" с аргументом "2".
        myArrayList.add(300); // вызов метода "add" на объекте "myArrayList" с аргументом "3".
        int expectedItem = 200;  // - определение ожидаемого значения элемента массива myArrayList с индексом 1
        int actualItem = myArrayList.get(1); // вызов метода get() для получения элемента массива myArrayList с индексом 1 и сохранение результата в переменной actualItem (дай мне елемент на первой позиции)
        assertEquals(expectedItem, actualItem); // сравнение ожидаемого и фактического значений элемента массива myArrayList с индексом 1 с помощью метода assertEquals() из библиотеки тестирования JUnit. Если значения не равны, то тест не проходит.
    }

    @Test
    void GET_NEGATIVE_TEST() { // проверяет поведение метода «get» в классе MyArrayList, когда индекс отрицательный
        MyArrayList myArrayList = new MyArrayList(); // // создание нового объекта "MyArrayList" с именем "myArrayList".

        Exception exception = assertThrows(  /// Эта строка использует метод assertThrows, чтобы проверить, вызывает ли метод  get исключение типа ArrayIndexOutOfBoundsException, когда передается отрицательный индекс (-1). Лямбда-выражение () -> {...} используется для вызова метода get с отрицательным индексом.
                ArrayIndexOutOfBoundsException.class,
                () -> {
                    myArrayList.get(-1); // вызов метода get() для получения элемента массива myArrayList с индексом 1 и сохранение результата в переменной actualItem
                }
        );
        String expectedMessage = "Index -1 is out of bounds!";  /// Эти строки создают ожидаемое сообщение об ошибке и фактическое сообщение об ошибке, которое будет получено при вызове метода getMessage на исключении, которое было выброшено в assertThrows.
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage)); // Эта строка использует метод assertTrue, чтобы проверить, содержит ли фактическое сообщение об ошибке (actualMessage) ожидаемое сообщение об ошибке (expectedMessage). Если фактическое сообщение содержит ожидаемое сообщение, то тест пройден успешно, иначе тест завершится неудачно.


        //  assertEquals(expectedItem,actualItem); // сравнение ожидаемого и фактического значений элемента массива myArrayList с индексом 1 с помощью метода assertEquals() из библиотеки тестирования JUnit. Если значения не равны, то тест не проходит.
    }


    @Test
    void update() {
    }
}
