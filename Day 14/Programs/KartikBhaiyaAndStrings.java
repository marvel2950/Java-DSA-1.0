import java.util.*;

public class KartikBhaiyaAndStrings {
      public static void main(String[] args) {

            // Scanner sc = new Scanner(System.in);
            // int k = sc.nextInt();
            // String str = sc.next();

            int k = 2;
            String str = "abababbababaaaaaaabbbbbaaa";
            int max_a = max_length(str, 'b', k);
            int max_b = max_length(str, 'a', k);
            System.out.println(Math.max(max_a, max_b));
      }

      public static int max_length(String s, char ch, int k) {
            int si = 0, ei = 0, ans = 0, flip = 0;
            while (ei < s.length()) {
                  // grow
                  if (s.charAt(ei) == ch) {
                        flip++;
                  }
                  // shrink
                  while (flip > k && si <= ei) {
                        if (s.charAt(si) == ch) {
                              flip--;
                        }
                        si++;
                  }
                  // calculate ans
                  ans = Math.max(ans, ei - si + 1);
                  ei++;
            }
            return ans;
      }
}