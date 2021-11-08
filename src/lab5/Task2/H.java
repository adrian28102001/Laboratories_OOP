package lab5.Task2;

public class H extends G {
    protected String h;

    public H() {

    }

    public H(String h, String x) {
        super("G", x);
        this.h = h;
        System.out.println(this.h);
    }
}
