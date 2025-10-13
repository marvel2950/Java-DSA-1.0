public class PersonClient {

    public static void main(String args[]) {
        Person p = new Person("Akarsh", 25);

//        System.out.println(p.name);
//        System.out.println(p.age);
//
//        p.name = "Aastha";
//        p.age = -145;
//
//        System.out.println(p.name);
//        System.out.println(p.age);

        p.sayHiTo();
        p.sayHiTo("Dheeraj");
        p.sayHiTo("Akarsh", "Kanpur");

//        Person p1 = new Person();
//
//        Person p2 = new Person(30);
//        System.out.println(p2.name);
//        System.out.println(p2.age);
//
//        Person p3 = new Person("Nohara");
//        System.out.println(p3.name);
//        System.out.println(p3.age);

        p.setName("Aishwarya");
        System.out.println(p.getName());
        p.setAge(12);
        System.out.println(p.getAge());


    }
}
