package structires.tree.binary;

import structires.tree.Tree;

import java.util.Random;

/**
 * Created : zzc
 * Time : 2017/10/13
 * Email : zzcm159@gmail.com
 * Description :
 */

class Main {
    public static void main(String arg[]) {
        Tree<Integer> tree = new BinaryTree<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int value = r.nextInt(10000) + 1;
            tree.insert(value);
            System.out.println(String.format("value:%d,tree size:%d", value, tree.size()));
        }
        System.out.println("min:" + tree.findMin());
        System.out.println("max:" + tree.findMax());
        tree.clear();
        System.out.println("clear:" + tree.size());
    }
}

