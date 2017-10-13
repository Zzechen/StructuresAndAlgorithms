package structires.tree.binary;

import structires.tree.Tree;

import javax.swing.tree.TreeNode;

/**
 * Created : zzc
 * Time : 2017/10/12
 * Email : zzcm159@gmail.com
 * Description :
 */

public class BinaryTree<T extends Comparable> implements Tree<T> {
    private BinaryNode<T> rootNode;
    private int length;
    private int height;//todo +

    public BinaryTree() {
        rootNode = new BinaryNode<>();
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public boolean contain(T value) {
        return false;
    }

    @Override
    public void insert(T value) {
        if (value == null) return;
        if (length == 0) {
            rootNode.value = value;
            length = 1;
            height = 1;
        } else {
            insert(rootNode, value);
        }
    }

    private boolean insert(BinaryNode<T> cur, T value) {
        if (cur.value.compareTo(value) == 0) {
            return false;
        } else {
            boolean left = cur.value.compareTo(value) > 0;
            BinaryNode<T> child = left ? cur.leftChild : cur.rightChild;
            if (child == null) {
                child = new BinaryNode<>();
                child.value = value;
                if (left) {
                    cur.leftChild = child;
                } else {
                    cur.rightChild = child;
                }
                length += 1;
                return true;
            } else {
                return insert(child, value);
            }
        }
    }

    @Override
    public boolean remove(T value) {
        if (value == null) return false;
        return false;
    }

    @Override
    public T findMin() {
        return find(true, rootNode).value;
    }

    @Override
    public T findMax() {
        return find(false, rootNode).value;
    }

    private BinaryNode<T> find(boolean left, BinaryNode<T> node) {
        BinaryNode<T> child = left ? node.leftChild : node.rightChild;
        if (child == null) return node;
        return find(left, child);
    }

    @Override
    public void clear() {
        rootNode.value = null;
        rootNode.leftChild = null;
        rootNode.rightChild = null;
        length = 0;
        height = 0;
    }
}
