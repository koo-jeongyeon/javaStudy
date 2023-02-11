package generics.ch3;

import generics.ch1.Apple;
import generics.ch1.Fruit;
import generics.ch1.FruitBox;

public class Main {
    public static void main(String[] args) {

        FruitBox<Fruit> fruit_FruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> apple_FruitBox = new FruitBox<Apple>();

        //Fruit와 그 자손인 Apple도 가능함
        System.out.println("Juicer.makeJuice(fruit_FruitBox) = " + Juicer.makeJuice(fruit_FruitBox));
        System.out.println("Juicer.makeJuice(apple_FruitBox) = " + Juicer.makeJuice(apple_FruitBox));

    }
}
