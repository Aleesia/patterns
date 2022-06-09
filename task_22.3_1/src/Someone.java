abstract public class Someone {
    public abstract void pickUpWeapon();

    public abstract void defenseAction();

    public abstract void moveToSafety();

    public void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }
}
