public class Person {
    private String name;
    private int age;

    Person() {
        System.out.println("non param constructor");
    }

    Person(int age) {
        this.age = age;
    }

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        System.out.println("param constructor");
        this.name = name;
        this.age = age;
    }

    void sayHiTo() {
        System.out.println("Hi " + name);
    }

    void sayHiTo(String name) {
        System.out.println("Hi " + name);
    }

    void sayHiTo(String mentorName, String city) {
        System.out.println("Hi " + mentorName + " from " + city);
    }

//    int solve(){
//        return 1;
//    }
//
//    float solve(){
//        return 2.0f;
//    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

//    static {
//        System.out.println("Hi static");
//    }
}