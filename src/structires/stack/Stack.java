package structires.stack;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

interface Stack<E> {
    void push(E item);

    E pop();

    E top();

    E bottom();

    E get(int index);

    boolean insert(int index, E item);

    E set(int index, E item);

    boolean remove(E item);

    boolean remove(int index);

    int size();

    boolean contains(E item);
}
