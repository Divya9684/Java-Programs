import java.util.Scanner;
class PowerNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		System.out.print("Enter the power : ");
		int pow=sc.nextInt();
		int ans=1;

		for(int i=1;i<=pow;i++){
			ans*=num;
		}

		System.out.println(num+"^"+pow+" = "+ans);
	}
}
