package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T>{

    @Override
    public boolean add(T item) {
        if(!this.contains(item)){
            return super.add(item);
        }
        return false;
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        super.remove(o);
        sort();
        return true;
    }
}
