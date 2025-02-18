import java.util.Scanner;
class FascinatingNumberWithoutString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int dup=num;
		boolean flag=true;

		for (int i=2;i<=3;i++ )
		{
			num=(num*1000)+(dup*i);
		}

		for(int i=1;i<=9;i++){
			int cnt=0;
			for(int j=num;j>0;j/=10){
				if(i==(j%10))
					cnt++;
			}
			if(cnt!=1){
				flag=false;
				break;
			}
		}

		if(flag)
			System.out.println(dup+" is a Fascinating Number");
		else
			System.out.println(dup+" is not a Fascinating Number");

	}
}
