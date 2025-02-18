import java.util.Scanner;
class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int f0=0;
		int f1=1;
		int f2;

		System.out.print("Fibonacci Series : "+f0+" "+f1+" ");
		for(int i=2;i<num;i++){
			f2=f0+f1;
			System.out.print(f2+" ");
			f0=f1;
			f1=f2;
		}			
	}
}
