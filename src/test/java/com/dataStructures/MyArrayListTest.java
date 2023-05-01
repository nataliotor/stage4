package com.dataStructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {


    @Test
    void ADD_TEST() {
        MyArrayListTest myArrayListTests = new MyArrayListTest(); // створюємо новий об'ект myArrayListTest
        ///myArrayListTests = 2; // наш размер массива равен 2
        myArrayListTests.add(2);
        int currentSize = 2; /// допусттим текущий размер 2
        int expectedSize = myArrayListTests.size(); // ожидаемый размер массива должен быть myArrayListTests.size
        assertEquals(currentSize,expectedSize);

        int expectedValue = 1;  // ожидаемое значение массива равно 1
        int actualValue = myArrayListTests.       /// размер который мы хотим получить - myArrayListTests +








    }


    @Test
    void NegativAddTest() {


    }

    @Test
    void deleteTest() {

    }

    @Test
    void getTest() {



    }

    @Test
    void update(){
    }
}
