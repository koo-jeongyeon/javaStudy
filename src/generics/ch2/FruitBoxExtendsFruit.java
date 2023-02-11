package generics.ch2;



import generics.ch1.Box;
import generics.ch1.Fruit;

import java.util.ArrayList;

/**
 * 제한된 지네릭 클래스
 * Fruit타입만 타입 매개변수 T에 지정할 수 있다
 * 다형성에서 조상타입 참조변수로 자손타입 객체를 가리킬 수 있는것 처럼 Fruit와 그 자손 타입까지 가능하다
 * @param <T>
 */
public class FruitBoxExtendsFruit<T extends Fruit> extends Box {

    ArrayList<T> list = new ArrayList<T>();

}
