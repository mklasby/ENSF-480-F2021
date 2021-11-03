public class ThreeDText extends Text {

    private int depth;

    public ThreeDText(String text, int depth) {
        super(text);
        this.depth = depth;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Text is 3D with depth: %d", depth);
    }

}
