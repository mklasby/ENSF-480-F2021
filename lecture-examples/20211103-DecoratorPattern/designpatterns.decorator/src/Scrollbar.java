public class Scrollbar extends Decorator {

    public String type;

    public Scrollbar(Widget w, String typeIn) {
        super(w);
        type = typeIn;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void display() {
        widget.display();
        System.out.printf("...it's scrollbar type is: %s\n", type);

        // TODO Auto-generated method stub

    }

}
