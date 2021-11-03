public class Border extends Decorator {
    public int thickness;

    public Border(Widget w, int thick) {
        super(w);
        thickness = thick;
    }

    @Override
    public void display() {
        widget.display();
        System.out.printf("...with a border of thickness: %d\n", thickness);

    }

}
