package FirstPractice;

public class CantFlyBehaviour implements FlyBehaviour {
    @Override
    public void behaviour(String duckType) {
        System.out.println(duckType+" Cannot fly");
    }
}
