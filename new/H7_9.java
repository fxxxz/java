import java.util.Scanner;
import java.util.Calendar;
public class H7_9
{
	public static void main(String args[])
	{
		int year,month,day;
		long t1,t2,t;
		System.out.print("�������һ��ʱ�䣨�����գ�:");
		Scanner reader=new Scanner(System.in);
		year=reader.nextInt();
		month=reader.nextInt();
		day=reader.nextInt();
		Calendar c1=Calendar.getInstance();
		c1.set(year,month,day);
		System.out.print("������ڶ���ʱ�䣨�����գ�:");
		year=reader.nextInt();
		month=reader.nextInt();
		day=reader.nextInt();
		Calendar c2=Calendar.getInstance();
		c2.set(year,month,day);
		t1=c1.getTimeInMillis();
		t2=c2.getTimeInMillis();
		t=Math.abs(t1-t2)/(1000*60*60*24);
		System.out.println("��������֮�����"+t+"��");
	}
}
		
		
		
		
		