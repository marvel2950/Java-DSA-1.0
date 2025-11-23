public class InterfaceImplementer implements InterfaceDemo {
    @Override
    public void funA() {
        System.out.println("funA implementation");
    }

    @Override
    public int funB(String inputA) {
        System.out.println("funB implementation");
        return inputA.length();
    }
}
