public class AbstractClient {
    public static void main(String args[]) {
//        AbstractDemo ad = new AbstractDemo(); //Error

        AbstractDemoChild adc = new AbstractDemoChild();
        adc.fun();
        System.out.println(adc.get());

        AbstractDemo ad = new AbstractDemo() {
            @Override
            public void fun() {
                System.out.println("Hello Akarsh AbstractClient");
            }
        };

        ad.fun();

        AbstractDemo ad2 = new AbstractDemo() {
            @Override
            public void fun() {
                System.out.println("Bye Akarsh AbstractClient");
            }
        };

        ad2.fun();
    }
}
