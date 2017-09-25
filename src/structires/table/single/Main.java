package structires.table.single;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

class Main {
    public static void main(String arg[]) {
        SingleLinkedList<String> singleLinkedList = new SingleLinkedList<>();
        for (int i = 0; i < 10; i++) {
            singleLinkedList.add("item" + i);
        }
        System.out.println("singleLinkedList's size is " + singleLinkedList.size());
        System.out.println("remove index = 2,success:" + singleLinkedList.remove(2));
        System.out.println("remove item:'item5',success:" + singleLinkedList.remove("item5"));
        System.out.println("singleLinkedList's size is " + singleLinkedList.size());
        System.out.println("add 4:item11---" + singleLinkedList.add(4, "item11"));
        System.out.println("set 3:item11---" + singleLinkedList.set(3, "item13"));
        int size = singleLinkedList.size();
        for (int i = 0; i < size; i++) {
            System.out.println(singleLinkedList.get(i));
        }
        SingleLinkedList<String> linkedList = new SingleLinkedList<>();
        long last = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add("item:" + i);
        }
        System.out.println("SingleLinkedList:add 1000000 and time is :" + (System.currentTimeMillis() - last));
        last = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        System.out.println("SingleLinkedList:get 10000 and time is :" + (System.currentTimeMillis() - last));
        ArrayList<String> list = new ArrayList<>();
        last = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add("item" + i);
        }
        System.out.println("ArrayList:add 1000000 and time is :" + (System.currentTimeMillis() - last));
        last = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.get(i);
        }
        System.out.println("ArrayList:get 1000000 and time is :" + (System.currentTimeMillis() - last));

    }
}
