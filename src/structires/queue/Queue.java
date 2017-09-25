package structires.queue;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

interface Queue<E> {
    boolean offer(E element);

    boolean add(int index, E element);

    E set(int index, E element);

    E get(int index);

    E poll();

    boolean remove(int index);

    int size();

    boolean contains(E element);
}
