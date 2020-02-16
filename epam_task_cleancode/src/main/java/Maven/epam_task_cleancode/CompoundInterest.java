package Maven.epam_task_cleancode;
public class CompoundInterest
{
	double compoundInterestCalculator(float principle,float time,float rateOfInterest)
	{
		return (principle*Math.pow(1+(rateOfInterest/100),time));
	}
}