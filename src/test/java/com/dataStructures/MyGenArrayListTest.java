package com.dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyGenArrayListTest {
// Alt+enter
    @Test
    void MY_GENERIC_LIST_FOR_STRING_TEST() { // этот тест проверяет, что список myGenArrayList правильно хранит строки "Ivan" и "Vladimir" и возвращает правильное значение при вызове get для индекса 1.
        MyGenArrayList<String> myGenArrayList = new MyGenArrayList<>(String.class); // Создается экземпляр MyGenArrayList<String> с помощью конструктора MyGenArrayList<>(String.class). Это означает, что MyGenArrayList будет хранить строки.
        myGenArrayList.add("Ivan"); // Вызывается метод add("Ivan") для добавления строки "Ivan" в список myGenArrayList.
        myGenArrayList.add("Vladimir"); // Вызывается метод add("Vladimir") для добавления строки "Vladimir" в список myGenArrayList.
        String actual = myGenArrayList.get(1); // Вызывается метод get(1) для получения элемента списка с индексом 1, то есть второго элемента. Результат сохраняется в переменной actual типа String.
        assertEquals("Vladimir",actual); // Вызывается метод assertEquals("Vladimir", actual), который сравнивает ожидаемое значение "Vladimir" с фактическим значением actual. Если значения не совпадают, тест будет неудачным.

    }

    @Test
    void MY_GENERIC_LIST_FOR_INTRGER_TEST() { // этот тест проверяет, что список myGenArrayList правильно хранит целые числа 1 и 2 и возвращает правильное значение при вызове get для индекса 1.
        MyGenArrayList<Integer> myGenArrayList = new MyGenArrayList<>(Integer.class); //Создается экземпляр MyGenArrayList<Integer> с помощью конструктора MyGenArrayList<>(Integer.class). Это означает, что MyGenArrayList будет хранить целые числа.
        myGenArrayList.add(1); // Вызывается метод add(1) для добавления целого числа 1 в список myGenArrayList.
        myGenArrayList.add(2); // Вызывается метод add(2) для добавления целого числа 2 в список myGenArrayList.
        Integer actual = myGenArrayList.get(1); // Вызывается метод get(1) для получения элемента списка с индексом 1, то есть второго элемента. Результат сохраняется в переменной actual типа Integer.
        assertEquals(2,actual); // Вызывается метод assertEquals(2, actual), который сравнивает ожидаемое значение 2 с фактическим значением actual. Если значения не совпадают, тест будет неудачным.

    }

}