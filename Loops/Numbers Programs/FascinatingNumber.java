import java.util.Scanner;
class FascinatingNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		boolean flag=true;

		String str=num+""+(2*num)+(3*num);

		for(char i='1';i<='9';i++){
			int cnt=0;
			for(int j=0;j<str.length();j++){
				char ch=str.charAt(j);
				if(ch==i)
					cnt++;
			}
			if(cnt!=1){
				flag=false;
				break;
			}
		}

		if(flag)
			System.out.println(num+" is Fascinating Number");
		else
			System.out.println(num+" is not Fascinating Number");

	}
}
