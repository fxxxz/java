import java.util.regex.*;
import java.util.*;
public class DataDig
{
	public static void main(String args[])
	{
		StringBuffer message=new StringBuffer();
		Scanner reader=new Scanner(System.in);
		System.out.print("输入第一行文本:");
		String s1=reader.nextLine();
		message.append(s1);
		System.out.print("输入第二行文本:");
		String s2=reader.nextLine();
		message.append(s2);
		Pattern p;
		Matcher m;
		String regexDate="[0-9]{4}[-/.][0-9]{2}[-/.][0-9]{2}";
		p=Pattern.compile(regexDate);
		m=p.matcher(message);
		while(m.find())
		{
			String strDate=m.group();
			StringTokenizer fenxi=new StringTokenizer(strDate,"-/.");
			int a[]=new int[fenxi.countTokens()];
			int k=0;
			while(fenxi.hasMoreTokens())
			{
				String str=fenxi.nextToken();
				a[k]=Integer.parseInt(str);
				k++;
			}
			VerifyDate veryfy=new VerifyDate();
			boolean boo=veryfy.verifyDate(a[0],a[1],a[2]);
			if(boo)
			{
				System.out.print("从"+m.start()+"到"+m.end()+"匹配模式子序列:");
				System.out.println(strDate);
			}
		}
	}
}