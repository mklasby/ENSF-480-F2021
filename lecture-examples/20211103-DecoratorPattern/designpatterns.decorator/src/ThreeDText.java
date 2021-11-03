public class ThreeDText extends Text {
    public int threeDepth;

    public ThreeDText(String tIn, int depth) {
        super(tIn);
        threeDepth = depth;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("...with a threeD depth of: %d\n", threeDepth);
    }

}
