class Geometry
{
	Rectangle rect=new Rectangle();
	Circle circle=new Circle();
	Geometry(Rectangle rect,Circle circle)
	{
		this.rect=rect;
		this.circle=circle;
	}
	public void setCirclePosition(double x,double y)
	{
		circle.alterX(x);
		circle.alterY(y);
	}
	public void setCircleRadius(double radius)
	{
		circle.alterRadius(radius);
	}
	public void setRectanglePosition(double x,double y)
	{
		rect.alterX(x);
		rect.alterY(y);
	}
	public void setRect(double width,double height)
	{
		rect.alterWidth(width);
		rect.alterHeight(height);
		
	}
	public void showState()
	{
		double x,y;
		double rectX1=rect.getX(),rectY1=rect.getY();
		double rectX2=rectX1+rect.getWidth(),rectY2=rectY1;
		double rectX3=rectX1,rectY3=rectY1-rect.getHeight();
		double rectX4=rectX2,rectY4=rectY3;
		double r=circle.getRadius();
		double circleX=circle.getX(),circleY=circle.getY();
		boolean conditionOne=(circleX<rectX2&&circleX>rectX1&&circleY<rectY1&&circleY>rectY3);
		double dis1=Math.abs(circleX-rectX1),dis2=Math.abs(circleX-rectX2),dis3=Math.abs(circleY-rectY1),dis4=Math.abs(circleY-rectY3);
		boolean conditionTwo=(dis1>=r&&dis2>=r&&dis3>=r&&dis4>=r);
		if(conditionOne&&conditionTwo)
			System.out.println("图形中的圆包含于图形的矩形中");
		else
			System.out.println("图形中的圆不包含于图形的矩形中");
	}
}
		
	
	