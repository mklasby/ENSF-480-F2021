
public class CliffTrap extends Trap {

    public CliffTrap(int i) {
        this.damage = i;
    }

    @Override
    public void display() {
        System.out.printf("You fell off the cliff! %d damage taken!\n", damage);

    }

}
