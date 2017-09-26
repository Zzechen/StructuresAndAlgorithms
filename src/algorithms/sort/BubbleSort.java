package algorithms.sort;

import structires.collections.Collections;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

public class BubbleSort {
    public static void main(String arg[]) {
        int[] arr = new int[]{10, 2, 5, 3, 20, 12, 23, 22, 14};
        int[] arrNew = bubble(arr);
        for (int i = 0; i < arrNew.length; i++) {
            System.out.println(arrNew[i]);
        }
    }

    private static int[] bubble(int[] arr) {
        if (arr != null && (arr.length > 1)) {
            int size = arr.length;
            for (int i = 1; i < size; i++) {
                for (int j = 0; j < size - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        arr[j] += arr[j + 1];
                        arr[j + 1] = arr[j] - arr[j + 1];
                        arr[j] -= arr[j + 1];
                    }
                }
            }
        }
        return arr;
    }
}
