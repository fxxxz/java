public class Company
{
	Employee[] employee;
	double salaries=0;
	Company(Employee[] employee)
	{
		this.employee=employee;
	}
	public double salariesPay()
	{
		salaries=0;
		for(Employee person:employee)
		{
			salaries=salaries+person.earnings();
		}
		return salaries;
	}
}