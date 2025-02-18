import java.util.Scanner;
class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int dup=num;
		int rev=0;

		while(num>0){
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(rev==dup)
			System.out.println(dup+" is palindrome number");
		else
			System.out.println(dup+" is not palindrome number");
	}
}
