import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int sum=0;
		boolean flag=false;

		for(int i=1;i<=num/2;i++){
			if(i*i==(num+1))
				flag=true;
		}

		if(flag)
			System.out.println(num+" is a sunny number");
		else
			System.out.println(num+" is not a sunny number");
	}
}
