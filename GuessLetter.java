import java.util.Scanner;
public class GuessLetter
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("����һ��Ӣ��Сд��ĸ����²������ĸ");
		char a[];
		a=new char[26];
		for(int k=0;k<a.length;k++)
		{
			a[k]=(char)(k+97);
		}
		int i=(int)((Math.random())*(a.length));
		char realLetter='\0';
		realLetter=a[i];
		String str="";
		System.out.print("�������Ĳ²⣺");
		str=reader.nextLine();
		char yourGuess=str.charAt(0);
		while(yourGuess!=realLetter)
		{
			if(yourGuess>realLetter)
			{
				System.out.print("�´��ˡ���������Ĳ²⣺");
				str=reader.nextLine();
				yourGuess=str.charAt(0);
			}
			else 
			{
				System.out.print("��С�ˣ���������Ĳ²⣺");
				str=reader.nextLine();
				yourGuess=str.charAt(0);
			}
		}
		System.out.println("�¶��ˣ�");
	}
}