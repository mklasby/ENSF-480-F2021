public class App {
    public static void main(String[] args) throws Exception {
        Widget t = new ThreeDText("Hello World!", 60);
        t.display();
        t = new Border(t, 3);
        t.display();
        t = new Scrollbar(t, "horizontal");
        t.display();
    }
}