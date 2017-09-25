package structires.collections;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

public interface Collections<E> {
    boolean add(E item);

    boolean add(int index, E item);

    E set(int index, E item);

    boolean addAll(Collections<E> items);

    boolean addAll(int index, Collections<E> items);

    boolean remove(int index);

    boolean remove(E item);

    boolean contains(E item);

    E get(int index);

    int size();

    boolean isEmpty();
}
