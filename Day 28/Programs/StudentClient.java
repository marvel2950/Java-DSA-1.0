public class StudentClient {
    public static void main(String[] args) {
        Student s = new Student("Akarsh", 25);

        System.out.println(s);
        System.out.println(s.toString());
        System.out.println(s.hashCode());
        System.out.println(Integer.toHexString(s.hashCode()));

    }
}
