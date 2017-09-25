package structires.tree;

import structires.collections.Collections;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

public class ArrayTree<E> implements Tree<E> {
    @Override
    public boolean add(E item) {
        return false;
    }

    @Override
    public boolean add(int index, E item) {
        return false;
    }

    @Override
    public E set(int index, E item) {
        return null;
    }

    @Override
    public boolean addAll(Collections<E> items) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collections<E> items) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(E item) {
        return false;
    }

    @Override
    public boolean contains(E item) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void union(E nodeA, E nodeB) {

    }

    @Override
    public E findParent(E node) {
        return null;
    }

    @Override
    public Collections<E> findChildren(E node) {
        return null;
    }
}
