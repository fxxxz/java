import java.util.Scanner;
public class H7_6
{
	public static void main(String args[])
	{
		String str,str1;
		System.out.print("������һ������ĸ��ɵ��ַ�����");
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

		