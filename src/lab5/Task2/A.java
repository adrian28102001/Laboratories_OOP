package lab5.Task2;

public class A {
    protected String a;
    public X x;

    public A() {}

    public A(String a, String x) {
        this.a = a;
        this.x = new X(x);
        System.out.println(this.a);
    }
}
