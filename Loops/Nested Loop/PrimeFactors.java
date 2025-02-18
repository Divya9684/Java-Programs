import java.util.Scanner;
class PrimeFactors
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		
		for(int i=2;i<=num;i++){
			boolean isPrime=false;
			if(num%i==0)
				isPrime=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				System.out.println(i+" ");
			}

		}
	}
}
