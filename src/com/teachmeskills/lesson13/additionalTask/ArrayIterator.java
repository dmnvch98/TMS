package com.teachmeskills.lesson13.additionalTask;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private int index = 0;
    T[] values;

    public ArrayIterator(T[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
