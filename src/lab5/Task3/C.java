package lab5.Task3;

public class C extends B {
    protected String c;

    public C() {
    }

    public C(String c, String x) {
        super("B", x);
        this.c = c;
        System.out.println(this.c);
    }
}
