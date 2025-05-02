package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class WorkintechList extends ArrayList implements Collection {

    public void sort(){
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        this.sort();
        return super.remove(o);
    }

    @Override
    public boolean add(Object o) {
        if(this.contains(o)) {
            return false;
        }
        return super.add(o);
    }
}
