public class Border extends Decorator {

    protected int thickness;

    public Border(Widget w, int t) {
        super(w);
        thickness = t;
    }

    @Override
    public void display() {
        widget.display();
        System.out.printf("...with border of thickness %d\n", thickness);
    }
}
