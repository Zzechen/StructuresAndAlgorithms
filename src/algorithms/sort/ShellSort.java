package algorithms.sort;

/**
 * Created : zzc
 * Time : 2017/9/26
 * Email : zzcm159@gmail.com
 * Description :希尔排序
 */

public class ShellSort {
    public static void main(String arg[]) {
        int[] arr = ArrUtils.randomArr(30);
        int[] arrSorted = shellSort(arr);
        for (int a = 0; a < arrSorted.length; a++) {
            System.out.println(arrSorted[a]);
        }
    }

    public static int[] shellSort(int arr[]) {
        if (arr != null && arr.length > 1) {
            int j;
            for (int gap = arr.length / 2; gap > 0; gap /= 2) {
                for (int i = gap; i < arr.length; i++) {
                    int temp = arr[i];
                    for (j = i; j >= gap && temp < arr[j - gap]; j -= gap) {
                        arr[j] = arr[j - gap];
                    }
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
