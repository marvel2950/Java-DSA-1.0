public class Student {
    String name;
    int age;

    static int fees;

    public void introduceYourSelf() {
        System.out.println("My name is " + name + " and age is " + age);
        System.out.println(this);
    }

//    public String toString() {
//        return "Printing toString";
//    }

    public static void extendIntroduction() {
        System.out.println("Thank you everyone!");
//        introduceYourSelf(); //Error
    }

//    static{
//        System.out.println("static block 1");
//    }
//
//    static{
//        System.out.println("static block 2");
//        extendIntroduction();
//    }
//
//    static{
//        System.out.println("static block 3");
//    }

    public static void changeFees(int newFee) {
        fees = newFee;
    }


    public void sayHey(String name) {
        System.out.println(name + " says Hi to: " + name);
    }

}
