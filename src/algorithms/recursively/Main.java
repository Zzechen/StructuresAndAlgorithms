package algorithms.recursively;

import structires.collections.Collections;

/**
 * Created : zzc
 * Time : 2017/9/28
 * Email : zzcm159@gmail.com
 * Description :
 */

class Main {
    public static void main(String arg[]) {
        System.out.println(fibonacci(10));
        Node<String> head = new Node<>();
        Node<String> tail = new Node<>();
        head.next = tail;
        for (int i = 0; i < 10; i++) {
            String element = "element" + i;
            if (tail.element == null) {
                tail.element = element;
            } else {
                Node<String> node = new Node<>();
                node.element = element;
                tail.next = node;
                tail = node;
            }
        }
        printLink(head);
        System.out.println("------------------");
        Node<String> newHead = new Node<>();
        newHead.next = linkReverse(head);
        printLink(newHead);
    }

    private static void printLink(Node<String> head) {
        Node<String> node = head.next;
        while (node.element != null) {
            System.out.println(node.element);
            if (node.next == null) {
                break;
            } else {
                node = node.next;
            }
        }
    }

    /**
     * 斐波那契
     *
     * @param index
     * @return
     */
    public static long fibonacci(int index) {
        if (index == 0) {
            return 1;
        } else if (index == 1) {
            return 2;
        } else {
            return fibonacci(index - 2) + fibonacci(index - 1);
        }
    }

    public static <T> Node<T> linkReverse(Node<T> head) {
        return reverse(head, head.next);
    }

    /**
     * 反转
     *
     * @param head
     * @param next
     * @param <T>
     * @return
     */
    private static <T> Node<T> reverse(Node<T> head, Node<T> next) {
        if (next != null) {
            Node<T> newNext = next.next;
            next.next = head;
            return reverse(next, newNext);
        } else {
            return head;
        }
    }

    /**
     * 单链表节点
     *
     * @param <T>
     */
    static class Node<T> {
        T element;
        Node<T> next;
    }
}

