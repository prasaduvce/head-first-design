package second;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("This duck can't fly");
    }
}
