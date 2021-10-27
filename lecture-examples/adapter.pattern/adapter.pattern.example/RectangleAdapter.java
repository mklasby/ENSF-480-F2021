package adapter.pattern.example;
import legacy.code.*;

public class RectangleAdapter implements Target{
	
	private Rectangle rectangleAdaptee;
	
	public RectangleAdapter (Rectangle rectangle) {
		rectangleAdaptee = rectangle;
	}

	@Override
	public void display(int x, int y, int w, int z, String color) {
		// TODO Auto-generated method stub
		rectangleAdaptee.display(x, y, z, w);
		System.out.println("Color is: " + color);
		
	}

}
