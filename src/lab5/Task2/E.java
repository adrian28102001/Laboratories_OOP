package lab5.Task2;

public class E extends D {
    protected String e;

    public E() {
    }

    public E(String e, String x) {
        super("D", x);
        this.e = e;
        System.out.println(this.e);
    }
}
