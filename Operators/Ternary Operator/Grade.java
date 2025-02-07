import java.util.Scanner;
class Grade 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks : ");
		float marks=sc.nextFloat();
		float per=(marks/600)*100;

		String grade=((per<35)?("Fail"):((per<=100 && per>=75)?("A grade with"):((per<=74 && per>=60)?("B grade with"):("C grade with"))));
		//(per<=59 && per>=35)?("C grade"):("Fail")

		System.out.println(grade+" "+per);
	}
}
