public class Scrollbar extends Decorator {

    private String type;

    public Scrollbar(Widget w, String type) {
        super(w);
        this.type = type;
    }

    @Override
    public void display() {
        widget.display();
        System.out.printf("...with Scrollbar of type %s\n", type);

    }

}