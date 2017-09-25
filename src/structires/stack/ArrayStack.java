package structires.stack;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

class ArrayStack<E> implements Stack<E> {
    private static final int SIZE_DEFAULT = 10;
    private Object[] itemArr;
    private int maxSize;
    private int size;

    public ArrayStack() {
        maxSize = SIZE_DEFAULT;
        itemArr = new Object[maxSize];
    }

    public ArrayStack(int size) {
        this.maxSize = size;
        itemArr = new Object[maxSize];
    }

    @Override
    public void push(E item) {
        if (item == null) return;
        ensureSize();
        itemArr[size] = item;
        size++;
    }

    @Override
    public E pop() {
        if (size == 0) return null;
        return (E) itemArr[--size];
    }

    @Override
    public E top() {
        return (E) itemArr[size];
    }

    @Override
    public E bottom() {
        return (E) itemArr[0];
    }

    @Override
    public E get(int index) {
        return (E) itemArr[index];
    }

    @Override
    public boolean insert(int index, E item) {
        if (index < 0 || index > size) return false;
        ensureSize();
        System.arraycopy(itemArr, index, itemArr, index + 1, size - index);
        itemArr[index] = item;
        size++;
        return true;
    }

    @Override
    public E set(int index, E item) {
        if (index < 0 || index > size) return null;
        E old = (E) itemArr[index];
        itemArr[index] = item;
        return old;
    }

    @Override
    public boolean remove(E item) {
        if (item == null) return false;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (item.equals(itemArr[i])) {
                index = i;
                break;
            }
        }
        return index == -1 ? false : remove(index);
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index > size) return false;
        if (index == size) {
            itemArr[size] = null;
        } else {
            System.arraycopy(itemArr, index + 1, itemArr, index, size - index - 1);
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E item) {
        if (item == null) return false;
        for (int i = 0; i < size; i++) {
            if (item.equals(itemArr[i])) {
                return true;
            }
        }
        return false;
    }

    private void ensureSize() {
        if (size == maxSize - 1) {
            Object[] arr = new Object[maxSize *= 2];
            System.arraycopy(itemArr, 0, arr, 0, size);
            itemArr = arr;
        }
    }
}
