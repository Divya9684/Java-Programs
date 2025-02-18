import java.util.Scanner;
class MinDigitFromNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int min=0;

		for(int i=num;i>0;i/=10){
			int rem=i%10;
			if(rem<min)
				min=rem;
		}

		System.out.println(min);
	}
}
