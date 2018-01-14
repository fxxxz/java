import java.util.Scanner;
public class GuessLetter
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("给你一个英文小写字母，请猜测这个字母");
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
		System.out.print("输入您的猜测：");
		str=reader.nextLine();
		char yourGuess=str.charAt(0);
		while(yourGuess!=realLetter)
		{
			if(yourGuess>realLetter)
			{
				System.out.print("猜大了。再输入你的猜测：");
				str=reader.nextLine();
				yourGuess=str.charAt(0);
			}
			else 
			{
				System.out.print("猜小了，再输入你的猜测：");
				str=reader.nextLine();
				yourGuess=str.charAt(0);
			}
		}
		System.out.println("猜对了！");
	}
}