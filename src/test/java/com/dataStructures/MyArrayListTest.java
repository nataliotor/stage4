package com.dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    private MyArrayList myArrayList;

    @BeforeEach
    public void init() {
        myArrayList = new MyArrayList(); // створюємо новий об'єкт myArrayList
        myArrayList.add(10); // додаємо елемент зі значенням 10 до кінця списку
        myArrayList.add(20);// додаємо елемент зі значенням 20 до кінця списку
        myArrayList.add(30); // додаємо елемент зі значенням 30 до кінця списку
        myArrayList.add(40); // додаємо елемент зі значенням 40 до кінця списку
        myArrayList.add(50); // додаємо елемент зі значенням 50 до кінця списку

    }


    @Test
    void ADD_TEST() { // Этот код представляет тестовый метод с именем "ADD_TEST", который проверяет правильность работы метода "add" из класса "MyArrayList".

        int expectedSize = 5; /// ожидаемый размер массива после добавления трех элементов равен 3.
        int actualSize = myArrayList.size(); // вызов метода "size" на объекте "myArrayList" для получения фактического размера массива.
        assertEquals(expectedSize, actualSize); // сравнение ожидаемого размера массива "expectedSize" с фактическим размером "actualSize" с помощью метода "assertEquals" из библиотеки тестирования JUnit. Если ожидаемый и фактический размеры массива не совпадают, то тест не пройден.

    }

    /// Этот код представляет тестовый метод с именем "ADD_WITH_DUPLICATE_TEST", который проверяет правильность работы метода "add" из класса "MyArrayList" в случае, если в массиве уже есть элемент с добавляемым значением.
    @Test
    void ADD_WITH_DUPLICATE_TEST() {
        myArrayList.add(20); // вызов метода "add" на объекте "myArrayList" с аргументом "2".

        int expectedSize = 5; /// ожидаемый размер массива после добавления трех уникальных элементов равен 3.
        int actualSize = myArrayList.size(); // вызов метода "size" на объекте "myArrayList" для получения фактического размера массива.
        assertEquals(expectedSize, actualSize); // сравнение ожидаемого размера массива "expectedSize" с фактическим размером "actualSize" с помощью метода "assertEquals" из библиотеки тестирования JUnit. Если ожидаемый и фактический размеры массива не совпадают, то тест не пройден. Тест не должен пройти, поскольку метод "add" должен игнорировать дубликаты элементов.

    }

    @Test
    void DELETE_ELEMENT_AT_BEGINNING_TEST() { // цей метод тестує видалення першого елемента з масиву
        myArrayList.delete(0); // викликаємо метод delete для видалення першого елемента(перший елемент з індексом 0)
        assertEquals(4, myArrayList.size()); // перевіряємо, що розмір самого списка дорівнює 2
        assertEquals(20, myArrayList.get(0)); // перевіряємо, що перший елемент зі списку дорівнює 2
        assertEquals(30, myArrayList.get(1));  // перевіряємо, що другий елемент зі списку дорівнює 3

    }

    @Test
    void DELETE_ELEMENT_AT_END_TEST() { // метод тестує видалення останнього елемента

        myArrayList.delete(myArrayList.size()-1); // викликаємо метод delete для видалення останнього елемента (останній елемент - 2)
        assertEquals(4, myArrayList.size()); // перевіряємо розмір списку, він повинен бути дорівнювати 2
        assertEquals(10, myArrayList.get(0)); // перевіряємо, що перший елемент зі списку дорівнює 1
        assertEquals(20, myArrayList.get(1)); // перевіряємо, що перший другий зі списку дорівнює 2

    }

    @Test
    void DELETE_ONLY_ELEMENT_TEST() { // метод тестує видалення єдиного елементу
        MyArrayList myArrayList = new MyArrayList(); // створюємо новий об'єкт myArrayList
        myArrayList.add(1); // додаємо елемент зі значенням 1 до кінця списку
        myArrayList.delete(0); // викликаємо метод delete для видалення єдиного елементу
        assertEquals(0, myArrayList.size()); // перевіряємо розмір списку, він повинен бути пустий
        assertTrue(myArrayList.isEmpty()); // перевіряємо чи пустий список
    }

    @Test
    void DELETE_ELEMENT_IN_MIDDLE_TEST() { // метод тестує видалення елемента в середині масиву

        myArrayList.delete(1); // викликаємо метод delete для видалення елементу в середині (2-ий елемент - це середина)
        assertEquals(4, myArrayList.size()); // перевіряємо чи видалився елемент з середини (масив повинен був дорівнювати 2)
        assertEquals(10, myArrayList.get(0)); // перевіряємо чи 1-ий елемент зі списку дорівнює 0
        assertEquals(30, myArrayList.get(1)); // перевіряємо чи 3-ий елемент зі списку дорівнює 1

    }

    @Test
    void GET_EXISTED_ELEMENT_BY_INDEX_TEST() {
        int expectedItem = 20;  // - определение ожидаемого значения элемента массива myArrayList с индексом 1
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
    void UPDATE_ELEMENT_AT_INDEX_TEST() { // Тест, який перевіряє оновлення елемента в середині масиву

        int index = 2; // визначаємо index (номер елементу) який ми хочемо відновити
        int element = 35; // створюємо element на який ми хочемо відновити
        myArrayList.update(index, element); // викликаємо метод update, який оновить нам 2 індекс на нове значення елементу 35
        assertEquals(35, myArrayList.get(index)); // перевіряємо, що новий елемент дійсно оновився

    }
}
