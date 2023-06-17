package second;

public abstract class Duck {
    QuackBehaviour quackBehaviour;

    FlyBehaviour flyBehaviour;

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    //public Duck() {}
    public void performQuack() {
        quackBehaviour.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    public abstract void display();

    public void performFly() {
       flyBehaviour.fly();
    }
}
