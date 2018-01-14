import java.applet.*;
import java.awt.*;
public class FirstApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawString("这是一个Java Applet程序",2,30);
		g.setColor(Color.red);
		g.setFont(new Font("宋体",Font.BOLD,36));
		g.drawString("我改变了字体",10,100);
	}
}
