import java.util.Scanner;
public class H7_6
{
	public static void main(String args[])
	{
		String str,str1;
		System.out.print("请输入一个以字母组成的字符串：");
		Scanner reader=new Scanner(System.in);
		str=reader.nextLine();
		str1=str.toUpperCase();
		System.out.println(str1);
		str1=str.toLowerCase();
		System.out.println(str1);
		str1=str.concat(str1);
		System.out.println(str1);
	}
}

		