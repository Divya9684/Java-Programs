import java.util.Scanner;
class MaxDigitFromNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int max=0;

		for(int i=num;i>0;i/=10){
			int rem=i%10;
			if(rem>max)
				max=rem;
		}

		System.out.println(max);
	}
}
