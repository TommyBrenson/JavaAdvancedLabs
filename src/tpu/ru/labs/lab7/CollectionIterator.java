package tpu.ru.labs.lab7;

import java.util.List;

public class CollectionIterator<T> implements Iterator {

    private int index = 0;
    private List<T> collection;

    public CollectionIterator(List<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.collection.size() && this.collection.get(index) != null;
    }

    @Override
    public T current() {
        return (this.hasNext()) ? collection.get(this.index++) : null;
    }

    @Override
    public void resetIndex() {
        this.index = 0;
    }

    @Override
    public int getIndex() {
        return this.index;
    }
}
