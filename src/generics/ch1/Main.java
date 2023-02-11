package generics.ch1;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        Box<Fruit> fruitBox = new Box<Fruit>();

        appleBox.add(new Apple());
        //당연하지만 Apple타입으로 생성한 참조변수니 Apple객체만 넣을수있다
        //appleBox.add(new Grape());

        //상속관계의 타입들 다 가능, void add(Fruit item)
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        //참조변수와 생성자에 대입된 타입이 일치해야한다. 일치하지 않으면 에러
        //generics1.Box<Grape> appleBox2 = new generics1.Box<Apple>();

        //상속관계에 있더라도 에러
        //generics1.Box<Fruit> generics1.FruitBox = new generics1.Box<Apple>();

        //지네릭 클래스가 상속관계에 있는건 괜찮다
        Box<Apple> appleBox1 = new FruitBox<Apple>();
    }
}
