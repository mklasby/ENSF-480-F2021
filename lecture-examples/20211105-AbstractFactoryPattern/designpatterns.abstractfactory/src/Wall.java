
public abstract class Wall {
    protected String appearance;
    protected double x1, x2, y1, y2;

    public void display() {
        System.out.printf(" wall at (%.2f, %.2f) (%.2f, %.2f)\n", x1, y1, x2, y2);
    }

}
