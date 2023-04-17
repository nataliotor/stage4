package com.dataStructures;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {


    @Test
    void addTest (){ // добавления елемента в массив
        int item = 89; // создаем item
        MyArrayList myArrayList = new MyArrayList(); // создаем новый myArrayList
        myArrayList.add(item); /// вызываем метод добавления item
        assertEquals(item,myArrayList.get(0)); // проверяем, что item добивался в список
    }
    @Test
    void NegativAddTest(){
        int item = 25;
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(item);
        assertNull(myArrayList.size());

    }

    @Test
    void deleteTest(){
        int item1 = 25;
        int item2 = 15;
        int index = 5;
        MyArrayList myArrayList = new MyArrayList(); // создаем новый массив
        myArrayList.add(item1); // добавляем в массив два item1, item2
        myArrayList.add(item2);

        myArrayList.delete(index); // вытягиваем метод delete, который удаляет index = 5

        assertEquals(1,myArrayList.size()); // проверяем, что в массиве осталься 1 элемент из 2


    }



}
