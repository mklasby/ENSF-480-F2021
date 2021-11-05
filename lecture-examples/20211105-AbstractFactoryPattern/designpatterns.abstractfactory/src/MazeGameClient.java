import java.util.ArrayList;

public class MazeGameClient {
    private MazeFactory factory;
    private ArrayList<Wall> walls;
    private ArrayList<Trap> traps;
    private String name;

    public MazeGameClient(MazeFactory factory, String name) {
        this.factory = factory;
        this.name = name;
        walls = factory.renderWalls();
        traps = factory.renderTraps();
    }

    public void playGame() {
        System.out.printf("Start of maze game for %s\n", name);

        for (Wall wall : walls) {
            wall.display();
        }
        for (Trap trap : traps) {
            trap.display();
        }

        System.out.printf("End of maze game for %s\n\n", name);

    }

}
