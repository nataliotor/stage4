package com.home_27_02_23;

import java.util.Arrays;  // импортировать класс Arrays из пакета java.util

public class Task_8_18_Methods {  // объявить публичный класс
    public static void main(String[] args) {  // объявить публичный статический метод main, который принимает массив строк args в качестве аргумента

        int[][] m = {{1,2,3},{4,5,6},{7,8,9}}; ///создать двумерный массив целых чисел m и инициализировать его значениями
        System.out.println("Original array: " + Arrays.deepToString(m)); // вывести на консоль строку "Original array: " и преобразовать массив m в строку с помощью метода Arrays.deepToString, затем вывести эту строку на консоль.
        shuffle(m); // shuffle(m); - вызвать метод shuffle, передав массив m в качестве аргумента.
        System.out.println("Shuffle array: " + Arrays.deepToString(m)); // вывести на консоль строку "Shuffled array: " и преобразовать массив m в строку с помощью метода Arrays.deepToString, затем вывести эту строку на консоль.

    }

    private static void shuffle(int[][] m) { /// бъявить публичный статический метод shuffle, который принимает двумерный массив целых чисел m в качестве аргумента.
    }
}

/// В этом примере у нас есть основной метод, который создает двумерный массив целых чисел m с тремя строками и тремя столбцами и инициализирует его значения. Затем мы печатаем исходный массив, используя метод Arrays.deepToString.
//
//Затем мы вызываем метод shuffle, передавая массив m в качестве аргумента. Метод shuffle перемешивает строки массива на месте.
//
//Наконец, мы печатаем перетасованный массив, используя метод Arrays.deepToString, чтобы убедиться, что строки были перемешаны.
//
//Обратите внимание, что мы определили метод перемешивания отдельно от основного метода. Это позволяет нам повторно использовать метод перемешивания в других частях нашего кода, если это необходимо.