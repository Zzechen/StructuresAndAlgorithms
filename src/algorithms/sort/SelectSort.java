package algorithms.sort;

/**
 * Created : zzc
 * Time : 2017/9/25
 * Email : zzcm159@gmail.com
 * Description :
 */

public class SelectSort {
    public static void main(String arg[]) {
        int arr[] = new int[]{2, 5, 3, 17, 4, 22, 8, 44, 34, 23};
        int[] select = select(arr);
        final int size = select.length;
        for (int i = 0; i < size; i++) {
            System.out.println(select[i]);
        }
    }

    public static int[] select(int arr[]) {
        if (arr != null && arr.length > 1) {
            int size = arr.length;
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] > arr[j]) {
                        arr[i] += arr[j];
                        arr[j] = arr[i] - arr[j];
                        arr[i] -= arr[j];
                    }
                }
            }
        }
        return arr;
    }
}
