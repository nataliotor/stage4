package com.dataStructures;


public class MyArrayList implements MyList {
    private int[] data = new int[2];
    private int size;


    @Override
    public void add(int item) {  // добавляет новый элемент item в массив data
        if (size == data.length) {  //Если размер массива data равен количеству элементов, которые он уже содержит, то выполнить следующий блок кода
            for (int i = 0; i < data.length; i++) { // начинаем цикл
                if (data[i] == 0) { // Если значение элемента массива data с индексом i равно 0, то выполнить
                    data[i] = item; // Присвоить значение item элементу массива data с индексом i.
                    size++; // Увеличить значение переменной size на 1.
                }
            }
        }

    }

    @Override
    public int get(int index) { // получить элемент
        for (int i = 0; i < data.length; i++) { // проходимся по массиву
            if (i == index) { // если i совпадает с index
                return data[i]; // верни значение data
            }
        }
        return 0; // если нет - верни 0
    }

    @Override
    public int update(int index, int element) {
        if (size == data.length) { // проверяем заполнен ли массив внутри
            for (int i = 0; i < data.length; i++) { // проходимся по длине массива
                if (i != index || i == element) { // если i не равен index и i равен element
                    data[i] = element; // возьми element и добавь его в ячейку
                    size++; // увеличь значение size на 1
                }

            }
        }
        return 0;
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
    public int[] getAll() {
        return new int[0];
    }

    public int size() {
        return 0;
    }
}
