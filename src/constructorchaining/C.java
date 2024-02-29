package constructorchaining;

public class C extends B {

    public C() {
        System.out.println("Calling from default of C");
    }

    public C(String name) {
        super();
        System.out.println("Calling from C's constructor");
    }

}
