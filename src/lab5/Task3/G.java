package lab5.Task3;

public class G extends F {
    protected String g;

    public G() {

    }

    public G(String g, String x) {
        super("F", x);
        this.g = g;
        System.out.println(this.g);
    }
}
