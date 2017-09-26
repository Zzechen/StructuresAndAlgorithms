package algorithms.sort;

import structires.collections.Collections;
import structires.table.single.SingleLinkedList;

import java.util.Random;

/**
 * Created : zzc
 * Time : 2017/9/26
 * Email : zzcm159@gmail.com
 * Description :
 */

public class ArrUtils {
    public static int[] randomArr(int lenth) {
        Collections<Integer> collections = new SingleLinkedList<>();
        Random r = new Random();
        int arr[] = new int[lenth];
        while (collections.size() < lenth) {
            int value = r.nextInt(lenth * 2) + 1;
            if (!collections.contains(value)) {
                collections.add(value);
                arr[collections.size() - 1] = value;
            }
        }
        return arr;
    }
}
