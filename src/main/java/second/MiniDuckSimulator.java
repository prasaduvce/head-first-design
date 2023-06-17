package second;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.swim();
        mallardDuck.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.setQuackBehaviour(new MuteQuack());
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.swim();
        modelDuck.display();
    }
}
