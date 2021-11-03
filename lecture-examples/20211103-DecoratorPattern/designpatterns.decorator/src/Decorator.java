public abstract class Decorator implements Widget {
    protected Widget widget;

    public Decorator(Widget w) {
        widget = w;
    }
}
