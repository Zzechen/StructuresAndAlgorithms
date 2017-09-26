package algorithms.sort;

/**
 * Created : zzc
 * Time : 2017/9/26
 * Email : zzcm159@gmail.com
 * Description :归并排序
 */

public class MergeSort {
    public static void main(String arg[]) {
        int length = 20;
        int[] arr = ArrUtils.randomArr(length);
        int[] result = new int[length];
        mergeSortRecursive(arr, result, 0, length - 1);
        System.out.println("mergeSortRecursive:");
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("mergeSortItr:");
        int[] arrItr = ArrUtils.randomArr(length);
        mergeSortItr(arrItr);
        for (int i = 0; i < length; i++) {
            System.out.println(arrItr[i]);
        }
    }

    /**
     * 迭代法
     *
     * @param arr
     * @return
     */
    public static void mergeSortItr(int arr[]) {
        int len = arr.length;
        int[] result = new int[len];
        int block, start;

        for (block = 1; block < len * 2; block *= 2) {
            for (start = 0; start < len; start += 2 * block) {
                int low = start;
                int mid = (start + block) < len ? (start + block) : len;
                int high = (start + 2 * block) < len ? (start + 2 * block) : len;
                int start1 = low, end1 = mid;
                int start2 = mid, end2 = high;
                while (start1 < end1 && start2 < end2) {
                    result[low++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
                }
                while (start1 < end1) {
                    result[low++] = arr[start1++];
                }
                while (start2 < end2) {
                    result[low++] = arr[start2++];
                }
            }
            int[] temp = arr;
            arr = result;
            result = temp;
        }
    }

    /**
     * 递归法
     *
     * @param arr
     * @return
     */
    public static void mergeSortRecursive(int arr[], int result[], int start, int end) {
        if (start >= end) return;
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        mergeSortRecursive(arr, result, start1, end1);
        mergeSortRecursive(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        while (start1 <= end1)
            result[k++] = arr[start1++];
        while (start2 <= end2)
            result[k++] = arr[start2++];
        for (k = start; k <= end; k++) {
            arr[k] = result[k];
        }
    }
}
