import java.util.ArrayList;

public class StudentClient {
    public static void main(String args[]) {

        System.out.println("Hello Akarsh");
        Student s = new Student();

        System.out.println(s);
        System.out.println(s.age);
        System.out.println(s.name);

        s.age = 25;
        s.name = "Shinchan";

        System.out.println(s.age);
        System.out.println(s.name);
        s.introduceYourSelf();

        Student s1 = new Student();
        s1.age = 1225;
        s1.name = "Nohara";

        System.out.println(s1.age);
        System.out.println(s1.name);
        s1.introduceYourSelf();

    }
}


