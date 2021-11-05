import java.util.ArrayList;

public class MountainMazeFactory implements MazeFactory {

    @Override
    public ArrayList<Wall> renderWalls() {
        ArrayList<Wall> walls = new ArrayList<Wall>();
        for (int i = 0; i < 10; i++) {
            walls.add(new MountainWall("Rocky", Math.random(), Math.random(), Math.random(), Math.random()));
        }
        return walls;
    }

    @Override
    public ArrayList<Trap> renderTraps() {
        ArrayList<Trap> traps = new ArrayList<Trap>();
        for (int i = 0; i < 10; i++) {
            traps.add(new CliffTrap(100));
        }
        // TODO Auto-generated method stub
        return traps;
    }

}
