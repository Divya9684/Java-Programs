import java.util.Scanner;
class PrimeRange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range : ");
		System.out.print("Num1 : ");
		int num1=sc.nextInt();
		System.out.print("Num2 : ");
		int num2=sc.nextInt();

		for(int i=num1;i<=num2;i++){
			boolean flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.print(i+" ");
		}
	}
}
