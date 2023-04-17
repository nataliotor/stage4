package com.dataStructures;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {


    @Test
    void addTest (){ // добавления елемента в массив
        int item = 89; // создаем item
        MyArrayList myArrayList = new MyArrayList(); // создаем новый myArrayList
        myArrayList.add(item); /// вызываем метод добавления item
        assertEquals(1,myArrayList.size());
        assertEquals(item,myArrayList.get(0));





    }


}
