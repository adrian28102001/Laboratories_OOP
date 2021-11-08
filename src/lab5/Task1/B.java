package lab5.Task1;

public class B extends A{
    public String b;

    public B() {
        this("B");
    }

    public B(String b) {
        this.b = b;
        System.out.println(this.b);
    }
}
