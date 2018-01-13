import java.util.Scanner;
public class StringAndNumber
{
	public static void main(String args[])
	{
		double num;
		String str,integer,decimal;
		int i=0,length;
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入一个浮点数：");
		num=reader.nextDouble();
		str=String.valueOf(num);
		length=str.length()-1;
		i=str.indexOf(".");
		integer=str.substring(0,i);
		decimal=str.substring(i+1);
		System.out.println(num+"共有"+length+"位");
		System.out.println("整数部分为"+integer+",共"+integer.length()+"位");
		System.out.println("小数部分为"+decimal+",共"+decimal.length()+"位");
	}
}
		
		