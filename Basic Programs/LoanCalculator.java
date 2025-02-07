import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println();
		System.out.println("     LOAN CALCULATOR ");
		System.out.println();
		System.out.print("Enter the amount : ");
		float amount=sc.nextFloat();

		System.out.print("Enter the ROI : ");
		float roi=sc.nextFloat();

		System.out.print("Enter the tenure (months) : ");
		int month=sc.nextInt();

		//convert month to years
		String str=(month/12)+"."+(month%12);
		float con=Float.parseFloat(str);

		System.out.println();
		System.out.println("LOAN CALCULATION");
		System.out.println("Principal Amount : "+amount);
		System.out.println("ROI : "+roi+"%");
		System.out.println("Tenure : "+month+" months");

		System.out.println();
		float intYear=amount*roi/100;
		float totalInt=intYear*con;
		System.out.println("Interest : "+totalInt);
		float outStanding=amount+totalInt;
		System.out.println("Total Outstanding Amount : "+outStanding);
		System.out.println("EMI : "+(outStanding/month)+" rs");
	}
}
