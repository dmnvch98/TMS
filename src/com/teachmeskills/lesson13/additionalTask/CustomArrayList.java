package com.teachmeskills.lesson13.additionalTask;

import java.util.Arrays;
import java.util.Iterator;

import static com.teachmeskills.lesson13.additionalTask.ArrayUtils.concatWithArrayCopy;

public class CustomArrayList<T> implements Iterable {
    private static final int DEFAULT_SIZE = 0;
    private static final int GROW_LENGTH = 10;
    private T[] values;
    private int freePositions = 0;
    private int lastAvailablePosition = 0;

    public CustomArrayList() {
        values = (T[]) new Object[DEFAULT_SIZE];
    }

    public CustomArrayList(int size) {
        values = (T[]) new Object[size];
        freePositions = size;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator<T>(values);
    }

    public int size() {
        return values.length;
    }

    public void update(int index, T value) {
        values[index] = value;
    }

    public T get(int index) {
        return values[index];
    }

    public void add(T value) {
        if (lastAvailablePosition == values.length) {
            addToFullArray(value);
        } else {
            addToNotFullArray(value);
        }
    }

    private boolean addToFullArray(T value) {
        try {
            T[] tempValues = values;
            values = Arrays.copyOf(tempValues, values.length + 1);
            values[tempValues.length] = value;
            lastAvailablePosition++;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean addToNotFullArray(T value) {
        try {
            values[lastAvailablePosition] = value;
            lastAvailablePosition++;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
            return false;
        }
    }
//1 2 3
    public boolean remove(int index) {
        try {
            T[] leftPartOfArray = Arrays.copyOfRange(values, 0, index);
            T[] rightPartOfArray = Arrays.copyOfRange(values, index + 1, values.length);
            values = concatWithArrayCopy(leftPartOfArray, rightPartOfArray);
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clear() {
        values = (T[]) new Object[0];
        lastAvailablePosition = 0;
        freePositions = 0;
    }

    public boolean isPresent(T findValue) {
        for (T iterableValue: values) {
            if (iterableValue == findValue) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
