package lab5.Task3;

public class H extends G {
    protected String h;
    public X x = new X("X3");
    public H() {

    }

    public H(String h, String x) {
        super("G", x);
        this.h = h;
        System.out.println(this.h);
    }
}
