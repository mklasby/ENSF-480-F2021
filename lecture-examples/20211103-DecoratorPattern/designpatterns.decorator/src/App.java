public class App {
    public static void main(String[] args) throws Exception {
        Widget t = new Text("Hello World");
        t.display();
        t = new Border(t, 3);
        t.display();
        t = new Scrollbar(t, "Horizontal");
        t.display();
        t = new ThreeDText("3D Text!", 3);
        t.display();
    }
}
