package structires.queue;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

class ArrayQueue<E> implements Queue<E> {
    private static final int SIZE_DEFAULT = 10;
    private Object[] elementArr;
    private int maxSize;
    private int size;

    public ArrayQueue() {
        maxSize = SIZE_DEFAULT;
        elementArr = new Object[maxSize];
    }

    public ArrayQueue(int size) {
        maxSize = size;
        elementArr = new Object[size];
    }

    @Override
    public boolean offer(E element) {
        if (element == null) return false;
        ensureSize();
        elementArr[size] = element;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        if (index < 0 || index > size || element == null) return false;
        ensureSize();
        System.arraycopy(elementArr, index, elementArr, index + 1, size - index - 1);
        elementArr[index] = element;
        size++;
        return true;
    }

    @Override
    public E set(int index, E element) {
        E old = (E) elementArr[index];
        elementArr[index] = element;
        return old;
    }

    @Override
    public E get(int index) {
        return (E) elementArr[index];
    }

    /**
     * maybe there has a offset be better,and in offer/add change offset to 0
     *
     * @return
     */
    @Override
    public E poll() {
        E first = (E) elementArr[0];
        System.arraycopy(elementArr, 1, elementArr, 0, size - 1);
        size--;
        return first;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index > size) return false;
        if (index == size) {
            elementArr[size] = null;
        } else {
            System.arraycopy(elementArr, index + 1, elementArr, index, size - index - 1);
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E element) {
        if (element == null) return false;
        for (int i = 0; i < size; i++) {
            E value = (E) elementArr[i];
            if (element.equals(value)) {
                return true;
            }
        }
        return false;
    }

    private void ensureSize() {
        if (size == maxSize - 1) {
            Object[] items = new Object[maxSize *= 2];
            System.arraycopy(elementArr, 0, items, 0, size);
            elementArr = items;
        }
    }
}
