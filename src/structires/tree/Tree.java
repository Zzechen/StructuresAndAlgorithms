package structires.tree;

/**
 * Created : zzc
 * Time : 2017/10/12
 * Email : zzcm159@gmail.com
 * Description :
 */

public interface Tree<T> {
    int size();

    int height();

    boolean isEmpty();

    boolean contain(T value);

    void insert(T value);

    boolean remove(T value);

    T findMin();

    T findMax();

    void clear();
}
