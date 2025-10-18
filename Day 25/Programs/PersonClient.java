public class PersonClient {

    public static void main(String args[]) {
        Person p = new Person();

        try {
//            p.setAge(-25);
            p.setAge(20);
            System.out.println("try block!");
        }
        catch(Exception e){
//            e.printStackTrace();
            System.out.println("Exception Handled!");
        }
        finally{
            System.out.println("Finally block!");
        }

        System.out.println(p.getAge());

    }
}
