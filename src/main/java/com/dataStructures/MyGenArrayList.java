package com.dataStructures;

import java.lang.reflect.Array;

public class MyGenArrayList<T> implements MyGenList<T> {

    private T[] data;
    private int size;
    private Class<T> clazz;

    public MyGenArrayList(Class<T> clazz) {
        this.clazz = clazz;
        data = (T[]) Array.newInstance(clazz, 2);
    }

    @Override
    public void add(T item) {
        if (contains(item)) {  // проверка, содержит ли массив "data" значение "item" с помощью метода "contains".
            return; // сли значение "item" уже содержится в массиве, то метод завершает работу и ничего не делает.
        }
        if (size < data.length) {  //проверка, есть ли еще место в массиве для добавления нового элемента.
            for (int i = 0; i < data.length; i++) { // начинаем цикл
                if (data[i] == null) { // проверка, равен ли элемент массива "data" с индексом "i" нулю (т.е. является ли этот элемент свободным).
                    data[i] = item; // присваивание значение "item" элементу массива "data" с индексом "i".
                    break; /// прерывание цикла "for" после того, как найден свободный элемент и значение "item" добавлено в массив.
                }
            }
        } else {  // если в массиве нет свободных ячеек, то начинается блок кода, который увеличивает размер массива "data".
            T[] temp = (T[]) Array.newInstance(clazz, data.length * 2);
            ; // создание временного массива "temp" размером в два раза больше, чем массив "data".
            for (int i = 0; i < data.length; i++) { // начало цикла "for", который копирует все значения из массива "data" в массив "temp".
                temp[i] = data[i]; //  копирование значения элемента массива "data" с индексом "i" в элемент массива "temp" с тем же индексом "i".
            }
            temp[size] = item; // добавление нового элемента "item" в массив "temp" на место свободного элемента.
            data = temp; // переназначение массива "data" на временный массив "temp", чтобы массив "data" теперь ссылался на массив "temp".
        }
        size++; //увеличение значения переменной "size" на 1, чтобы отслеживать количество элементов в массиве "data".

    }

    private boolean contains(T item) {  // объявление метода "contains" с одним целочисленным аргументом "item".
        for (int i = 0; i < data.length; i++) { // начало цикла "for", который перебирает все элементы массива "data".
            if (data[i] == item) { // проверка, равен ли текущий элемент массива "data" с индексом "i" значению "item".
                return true; // если элемент с значением "item" найден в массиве "data", то метод возвращает значение "true".
            }
        }

        return false; // если метод дошел до конца цикла "for" и не нашел элемент с заданным значением "item", то метод возвращает значение "false".
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= data.length) { //  если индекс меньше 0 или больше либо равен длине массива data, то выполнить следующий блок кода
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds!"); // выбросить исключение типа ArrayIndexOutOfBoundsException, которое указывает, что индекс выходит за границы допустимого диапазона, с сообщением, которое состоит из строки "Index", переданного индекса и строки "is out of bounds!"

        }
        return data[index]; // метод возвращает значение элемента массива "data" с индексом "index".
    }

    @Override
    public T update(int index, T element) {
        if (index < 0 || index > size) { // Данное условие проверяет, находится ли индекс элемента в пределах массива. Если индекс меньше нуля или больше значения size (т.е. больше чем количество элементов в массиве), то условие будет выполнено,
            throw new ArithmeticException("If the index" + index + "is not correct");
        }

        T oldValue = data[index];
        data[index] = element; // присваивание элементу массива data с индексом index значение element. Это происходит в результате выполнения метода update.

        return oldValue;
    }

    @Override
    public void delete(int index) {
        for (int i = 0; i < size; i++) { // проходимся по массиву
            if (i == index) { // если  i равно  index
                for (int j = i; j < size - 1; j++) { // запускаем цикл, (size - 1) - доходим до предпоследнео элемента, но его не трогаем
                    data[j] = data[j + 1]; // копируем один элемен массива влево
                }
                size--; // уменьшаем размер массива
            }

        }

    }

    @Override
    public T[] getAll() {
        return data;
    }


}
