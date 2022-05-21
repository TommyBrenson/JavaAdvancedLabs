package tpu.ru.labs.lab7;

public interface Iterator<T> {
    public boolean hasNext();
    public T current();
    public void resetIndex();
    public int getIndex();
}
