import java.util.ArrayList;

public class ForestMazeFactory implements MazeFactory {

    @Override
    public ArrayList<Wall> renderWalls() {
        ArrayList<Wall> walls = new ArrayList<Wall>();
        for (int i = 0; i < 5; i++) {
            walls.add(new ForestWall("Mossy", Math.random(), Math.random(), Math.random(), Math.random()));
        }
        return walls;
    }

    @Override
    public ArrayList<Trap> renderTraps() {
        ArrayList<Trap> traps = new ArrayList<Trap>();
        for (int i = 0; i < 3; i++) {
            traps.add(new SpikeTrap(10));
        }
        // TODO Auto-generated method stub
        return traps;
    }

}
