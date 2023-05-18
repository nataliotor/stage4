package com.singlyLinkedList;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        LinkedList linkedList = new LinkedList(); // створюємо новий об'єкт

        linkedList.insert(10); // викликаємо метод insert зі значенням 10
        linkedList.insert(20); // викликаємо метод insert зі значенням 20

        assertNotNull(linkedList.head); // потім перевіряємо, що поле head в ою'єкті linkedList не є пустим
        assertEquals(10,linkedList.head.data); // перевіряємо, що поле data у вузлі head в ою'єкті linkedList дорівнює 10
        assertEquals(20,linkedList.head.next.data); // перевіряємо, що в наступному узлі після вузла head поле data в ою'єкті linkedList дорівнює 20
        assertNull(linkedList.head.next.next); // перевіряємо, що після додавання 10,20 поле head і два наступні вузла є пустими

    }

    @Test //    Я НЕ РОЗУМІЮ, ЩО ЦЕ ЗА МЕТОД
    void DISPLAY_TEST(){ // перевіряє чи виводиться інфа на консоль
        LinkedList linkedList = new LinkedList(); // створюємо новий об'єкт

        linkedList.insert(40); // викликаємо метод insert зі значенням 40
        linkedList.insert(50); // викликаємо метод insert зі значенням 50

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); // створюємо новий об'єкт ByteArrayOutputStream з назвою outputStream використовується для перехоплення виводу, що зазвичай відправляється на консоль.
        PrintStream originalOutputStream = System.out; // створюємо нову змінну originalOutputStream типу PrintStream і присвоює їй значення поточного стандартного виводу (System.out). System.out є об'єктом типу PrintStream, який зазвичай використовується для виведення тексту на консоль. Збереження оригінального виводу у змінній originalOutputStream дозволяє відновити його після перенаправлення виводу для тестування.
        System.setOut(new PrintStream(outputStream)); // встановлює новий об'єкт PrintStream, який є обгорткою навколо ByteArrayOutputStream, як новий стандартний вивід (System.out). За допомогою System.setOut, ми перенаправляємо вивід, який зазвичай відправляється на консоль, до outputStream. Таким чином, будь-який вивід, який здійснюється через System.out.println() або подібні методи, буде перенаправлятися до outputStream, де його можна буде отримати і аналізувати в подальшому для тестування.

        linkedList.display(); // викликаємо метод display

        System.setOut(originalOutputStream); // Цей рядок відновлює оригінальний стандартний вивід (System.out), який був збережений у змінній originalOutputStream. Виклик System.setOut(originalOutputStream) встановлює originalOutputStream як поточний System.out, тобто будь-який вивід, який робиться за допомогою System.out.println() або подібних методів, знову буде виводитись на консоль, як звичайно. Це важливо, щоб повернути стандартний вивід до його початкового стану після завершення перехоплення і тестування.
        String printedContent = outputStream.toString().trim(); //Цей рядок отримує рядок, який міститься в outputStream, і перетворює його у рядок типу String за допомогою методу toString(). Далі, використовується метод trim(), щоб видалити зайві пробіли з початку і кінця рядка. Остаточний результат зберігається у змінній printedContent. Таким чином, змінна printedContent міститиме вміст, який був виведений на System.out під час виконання тесту.
        assertEquals("40 50", printedContent); // порівнюємо чи співпадають значення 40,50 з printedContent

    }

    @Test
    void EMPTY_LIST_TEST(){ //перевіряє, що список є порожнім після створення
        LinkedList linkedList = new LinkedList(); // створюємо новий об'єкт

        assertNull(linkedList.head); // проверяем, что поле head в объекте linkedList - пустое (равно Null)

    }






}