public class Train
{
	SetAndGetWeight[] things;
	double totalWeights=0;
	Train(SetAndGetWeight[] things)
	{
		this.things=things;
	}
	public double getTotalWeights()
	{
		for(SetAndGetWeight item:things)
		{
			totalWeights=totalWeights+item.getWeight();
		}
		return totalWeights;
	}
}
		