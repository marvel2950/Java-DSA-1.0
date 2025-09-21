
public class CheckCharacterPresenceFromIndex {
    public static void main(String[] args) {
        String str = "ddfhag";
        int index = 2;
        char ch = 'h';
        System.out.println(isPresent(str, ch, index));
    }

    public static boolean isPresent(String str, char ch, int i) {
        for (int j = i; j < str.length(); j++) {
            if (str.charAt(j) == ch) {
                return true;
            }
        }
        return false;
    }
}
