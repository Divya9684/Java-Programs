import java.util.Scanner;
class EvenOddDigitBasedLength 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		int num=new Scanner(System.in).nextInt();
		int dup=num;
		int cnt=0;

		while(num>0){
			cnt++;
			num/=10;
		}
		String newNum="";
		if(cnt%2==0){
			for(int i=dup;i>0;i/=10){
				int rem=i%10;
				if(rem%2!=0)
					newNum= ++rem + newNum;
				else
					newNum=rem+newNum;
			}
		}

		else{
			for(int i=dup;i>0;i/=10){
				int rem=i%10;
				if(rem%2==0)
					newNum= ++rem + newNum;
				else
					newNum=rem+newNum;
			}
		}
		
		System.out.println(dup+" : "+newNum);

	}
}
