public class StudentClient {
    public static void main(String[] var) {

//        System.out.println(args.length);
        System.out.println("Hello Akarsh");
//        Student s = new Student();
//
//        System.out.println(s);
//        System.out.println(s.age);
//        System.out.println(s.name);
//
//        s.age = 25;
//        s.name = "Shinchan";
//
//        System.out.println(s.age);
//        System.out.println(s.name);
//        s.introduceYourSelf();

        Student s1 = new Student();
        s1.age = 1225;
        s1.name = "Nohara";

//        System.out.println(s1.age);
//        System.out.println(s1.name);
        s1.introduceYourSelf();

        Student s2 = new Student();
        s2.age = 10;
        s2.name = "Doaremon";

//        System.out.println(s2.age);
//        System.out.println(s2.name);
        s2.introduceYourSelf();

//        Student.extendIntroduction();
//
//        System.out.println(Student.fees);
//        Student.fees = 2000;
//        System.out.println(Student.fees);
//
//        Student.changeFees(1000);
//        System.out.println(Student.fees);

        s1.sayHey("Akarsh");


    }

//    static{
//        System.out.println("Student client static block");
//    }
}


