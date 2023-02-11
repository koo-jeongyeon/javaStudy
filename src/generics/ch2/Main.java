package generics.ch2;

import generics.ch1.Apple;
import generics.ch1.Fruit;
import generics.ch1.Grape;

public class Main {
    public static void main(String[] args) {
        FruitBoxExtendsFruit<Apple> appleFruitBox = new FruitBoxExtendsFruit<Apple>();
        //Fruit클래스의 자손들만 담을 수 있다는 제약이 추가되어 Toy는 못담음
        //FruitBox2<Toy> toyFruitBox = new FruitBox2<Toy>();

        //여전히 상속관계의 타입들 다 가능함
        FruitBoxExtendsFruit<Fruit> fruitBoxExtendsFruit = new FruitBoxExtendsFruit<Fruit>();
        fruitBoxExtendsFruit.add(new Apple());
        fruitBoxExtendsFruit.add(new Grape());

        //Fruit의 자손이면서 Eatable을 구현하는 FruitImplEatable클래스를 타입으로 사용가능하다
        FruitBoxExtendsFruitandEatable<FruitImplEatable> fr = new FruitBoxExtendsFruitandEatable<FruitImplEatable>();

        fr.add(new Apple());
        fr.add(new Grape());
    }
}
