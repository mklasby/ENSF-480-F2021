
public class ForestWall extends Wall {

    public ForestWall(String appearance, double x1, double x2, double y1, double y2) {
        this.appearance = appearance;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void display() {
        System.out.print(appearance);
        super.display();
    }

}
