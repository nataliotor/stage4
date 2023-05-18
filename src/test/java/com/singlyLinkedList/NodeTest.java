package com.singlyLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test
    void INSERT_TEST(){ // // тест перевіряє чи вставляється елемент до списку
        LinkedList linkedList = new LinkedList(); // створюємо новий об'єкт

        linkedList.insert(10); // викликаємо метод insert зі значенням 10
        assertNotNull(linkedList.head); // перевіряємо, що поле head у об'єкта linkedList не є null
        assertEquals(10,linkedList.head.data); //перевіряємо, чи дорівнює поле data у вузлі head об'єкта linkedList 10
        assertNull(linkedList.head.next); // перевіряємо, що поле next у вузлі head об'єкта linkedList є null
    }

    @Test
    void INSERT_MULTIPLE_ELEMENTS_TEST (){ // перевіряє коректність вставки декількох елементів до списку.
        LinkedList linkedList = new LinkedList();

        linkedList.insert(10);
        linkedList.insert(20);

        assertNotNull(linkedList.head);
        assertEquals(10,linkedList.head.data);
        assertEquals(20,linkedList.head.next.data);
        assertNull(linkedList.head.next.next);

    }





}