package com.home_27_02_23;

import java.util.Random;

public class Task_8_18_Classes { /// создаем класс Task_8_18_Classes

    private int[][] matrix; // создаем двухмерный массив, который будет использоваться для хранения матрицы

    public Task_8_18_Classes(int rows, int cols) { /// создаем конструктор, на входе количество строк и столбцов в качестве аршумента
        matrix = new int[rows][cols]; // создаем двухмерный массив в теле уонструктора с размерами rows и cols
        initialize();
    }

    public void initialize() { // создаме метод initialize без аргументов
        int value = 1; // создаем переменную, которая равна 1
        for (int i = 0; i < matrix.length; i++) { // создаем цикл который проходит по строке
            for (int j = 0; j < matrix.length; j++) { // и столбцам
                matrix[i][j] = value; /// значение элемента matrix[i][j] равно 1
                value++; /// увеличиваем значение на 1
            }
        }
    }

    public void shuffle() { // создаем метод shuffle
        int rows = matrix.length; /// создаем переменные rows и cols, которые содержат количество строк и столбцов
        int cols = matrix[0].length;
        Random random = new Random(); // создаем Random для генерации чисел
        for (int i = 0; i < rows; i++) { /// Создание двух вложенных циклов for, которые проходят по всем элементам массива matrix.
            for (int j = 0; j< cols; j++){
                int randomRow = random.nextInt(rows);  /// Во внутренних циклах генерируются случайные индексы randomRow и randomCol, которые используются для выбора случайного элемента из матрицы.
                int randomCol = random.nextInt(cols);
                int temp = matrix[i][j]; // создаем временную переменную temp и присваиваем ей значения текущего элемента матрицы matrix[i][j].
                matrix[i][j] = matrix[randomRow][randomCol]; /// перезапись текущего элемента матрицы значением случайного элемента matrix[randomRow][randomCol].
                matrix[randomRow][randomCol] = temp;/// перезапись случайного элемента
            } // matrix[randomRow][randomCol] значением временной переменной temp.
        }
    }

    public void print(){
        for(int[] row : matrix){
            for(int element: row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Task_8_18_Classes matrix = new Task_8_18_Classes(3,4);
        matrix.print();
        matrix.shuffle();
        matrix.print();
    }
}


/// Эта реализация определяет класс Matrix с переменными экземпляра для массива двумерных матриц. У класса есть конструктор, который принимает количество строк и столбцов в качестве аргументов и инициализирует матрицу, вызывая метод initialize().
//
//Метод initialize() заполняет матрицу последовательными целыми числами, как в предыдущем примере.
//
//Метод shuffle() перемешивает матрицу, случайным образом меняя местами элементы. Он использует вложенные циклы для перебора всех элементов в матрице, и для каждого элемента он генерирует случайные индексы строк и столбцов и меняет местами элемент с элементом со случайными индексами.
//
//Метод print() выводит матрицу на консоль, где каждая строка находится на отдельной строке, а каждый элемент разделен пробелами.
