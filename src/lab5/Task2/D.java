package lab5.Task2;

public class D extends C {
    protected String d;

    public D() {
    }

    public D(String d, String x) {
        super("C", x);
        this.d = d;
        System.out.println(this.d);
    }
}
