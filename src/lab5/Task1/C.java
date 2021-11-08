package lab5.Task1;

public class C extends B{
    public String c;

    public C() {
        this("C");
    }

    public C(String c) {
        this.c = c;
        System.out.println(this.c);
    }
}
