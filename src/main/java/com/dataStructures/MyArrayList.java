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

    }

    @Override
    public int[] getAll() {
        return new int[0];
    }

    public int size() {
        return 0;
    }
}
