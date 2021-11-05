import java.util.ArrayList;

public interface MazeFactory {

    ArrayList<Wall> renderWalls();

    ArrayList<Trap> renderTraps();

}
