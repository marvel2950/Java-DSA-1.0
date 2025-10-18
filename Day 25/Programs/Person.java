public class Person {
    private String name;
    private int age;

    int getAge() {
        return age;
    }

    void setAge(int age) throws Exception {
        if (age < 0) {
           throw new Exception("Age can't be negative!") ;
        }
        this.age = age;
    }

}