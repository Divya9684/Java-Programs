import java.util.Scanner;

class SumDigitsEvenOdd
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num= sc.nextInt();
		int evenSum=0;
		int oddSum=0;
		int temp=0;

		int rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num=num/10;

		rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num=num/10;

		rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num=num/10;

		rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);

		System.out.println("Sum of Even Digits is "+evenSum+" and Odd Digits is "+oddSum);
	}
}