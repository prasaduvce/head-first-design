package third;

import java.util.List;

public abstract class Character {

    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    protected abstract void fight();

    public void display() {
        System.out.println(this.getClass().getSimpleName()+" uses weapon "+this.weapon.getClass().getSimpleName());
    }
}
