import java.applet.*;
import java.awt.*;
public class FirstApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawString("����һ��Java Applet����",2,30);
		g.setColor(Color.red);
		g.setFont(new Font("����",Font.BOLD,36));
		g.drawString("�Ҹı�������",10,100);
	}
}
