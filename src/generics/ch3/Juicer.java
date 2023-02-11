package generics.ch3;

import generics.*;
import generics.ch1.Fruit;
import generics.ch1.FruitBox;

public class Juicer {

    /**
     * 와일드 카드를 사용하면 FruitBox<Fruit>뿐만 아니라 Fruit<Apple>등 자손들도 사용가능하다.
     */
    public static Juice makeJuice(FruitBox<? extends Fruit> box) {

        String tmp = "";
        for (Fruit f : box.getList()){
            tmp += f + " ";
        }
        return new Juice(tmp);
    }

    /**
     * 매개변수에 과일박스를 대입하면 주스를 만들어 반환하는 Juicer클래스
     * 이 클래스는 지네릭클래스도 아니고 static 은 타입 매개변수 T를 사용할 수 없다.
     * 그래서 Apple을 타입으로한 FruitBox를 매개변수로 넣어주면 에러가 발생..
     */
//    static Juice makeJuice(FruitBox<Fruit> box) {
//
//        String tmp = "";
//        for (Fruit f : box.getList()){
//            tmp += f + " ";
//        }
//        return new Juice(tmp);
//    }

    /**
     * Apple타입을 사용하기 위해서 오버로딩 코드를 짜면 에러가 발생한다.
     * 지네릭 타입이 다른것 만으로는 오버로딩이 성립하지 않기 때문이다.
     * 지네릭 타입은 컴파일 할때만 사용하고 제거하기 때문에 이는 메서드 중복 정의가 되어 에러가 난다.
     */
//    static Juice makeJuice(FruitBox<Apple> box) {
//
//        String tmp = "";
//        for (Fruit f : box.getList()){
//            tmp += f + " ";
//        }
//        return new Juice(tmp);
//    }
}
