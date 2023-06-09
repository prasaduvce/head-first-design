package FirstPractice;

public class CanFlyBehaviour implements FlyBehaviour {
    @Override
    public void behaviour(String duckType) {
        System.out.println(duckType+" Can fly");
    }
}
