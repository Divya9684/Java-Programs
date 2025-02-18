import java.util.Scanner;
class KrishNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=num;i>0;i/=10){
			int rem=i%10;
			int fact=1;
			for(int j=1;j<=rem;j++){
				fact*=j;
			}
			sum+=fact;
		}
		if(num==sum)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
