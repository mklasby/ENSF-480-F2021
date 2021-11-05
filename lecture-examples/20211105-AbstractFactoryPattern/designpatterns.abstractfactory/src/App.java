public class App {
    public static void main(String[] args) throws Exception {
        MazeGameClient client = new MazeGameClient(new ForestMazeFactory(), "Forest maze");
        client.playGame();

        client = new MazeGameClient(new MountainMazeFactory(), "Mountain maze");
        client.playGame();
    }
}
