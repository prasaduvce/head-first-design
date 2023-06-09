package FirstPractice;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.swim();
        duck.fly(new CanFlyBehaviour(), duck.getClass().getSimpleName());

        duck = new RubberDuck();
        duck.display();
        duck.swim();
        duck.fly(new CantFlyBehaviour(), duck.getClass().getSimpleName());

        duck = new WoodenDuck();
        duck.display();
        duck.swim();
        duck.fly(new CanFlyBehaviour(), duck.getClass().getSimpleName());
    }
}
