public class Text implements Widget {

    protected int len;
    protected String text;

    public Text(String text) {
        this.text = text;
        this.len = text.length();
    }

    @Override
    public void display() {
        System.out.printf("Text contains: %s\nWith Length = %d\n", text, len);
    }
}
