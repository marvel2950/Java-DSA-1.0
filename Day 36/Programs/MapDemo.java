import java.util.HashMap;

public class MapDemo {
    public static void main(String args[]) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Akarsh", 25);
        map1.put("Abhay", 21);
        map1.put("Aastha", 25);
        map1.put("Abhinav", 25);
        map1.put("Abhinav", 20);
        map1.put("Kratika", 40);
        map1.put("Mohan", 30);
        map1.put("Abhinav", 18);
        map1.put("Arti", 20);
//        map1.put(null, 20);
//        map1.put(null, 25);

        System.out.println(map1);

        System.out.println(map1.containsKey("Raj"));
        System.out.println(map1.containsKey("Arti"));

        System.out.println(map1.get("Raj"));
        System.out.println(map1.get("Arti"));

        System.out.println(map1.remove("Raj"));
        System.out.println(map1.remove("Arti"));

        System.out.println(map1);
        System.out.println(map1.size());

        System.out.println(map1.get("Akarsh") == map1.get("Aastha"));




    }
}
