import java.util.Scanner;

class SumDigits
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num= sc.nextInt();
		int dup=num;
		int sum=0;

		int rem=num%10;
		sum=sum+rem;
		num=num/10;

		rem=num%10;
		sum=sum+rem;
		num=num/10;

		rem=num%10;
		sum=sum+rem;
		num=num/10;

		rem=num%10;
		sum=sum+rem;
		System.out.println("Sum of digits in "+dup+" is "+sum);
	}
}