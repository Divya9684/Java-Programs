import java.util.Scanner;
class BMI 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the weight (in pounds) : ");
		float weight=sc.nextFloat();
		System.out.print("Enter the height (in inches) : ");
		float height=sc.nextFloat();

		double kgWeight=weight*0.45359237;
		double mHeight=height*0.0254;

		double bmi=kgWeight/(mHeight*mHeight);

		System.out.println("BMI is "+bmi);

		System.out.println((bmi<18.5)?("Underweight"):((bmi>=18.5 && bmi<=24.9)?("Normal"):((bmi>=25 && bmi<=29.9)?("Overweight"):((bmi>=30 && bmi<=34.9)?("Obese"):("Extremely Obese")))));


	}
}
