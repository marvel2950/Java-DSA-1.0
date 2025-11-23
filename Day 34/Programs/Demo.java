public class Demo {
    public static void main(String args[]) {
        Integer[] arr1 = {10, 20, 30, 40, 59};
        display(arr1);

        String[] arr2 = {"Akarsh", "Aastha", "Abhya", "Abhishek"};
        display(arr2);
    }

    public static void display(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void display(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}
