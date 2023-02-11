package generics.ch3;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        FruitBox<Fruit> fruit_FruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> apple_FruitBox = new FruitBox<Apple>();

        //Fruit와 그 자손인 Apple도 가능함
        System.out.println("Juicer.makeJuice(fruit_FruitBox) = " + Juicer.makeJuice(fruit_FruitBox));
        System.out.println("Juicer.makeJuice(apple_FruitBox) = " + Juicer.makeJuice(apple_FruitBox));

        //===========================

        FruitBox<Apple> appleBox = new FruitBox<Apple>();

        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 100));
        appleBox.add(new Apple("GreenApple", 200));

        Collections.sort(appleBox.getList(), new AppleComp());
        System.out.println("appleBox = " + appleBox);

        Collections.sort(appleBox.getList(), new FruitComp());
        System.out.println("appleBox = " + appleBox);

    }
}
