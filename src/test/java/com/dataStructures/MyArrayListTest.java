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
    void NegativAddTest() {


    }

    @Test
    void deleteTest() {

    }

    @Test
    void GET_TEST() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        int expectedItem = 2;
        int actualItem = myArrayList.get(1);
        assertEquals(expectedItem,actualItem);




    }

    @Test
    void update() {
    }
}
