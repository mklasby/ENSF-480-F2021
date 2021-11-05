
public class MountainWall extends Wall {

    public MountainWall(String string, double x1, double x2, double y1, double y2) {
        this.appearance = string;
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
