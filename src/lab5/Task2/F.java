package lab5.Task2;

public class F extends E {
    protected String f;

    public F() {

    }

    public F(String f, String x) {
        super("E", x);
        this.f = f;
        System.out.println(this.f);
    }
}
