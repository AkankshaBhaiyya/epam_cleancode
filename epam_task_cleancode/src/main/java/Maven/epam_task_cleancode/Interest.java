package Maven.epam_task_cleancode;

import java.util.*;
public class Interest
{
	public static void main(String[] args)
	{
		int choiceOfContinuation=0;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 0 if you want to calculate Simple Interest and 1 if you want to calculate Compound Interest");
		int choice=sc.nextInt();
		float principle=0,time=0,rateOfInterest=0;
		if(choice==0 || choice==1)
		{
			System.out.println("Enter Principle");
			 principle=sc.nextFloat();
			System.out.println("Enter Time Period(in years)");
			 time=sc.nextFloat();
			System.out.println("Enter Rate Of Interest");
			 rateOfInterest=sc.nextFloat();
			
		}
		if(choice==0)
		{
			SimpleInterest simpleInterestObject=new SimpleInterest();
			float simpleInterestResult=simpleInterestObject.simpleInterestCalculator(principle,time,rateOfInterest);
			System.out.println("Result of simple interest is : "+simpleInterestResult);
		}
		if(choice==1)
		{
			CompoundInterest compoundInterestObject=new CompoundInterest();
			double compoundInterestResult=compoundInterestObject.compoundInterestCalculator(principle,time,rateOfInterest);
			System.out.println("Result of compound interest is : "+compoundInterestResult);
		}
		System.out.println("Enter 1 to conitnue and 0 to exit");
		 choiceOfContinuation =sc.nextInt();
	}while(choiceOfContinuation==1);
	}
}