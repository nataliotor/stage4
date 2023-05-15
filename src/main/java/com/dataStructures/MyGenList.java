package com.dataStructures;

public interface MyGenList <T>{
    public void add(T item);
    public T get(int index);
    public T update (int index, T element);
    public void delete(int index);
    public T[] getAll();


}
