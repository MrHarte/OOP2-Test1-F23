package com.champlain.oop2test1f23;

import java.util.ArrayList;
import java.util.Iterator;

public class ReverseArrayList<E> extends ArrayList<E> {
    ReverseArrayList<E> self = this;

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }
        };
    }
}
