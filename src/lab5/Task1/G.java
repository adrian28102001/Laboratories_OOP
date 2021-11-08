package lab5.Task1;

public class G extends F{
    public String g;

    public G() {
        this("G");
    }

    public G(String g) {
        //super(); - is called by default
        this.g = g;
        System.out.println(this.g);
    }


}
