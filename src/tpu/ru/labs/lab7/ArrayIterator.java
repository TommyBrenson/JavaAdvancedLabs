package tpu.ru.labs.lab7;

public class ArrayIterator<T> implements Iterator {

    private int index = 0;
    private T[] array;

    public ArrayIterator (T[] array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.array.length && this.array[index] != null;
    }

    @Override
    public T current() {
        return (this.hasNext()) ? this.array[this.index++] : null;
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
