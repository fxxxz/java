import java.util.Scanner;
public class StringAndNumber
{
	public static void main(String args[])
	{
		double num;
		String str,integer,decimal;
		int i=0,length;
		Scanner reader=new Scanner(System.in);
		System.out.println("������һ����������");
		num=reader.nextDouble();
		str=String.valueOf(num);
		length=str.length()-1;
		i=str.indexOf(".");
		integer=str.substring(0,i);
		decimal=str.substring(i+1);
		System.out.println(num+"����"+length+"λ");
		System.out.println("��������Ϊ"+integer+",��"+integer.length()+"λ");
		System.out.println("С������Ϊ"+decimal+",��"+decimal.length()+"λ");
	}
}
		
		