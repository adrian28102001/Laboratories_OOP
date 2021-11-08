package lab5.Task3;

public class B extends A {
    protected String b;

    public B() {
    }

    public B(String b, String x) {
        super("A",x);
        this.b = b;
        System.out.println(this.b);
    }
}
