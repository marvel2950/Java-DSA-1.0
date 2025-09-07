public class SplitAndTrim {
    public static void main(String[] args) {
        String s = "the   sky   is blue";
        String[] arr = s.split(" +");

        for (String str : arr) {
            System.out.println(str);
        }

        String a = "  abtgfyj  ";
        System.out.println(a);
        a = a.trim();
        System.out.println(a);

    }
}
