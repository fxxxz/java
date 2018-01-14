import java.util.Scanner;
public class TrainComputerWeight
{
	public static void main(String args[])
	{
		int peopleNumber=0,tvNumber=0,computerNumber=0,washNumber=0,totalNumber=0;
		int i,k;
		Scanner reader=new Scanner(System.in);
		System.out.print("输入乘客人数:");
		peopleNumber=reader.nextInt();
		System.out.print("输入电视机数量:");
		tvNumber=reader.nextInt();
		System.out.print("输入计算机数量:");
		computerNumber=reader.nextInt();
		System.out.print("输入洗衣机数量:");
		washNumber=reader.nextInt();
		totalNumber=peopleNumber+tvNumber+computerNumber+washNumber;
		SetAndGetWeight things[]=new SetAndGetWeight[totalNumber];
		Train train=new Train(things);
		System.out.println("输入每位乘客的体重:");
		for(i=0,k=1;i<peopleNumber;i++,k++)
		{
			things[i]=new People();
			System.out.print("输入第"+k+"位乘客的体重:");
			things[i].setWeight(reader.nextDouble());
		}
		System.out.println("输入每台电视机的数量:");
		for(k=1;i<peopleNumber+tvNumber;i++,k++)
		{
			things[i]=new Television();
			System.out.print("输入第"+k+"台电视机的重量:");
			things[i].setWeight(reader.nextDouble());
		}
		System.out.println("输入每台计算机的重量:");
		for(k=1;i<(peopleNumber+tvNumber+computerNumber);i++,k++)
		{
			things[i]=new Computer();
			System.out.print("输入第"+k+"台计算机的重量:");
			things[i].setWeight(reader.nextDouble());
		}
		System.out.println("输入每台洗衣机的重量:");
		for(k=1;i<(peopleNumber+tvNumber+computerNumber+washNumber);i++,k++)
		{
			things[i]=new WashMachine();
			System.out.print("输入第"+k+"台洗衣机的重量:");
			things[i].setWeight(reader.nextDouble());
		}
		System.out.println("火车装载的总重量:"+train.getTotalWeights());
	}
}
		