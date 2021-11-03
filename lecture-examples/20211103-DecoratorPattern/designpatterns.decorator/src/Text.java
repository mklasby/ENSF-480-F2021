public class Text implements Widget {
    public int length;
    public String text;

    public Text(String tIn) {
        text = tIn;
        length = tIn.length();
    }

    @Override
    public void display() {
        System.out.printf("Text contains: %s\nIt's length is: %d\n", text, length);
    }
}
