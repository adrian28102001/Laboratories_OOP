package lab5.Task3;

public class J extends I {
    protected String j;

    public J() {

    }

    public J(String j, String x) {
        super("I", x);
        this.j = j;
        System.out.println(this.j);
    }
}
