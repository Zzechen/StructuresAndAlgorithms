package structires.table.single;

import structires.collections.Collections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

public class SingleLinkedList<E> implements Collections<E> {
    private int length;
    private Node<E> header;
    private Node<E> footer;

    public SingleLinkedList() {
        header = new Node<>();
        footer = new Node<>();
        header.next = footer;
    }

    @Override
    public boolean add(E item) {
        if (footer.item == null) {
            footer.item = item;
        } else {
            Node<E> node = footer;
            footer = new Node<>();
            footer.item = item;
            node.next = footer;
        }
        length += 1;
        return true;
    }

    @Override
    public boolean add(int index, E item) {
        if (index < 0 || index > length) return false;
        Node<E> prev = header;
        Node<E> cur = header.next;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
            cur = prev.next;
        }
        Node<E> addNode = new Node<>();
        addNode.item = item;
        addNode.next = cur;
        prev.next = addNode;
        length += 1;
        return true;
    }

    @Override
    public E set(int index, E item) {
        if (index < 0 || index > length) return null;
        Node<E> prev = header;
        Node<E> cur = header.next;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
            cur = prev.next;
        }
        E old = cur.item;
        cur.item = item;
        return old;
    }

    @Override
    public boolean addAll(Collections<E> items) {
        if (items == null) return false;
        int size = items.size();
        for (int i = 0; i < size; i++) {
            E item = items.get(i);
            if (!contains(item)) {
                add(item);
            }
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collections<E> items) {
        throw new IllegalArgumentException("not impl");
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index > length) return false;
        Node<E> value = header;
        Node<E> next = value.next;
        for (int i = 0; i < index; i++) {
            value = next;
            next = value.next;
        }
        if (next != null) {
            value.next = next.next;
            length -= 1;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(E item) {
        if (item == null) return false;
        Node<E> value = header;
        for (int i = 1; i < length; i++) {
            Node<E> next = value.next;
            if (item.equals(next.item)) {
                value.next = next.next;
                length -= 1;
                return true;
            }
            value = value.next;
        }
        return false;
    }

    @Override
    public boolean contains(E item) {
        if (item == null) return false;
        Node<E> value = header;
        for (int i = 0; i < length; i++) {
            value = value.next;
            if (value != null && item.equals(value.item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > length) return null;
        Node<E> value = header.next;
        for (int i = 0; i < index; i++) {
            value = value.next;
        }
        return value.item;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public void clear() {
        header.next = footer;
        footer.item = null;
        length = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {
        Node<E> cur;

        public Itr() {
            cur = header;
        }

        @Override
        public boolean hasNext() {
            return cur.next != null && footer.item != null;
        }

        @Override
        public E next() {
            cur = cur.next;
            return cur.item;
        }

        @Override
        public void remove() {
            SingleLinkedList.this.remove(cur.item);
        }
    }
}
