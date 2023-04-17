package com.dataStructures;


public class MyArrayList implements MyList {
    private int[] data = new int[2];
    private int size;


    @Override
    public void add(int item) {
        if (size == data.length) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == 0) {
                    data[i] = item;
                    size++;
                }
            }
        }


    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int update(int index, int element) {
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
