import java.util.Scanner;
class EmirpNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		int num=new Scanner(System.in).nextInt();
		int rev=0;
		boolean isPrime=true;

		for(int i=2;i<num;i++){
			if(num%i==0){
				isPrime=false;
				System.out.println(num+" is not prime");
				System.exit(0);
			}
		}

		for(int i=num;i>0;i/=10){
			rev=(rev*10)+(i%10);
		}

		for(int i=2;i<rev;i++){
			if(rev%i==0){
				isPrime=false;
				System.out.println(rev+" is not prime");
				System.exit(0);
			}
		}

		if(isPrime)
			System.out.println(num+" and "+rev+" are Emirp number");


	}
}
