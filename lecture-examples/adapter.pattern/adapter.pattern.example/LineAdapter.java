package adapter.pattern.example;
import legacy.code.*;

import legacy.code.Rectangle;

public class LineAdapter implements Target{
	private Line lineAdaptee;
	
	public LineAdapter (Line rectangle) {
		lineAdaptee = rectangle;
	}
	@Override
	public void display(int x, int y, int w, int z, String color) {
		// TODO Auto-generated method stub
		lineAdaptee.display(x, y, z, w);
		System.out.println("Color is: " + color);
		
	}

}
