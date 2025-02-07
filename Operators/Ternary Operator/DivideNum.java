import java.util.Scanner;
class DivideNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();

		System.out.println((num%2==0 && num%5==0)?("Hii 2 and 5"):((num%2==0)?("Hii 2"):((num%5==0)?("Hii 5"):(""))));
	}
}
