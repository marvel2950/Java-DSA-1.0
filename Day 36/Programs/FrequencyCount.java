import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        String str = "Akarsh Jaiswal lives in Noida";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(map.containsKey(ch)) {
                int oldCount = map.get(ch);
                map.put(ch, oldCount + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}
