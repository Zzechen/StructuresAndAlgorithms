package structires.table.doublelinked;

import structires.table.List;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

public class DoubleLinkedList<E> implements List<E> {
    private Node<E> header;
    private Node<E> footer;
    private int length;

    public DoubleLinkedList() {
        header = new Node<>();
        footer = new Node<>();
        header.next = footer;
        footer.prev = header;
    }

    @Override
    public boolean add(E item) {
        if (item == null) return false;
        if (footer.item == null) {
            footer.item = item;
        } else {
            Node<E> newNode = new Node<>();
            newNode.prev = footer.prev;
            newNode.prev.next = newNode;
            newNode.next = footer;
            newNode.item = footer.item;
            footer.item = item;
            footer.prev = newNode;
        }
        length += 1;
        return true;
    }

    @Override
    public boolean add(int index, E item) {
        if (index < 0 || index > length) return false;
        Node<E> node = null;
        if (index < length / 2) {
            node = header;
            for (int i = 0; i < index + 1; i++) {
                node = node.next;
            }
        } else {
            node = footer;
            for (int i = length; i > index + 1; i--) {
                node = node.prev;
            }
        }
        Node<E> newNode = new Node<>();
        newNode.item = item;
        newNode.next = node;
        newNode.prev = node.prev;
        node.prev.next = newNode;
        node.prev = newNode;
        length += 1;
        return true;
    }

    @Override
    public E set(int index, E item) {
        if (index < 0 || index > length) return null;
        Node<E> node = null;
        if (index < length / 2) {
            node = header;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = footer;
            for (int i = length; i > index; i--) {
                node = node.prev;
            }
        }
        E oldItem = node.item;
        node.item = item;
        return oldItem;
    }

    @Override
    public boolean addAll(List<E> items) {
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
    public boolean addAll(int index, List<E> items) {
        if (index < 0 || index > length) return false;
        if (items == null) return false;
        int size = items.size();
        if (size == 0) return false;
        Node<E> node = null;
        if (index < length / 2) {
            node = header;
            for (int i = 0; i < index + 1; i++) {
                node = node.next;
            }
        } else {
            node = footer;
            for (int i = length; i > index; i--) {
                node = node.prev;
            }
        }
        for (int i = 0; i < size; i++) {
            E item = items.get(i);
            if (!contains(item)) {
                Node<E> newNode = new Node<>();
                newNode.item = item;
                newNode.prev = node.prev;
                newNode.prev.next = newNode;
                newNode.next = node;
                node.prev = newNode;
                length += 1;
            }
        }
        return true;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index > length) return false;
        Node<E> node = null;
        if (index < length / 2) {
            node = header;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = footer;
            for (int i = length; i > index + 1; i++) {
                node = node.prev;
            }
        }
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        prev.next = next;
        next.prev = prev;
        length -= 1;
        return true;
    }

    @Override
    public boolean remove(E item) {
        if (item == null) return false;
        Node<E> node = header;
        for (int i = 0; i < length; i++) {
            node = node.next;
            if (node != null && item.equals(node.item)) {
                Node<E> prev = node.prev;
                Node<E> next = node.next;
                prev.next = next;
                next.prev = prev;
                length -= 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(E item) {
        if (item == null) return false;
        Node<E> node = header;
        for (int i = 0; i < length; i++) {
            node = node.next;
            if (node != null && item.equals(node.item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > length) return null;
        Node<E> value = null;
        if (index < length / 2) {
            value = header;
            for (int i = 0; i <= index; i++) {
                value = value.next;
            }
        } else {
            value = footer;
            for (int i = length; i > index + 1; i--) {
                value = value.prev;
            }
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
}
