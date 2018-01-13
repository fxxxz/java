public class Exa
{
	public static void main(String args[])
	{
		Rectangle rect=new Rectangle();
		Circle circle=new Circle();
		Geometry geometry=new Geometry(rect,circle);
		geometry.setRectanglePosition(30,40);
		geometry.setRect(120,80);
		geometry.setCirclePosition(160,30);
		geometry.setCircleRadius(3);
		geometry.showState();
		geometry.setCirclePosition(50,-20);
		geometry.setCircleRadius(16);
		geometry.showState();
		geometry.setCircleRadius(166);
		geometry.showState();
	}
}

	