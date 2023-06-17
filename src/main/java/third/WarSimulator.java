package third;

public class WarSimulator {
    public static void main(String[] args) {
        KnifeBehaviour knife = new KnifeBehaviour();
        SwordBehaviour sword = new SwordBehaviour();
        AxeBehaviour axe = new AxeBehaviour();
        BowAndArrowBehaviour bowAndArrow = new BowAndArrowBehaviour();

        Character character = new King();
        character.setWeapon(sword);
        sword.useWeapon();
        character.display();

        character = new Queen();
        character.setWeapon(bowAndArrow);
        bowAndArrow.useWeapon();
        character.display();

    }
}
