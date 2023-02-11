package generics.ch2;



import generics.ch1.Box;
import generics.ch1.Fruit;

import java.util.ArrayList;

/**
 * 인터페이스도 타입 매개변수 T에 지정할 수 있다
 * extends를 사용하는 것에 주의
 * Fruit의 자손이면서 Eatable인터페이스도 구현해야한다면 다음처럼 & 기호로 연결한다
 * @param <T>
 */
public class FruitBoxExtendsFruitandEatable<T extends Fruit & Eatable> extends Box {

    ArrayList<T> list = new ArrayList<T>();

}
