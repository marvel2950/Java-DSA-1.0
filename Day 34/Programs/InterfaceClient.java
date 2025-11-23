public class InterfaceClient {

    public static void main(String args[]) {
        //    InterfaceDemo id = new InterfaceDemo(); // Error

        InterfaceImplementer ii = new InterfaceImplementer();
        ii.funA();
        ii.funB("akarsh");

    }

}
