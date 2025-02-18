import java.util.Scanner;
class FrequencyDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();

		for(int i=0;i<=9;i++){
			int cnt=0;
			for(int j=num;j>0;j/=10){ //don't use while loop here because after first iteration num become zero and loop not work for other iterations
				int rem=j%10;
				if(i==rem)
					cnt++;
			}
			System.out.println(i+" : "+cnt);
		}
	}
}
