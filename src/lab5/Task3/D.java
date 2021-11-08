package lab5.Task3;

public class D extends C {
    protected String d;
    public X x = new X("X2");

    public D() {
    }

    public D(String d, String x) {
        super("C", x);
        this.d = d;
        System.out.println(this.d);
    }
}
