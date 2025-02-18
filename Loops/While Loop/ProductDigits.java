import java.util.Scanner;
class ProductDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int prod=1;
		int dup=num;

		while(num>0){
			int rem=num%10;
			prod*=rem;
			num/=10;
		}

		System.out.println("Product of digits in "+dup+" is "+prod);

	}
}
