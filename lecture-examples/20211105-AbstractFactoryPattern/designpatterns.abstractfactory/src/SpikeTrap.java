public class SpikeTrap extends Trap {

    public SpikeTrap(int damage) {
        this.damage = damage;
    }

    @Override
    public void display() {
        System.out.printf("Spike trap does %s\n", damage);
    }

}
