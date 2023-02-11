package generics.ch3;

public class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }
    public String toString(){ return name; }
}
