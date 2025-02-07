import java.util.Scanner;
class PrintDelay 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name=sc.next().toUpperCase();
		int len=name.length();

		for(int i=0;i<len;i++){
			System.out.println(name.charAt(i));
			Thread.sleep(2000);
		}
	}
}
