package com.dataStructures;

public interface MyList {

    public void add(int item);
    public int get(int index);
    public int update (int index, int element);
    public void delete(int index);
    public int[] getAll();

}
