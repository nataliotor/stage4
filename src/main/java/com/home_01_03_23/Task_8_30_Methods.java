package com.home_01_03_23;

import java.util.Scanner; // Импортируйте класс Scanner из пакета java.util

public class Task_8_30_Methods {

    public class LinearEquationTest { // Объявите класс с именем LinearEquationTest
        public static void main(String[] args) {  // Объявите статический метод main, который принимает массив строк в качестве параметра
            Scanner input = new Scanner(System.in); // Создайте объект класса Scanner, который будет читать данные, вводимые пользователем из стандартного ввода (клавиатуры)

            double[][] a = new double[2][2]; // Объявите двумерный массив a размером 2 на 2 и одномерный массив b размером 2
            double[] b = new double[2];

            System.out.print("Enter a00, a01, a10, a11, b0, b1: "); // Выведите на экран приглашение для ввода значений a00, a01, a10, a11, b0, b1

            for (int i = 0; i < 2; i++) { /// Считайте значения a00, a01, a10, a11, b0, b1 из стандартного ввода и заполните массивы a и b.
                for (int j = 0; j < 2; j++) {
                    a[i][j] = input.nextDouble();
                }
                b[i] = input.nextDouble();
            }
            double[] result = linearEquation(a, b); // Вызовите метод linearEquation с массивами a и b в качестве аргументов и сохраните результат в массив result.

            if (result != null){  // Если метод linearEquation вернул не-null результат, выведите значения x и y на экран
                System.out.println("x is " + result[0] + "and y is" + result[1]);
            }
            input.close(); // Закройте объект Scanner, чтобы освободить ресурсы

        }
    }

    private static double[] linearEquation(double[][] a, double[] b) {

        return b;
    }
}


/// Программа предлагает пользователю ввести коэффициенты и константы, считывает их из консоли и передает в метод linearEquation. Если метод возвращает допустимый результат, он печатает значения x и y. В противном случае он печатает сообщение об ошибке.
//Дана система линейных уравнений:
//a00x + a01y = b0
//a10x + a11y = b1
//Необходимо написать метод на Java, который решает данную систему уравнений. Решение находится по формулам:
//x = (b0 * a11 - b1 * a01) / (a00 * a11 - a01 * a10)
//y = (b1 * a00 - b0 * a10) / (a00 * a11 - a01 * a10)
//
//Метод должен иметь следующую сигнатуру:
//public static double[] linearEquation(double[][] a, double[] b)
//
//Если вычисление знаменателя (a00 * a11 - a01 * a10) дает результат 0, то метод должен вернуть null. Также необходимо написать тестовую программу, которая запрашивает у пользователя значения a00, a01, a10, a11, b0, b1 и выводит результат. Если знаменатель равен 0, программа должна сообщить "The equation has no solution."