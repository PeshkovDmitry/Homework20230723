import java.util.*;
import java.util.function.Supplier;

public class DataContainer<T> {

    private final Supplier<? extends T> ctor;

    private T[] data;

    private int position;

    public DataContainer(Supplier<? extends T> ctor) {
        this.ctor = Objects.requireNonNull(ctor);
        data = (T[]) Collections.singletonList(ctor.get()).toArray();
        position = 0;
    }

    public T get(int pos) {
        return pos < data.length ? data[pos] : null;
    }

    public void add(T item) {
        if (position >= data.length - 1) {
            T[] newdata = Arrays.copyOf(data, 2 * data.length);
            data = newdata;
        }
        data[position++] = item;
    }

    public void sort(Comparator<T> comp) {
        data = Arrays.copyOf(data, position);
        Arrays.sort(data, comp);
    }

    public void print() {
        for (int i = 0; i < position; i++) {
            System.out.println(data[i]);
        }
    }

}
