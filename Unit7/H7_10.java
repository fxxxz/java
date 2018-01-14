import java.util.*;
public class H7_10
{
	public static void main(String args[])
	{
		double a[]={10,2,8,5,12,6,20,9,1,100};
		double b[]={10,2,8,5,12,6,20,9,1,100};
		System.out.println("全排序后的数组a:");
		Arrays.sort(a);
		for(double number:a)
		{
			System.out.printf("%8.2f",number);
		}
		System.out.println("");
		System.out.println("部分排序后的数组b:");
		Arrays.sort(b,1,b.length-1);
		for(double number:b)
		{
			System.out.printf("%8.2f",number);
		}
	}
}
			