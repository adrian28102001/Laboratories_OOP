package lab5.Task2;

public class I extends H {
    protected String i;

    public I() {

    }

    public I(String i, String x) {
        super("H", x);
        this.i = i;
        System.out.println(this.i);
    }
}
