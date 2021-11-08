package lab5.Task3;

public class A {
    protected String a;
    public X x = new X("X1");

    public A() {}

    public A(String a, String x) {
        this.a = a;
        this.x = new X(x);
        System.out.println(this.a);
    }
}
