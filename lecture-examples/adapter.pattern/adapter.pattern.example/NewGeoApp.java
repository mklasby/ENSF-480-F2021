package adapter.pattern.example;
import legacy.code.*;

public class NewGeoApp {
	
	public static void main (String [] args) {
		
		Rectangle r1 = new Rectangle ();
		
		Target myRectangleTarget = new RectangleAdapter (r1);
		//Why did we make a Rectangle adapter class?
		//So that we do not have to make changes to the code of the Rectangle class
		//which is considered legacy code!
		//Essentially, the RectangleAdapter class is a WRAPPER CLASS for the Rectangle class!
		
		//r1.display(10, 30, 50, 60);
		myRectangleTarget.display(10, 30, 50, 60, "Red");
		
		Line myLine = new Line ();
		//myLine.display(10, 30, 50, 60);
		
		Target myLineTarget = new LineAdapter (myLine);
		
		myLineTarget.display(10, 20, 30, 40, "Blue");
		
		
		
		
	}

}
