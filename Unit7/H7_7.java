import java.util.Scanner;
public class H7_7
{
	public static void main(String args[])
	{
		int index;
		String str;
		char a;
		System.out.print("请输入一串字符:");
		Scanner reader=new Scanner(System.in);
		str=reader.nextLine();
		a=str.charAt(0);
		System.out.println("第一个字符为："+a);
		a=str.charAt(str.length()-1);
		System.out.println("第二个字符为："+a);
	}
}
		
		
	