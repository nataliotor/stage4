package com.dataStructures;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {


    @Test
    void addTest() { // добавления елемента в массив
        int item = 2; // создаем item
        MyArrayList myArrayList = new MyArrayList(); // создаем новый myArrayList
        myArrayList.add(item); /// вызываем метод добавления item
        assertEquals(item, myArrayList.get(0)); // проверяем, что item добивался в список
    }

    @Test
    void NegativAddTest() {
        int item = 1;
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(item);
        assertNull(myArrayList.size());

    }

    @Test
    void deleteTest() {
        int item1 = 25;
        int item2 = 15;
        int index = 1;
        MyArrayList myArrayList = new MyArrayList(); // создаем новый массив
        myArrayList.add(item1); // добавляем в массив два item1, item2
        myArrayList.add(item2);

        myArrayList.delete(index); // вытягиваем метод delete, который удаляет index = 5

        assertEquals(1, myArrayList.size()); // проверяем, что в массиве осталься 1 элемент из 2 после удаления
    }

    @Test
    void getTest() {
        int index = 2;

        MyArrayList myArrayList = new MyArrayList(); // создаем новый массив
        for (int i = 0; i <= 2; i++) {// заполняем массив
            myArrayList.add(i);
            assertEquals(index, myArrayList.get(i)); // проверяем равен ли индекс myArrayList с индексом i
            assertThrows(myArrayList.get(i),myArrayList.size()); // надо проверить правда ли, что i есть в массиве
        }
        myArrayList.get(index);


    }

    @Test
    void update(){
        int index = 2;
        int element = 0;

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(element);
        
        myArrayList.update(index,element); // вызыаем метод обновить элемент
        assertEquals(element,myArrayList.get(index)); // проверяем равен ли element с елементов myArrayList.get с индексом  index
    }




}
