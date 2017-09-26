package algorithms.sort;

import structires.collections.Collections;
import structires.table.single.SingleLinkedList;

import java.util.Random;

/**
 * Created : zzc
 * Time : 2017/9/26
 * Email : zzcm159@gmail.com
 * Description :插入排序
 */

public class InsertSort {
    public static void main(String arg[]) {
        int arr[] = ArrUtils.randomArr(20);
        int[] sortedArr = insertSort(arr);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println(sortedArr[i]);
        }
    }

    public static int[] insertSort(int[] arr) {
        if (arr != null && arr.length > 1) {
            int size = arr.length;
            for (int i = 0; i < size - 1; i++) {
                for (int j = size - 1; j > i; j--) {
                    if (arr[j] < arr[i]) {
                        arr[j] += arr[i];
                        arr[i] = arr[j] - arr[i];
                        arr[j] -= arr[i];
                    }
                }
            }
        }
        return arr;
    }
}
