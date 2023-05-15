package com.singlyLinkedList;

public class Node { // оголошуємо клас Node, який представляє вузол зв'язкового списку.
    public int data; // у вузла є два поля "data" - для зберігання даних
    public Node next; // для зберігання силки на слідуючий вузол у списку

    public Node(int data) { // викликаємо конструктор
        this.data = data;
        this.next = null;
    }
}

class LinkedList { // оголошуємо клас LinkedList, який є ВУЗЛОМ
    private Node head; //створюємо приватне поле head - це є силка на перший вузел

    public LinkedList() { // викликаємо конструктор
        this.head = null; // null говорить про те, що список пустий
    }

    public void insert(int data) { // метод insert використовується для вставлення нового елемента до кінця списку
        Node newNode = new Node(data); // створюємо новий вузел з переданим значенням data

        if (head == null) { // якщо список поорожній
            head = newNode; // то новий список newNode стає головою списку
        } else { // в іншому випадку
            Node current = head; // створюємо змінну current, яка буде дорівнювати head, викорстовуємо цю зміну, що пройти до останнього узла
            while (current.next != null) { // до поки у поточного вузла current є наступний вузол (current.next! = null), ми переміщуємося до наступного вузла.
                current = current.next; // оновлюємо змінну. вказуємо на останній вузол
            }
            current.next = newNode; // После выхода из цикла мы достигаем последнего узла списка, и затем устанавливаем его поле next на новый узел newNode, чтобы добавить его в конец списка.
        }
    }

    public void display() { // Метод display() використовується для виведення вмісту списку.
        Node current = head; // // створюємо змінну current, яка буде дорівнювати head, викорстовуємо цю зміну, що пройти до останнього узла
        while (current != null) { // до поки current не дорівнює null
            System.out.print(current.data + " "); // виводимо значення поля data
            current = current.next; // оновлюємо значення current, вказуємо на останній вузол
        }
        System.out.println();
    }
}

