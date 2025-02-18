import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();

		int sum=0;
		int prod=1;

		for(int i=num;i>0;i/=10){
			sum+=(i%10);
			prod*=(i%10);
		}

		if(sum==prod)
			System.out.println(num+" is a spy number");
		else
			System.out.println(num+" is not a spy number");

	}
}
