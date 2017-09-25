package structires.table.doublelinked;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

public class Node<E> {
    Node<E> prev;
    E item;
    Node<E> next;

    public Node(Node<E> node) {
        if (node != null) {
            prev = node.prev;
            item = node.item;
            next = node.next;
        }
    }

    public Node() {
    }
}
