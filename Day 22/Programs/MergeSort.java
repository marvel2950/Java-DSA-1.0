public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 2, 4, 1 };
        int[] a = sort(arr, 0, arr.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] sort(int[] arr, int si, int ei) {
        if (si == ei) {
            int[] bs = { arr[si] };
            return bs;
        }

        int mid = (si + ei) / 2;
        int[] first = sort(arr, si, mid); // 1st part sorted by recursion
        int[] second = sort(arr, mid + 1, ei); // 2nd part sorted by recursion
        return merge(first, second);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] arr = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while (j < m) {
            arr[k] = arr2[j];
            k++;
            j++;
        }
        return arr;
    }
}
