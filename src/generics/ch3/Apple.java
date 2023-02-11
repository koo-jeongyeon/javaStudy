package generics.ch3;

public class Apple extends Fruit {
    Apple(String name, int weight) {
        super(name, weight);
    }

    public String toString(){
        return name+"{"+weight+"}";
    }
}
