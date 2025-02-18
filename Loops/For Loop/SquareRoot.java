import java.util.Scanner;
class SquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int cnt=0;
		
		for(int i=1;i<num;i++)
			if(i*i==num){
				System.out.println(i);
				cnt=1;
			}

		if(cnt==0)
			System.out.println(num+" is not a perfect square root");
		
		
	}
}
