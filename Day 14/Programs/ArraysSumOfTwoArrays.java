import java.util.*;

public class ArraysSumOfTwoArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int n1 = sc.nextInt();
        // int[] arr1 = new int[n1];
        // for (int i = 0; i < n1; i++) {
        //     arr1[i] = sc.nextInt();
        // }
        // int n2 = sc.nextInt();
        // int[] arr2 = new int[n2];
        // for (int i = 0; i < n2; i++) {
        //     arr2[i] = sc.nextInt();
        // }
        int[] arr1 = { 1, 0, 2, 9 };
        int[] arr2 = { 3, 2, 4, 5, 6, 7 };
        int[] ans = sumOfTwoArrays(arr1, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + ", ");
        }
        System.out.println("END");
    }

    public static int[] sumOfTwoArrays(int[] a1, int[] a2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = a1.length - 1;
        int j = a2.length - 1;

        int carry = 0;
        while (i >= 0 && j >= 0) {
            int sum = a1[i] + a2[j] + carry;
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            list.add(sum);
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = a1[i] + carry;
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            list.add(sum);
            i--;
        }
        while (j >= 0) {
            int sum = a2[j] + carry;
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            list.add(sum);
            j--;
        }

        if (carry > 0) {
            list.add(carry);
        }

        int[] ans = new int[list.size()];
        int l = 0;
        for (int k = list.size() - 1; k >= 0; k--) {
            ans[l++] = list.get(k);
        }
        return ans;

    }
}