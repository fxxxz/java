import java.util.Scanner;
public class H7_7
{
	public static void main(String args[])
	{
		int index;
		String str;
		char a;
		System.out.print("������һ���ַ�:");
		Scanner reader=new Scanner(System.in);
		str=reader.nextLine();
		a=str.charAt(0);
		System.out.println("��һ���ַ�Ϊ��"+a);
		a=str.charAt(str.length()-1);
		System.out.println("�ڶ����ַ�Ϊ��"+a);
	}
}
		
		
	