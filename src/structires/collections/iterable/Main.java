package structires.collections.iterable;

import structires.collections.Collections;
import structires.table.doublelinked.DoubleLinkedList;
import structires.table.single.SingleLinkedList;

import java.util.Random;

/**
 * Created : zzc
 * Time : 2017/9/26
 * Email : zzcm159@gmail.com
 * Description :
 */

class Main {
    public static void main(String arg[]) {
        Collections<Integer> singleLinkedList = new SingleLinkedList<>();
        Collections<Integer> doubleLinkedList = new DoubleLinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            singleLinkedList.add(r.nextInt(30));
            doubleLinkedList.add(r.nextInt(30));
        }
        for (Integer value : singleLinkedList) {
            System.out.println("singleLinkedList:" + value);
        }
        for (Integer value : doubleLinkedList) {
            System.out.println("doubleLinkedList:" + value);
        }
    }
}
