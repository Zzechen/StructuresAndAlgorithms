package structires.table.doublelinked;

import java.util.LinkedList;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

class Main {
    public static void main(String arg[]) {
        DoubleLinkedList<String> doubleLinkedList = new DoubleLinkedList<>();
        for (int i = 0; i < 10; i++) {
            doubleLinkedList.add("item:" + i);
        }
//        doubleLinkedList.add(0, "item:12");
//        doubleLinkedList.remove(2);
//        doubleLinkedList.remove("item:3");
        for (int i = 0; i < doubleLinkedList.size(); i++) {
            System.out.println(doubleLinkedList.get(i));
        }
        DoubleLinkedList<String> doubleLinkedList2 = new DoubleLinkedList<>();
        long last = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            doubleLinkedList2.add("item" + i);
        }
        System.out.println("DoubleLinkedList:add 100000 and time is :" + (System.currentTimeMillis() - last));
        last = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            doubleLinkedList2.get(i);
        }
        System.out.println("DoubleLinkedList:get 100000 and time is :" + (System.currentTimeMillis() - last));
    }
}
