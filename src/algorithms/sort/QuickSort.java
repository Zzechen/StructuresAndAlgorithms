package algorithms.sort;

import structires.collections.Collections;
import structires.table.single.SingleLinkedList;

import java.util.Random;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :快速排序
 */

public class QuickSort {
    public static void main(String arg[]) {
        Collections<Integer> collections = new SingleLinkedList<>();
        Random r = new Random();
        while (collections.size() < 10) {
            int value = r.nextInt(10) + 1;
            if (!collections.contains(value)) {
                collections.add(value);
            }
        }
        for (int i = 0; i < collections.size(); i++) {
            System.out.print(collections.get(i) + "  ");
            if (i == collections.size() - 1) {
                System.out.println();
            }
        }
        sort(collections);
        for (int i = 0; i < collections.size(); i++) {
            System.out.println(collections.get(i));
        }
    }

    public static void sort(Collections<Integer> items) {
        if (items == null) return;
        if (items.size() > 1) {
            Collections<Integer> smaller = new SingleLinkedList<>();
            Collections<Integer> same = new SingleLinkedList<>();
            Collections<Integer> larger = new SingleLinkedList<>();
            Integer chosenItem = items.get(items.size() / 2);
            for (int i = 0; i < items.size(); i++) {
                Integer item = items.get(i);
                if (item < chosenItem) {
                    smaller.add(item);
                } else if (item > chosenItem) {
                    larger.add(item);
                } else {
                    same.add(item);
                }
            }
            sort(smaller);
            sort(larger);
            items.clear();
            items.addAll(smaller);
            items.addAll(same);
            items.addAll(larger);
        }
    }
}
