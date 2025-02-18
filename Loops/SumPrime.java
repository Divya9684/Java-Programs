import java.util.Scanner;
class SumPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int sum=0;

		for(int i=num-1;i>1;i--){
			boolean flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag){

				if(sum+i<=num && num-i>2){
					sum+=i;
					System.out.println(i);
					if(sum==num)
						break;
				}
			}
		}

	}
}
