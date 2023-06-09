package FirstPractice;

public class Duck {
    public void swim() {
        System.out.println("Duck can swim");
    }

    public void display() {
        System.out.println("Showing Duck");
    }

    public void fly(FlyBehaviour flyBehaviour, String duckType) {
        flyBehaviour.behaviour(duckType);
    }
}
