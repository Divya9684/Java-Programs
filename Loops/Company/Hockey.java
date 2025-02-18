import java.util.Scanner;
class Hockey 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int cnt=1;
		boolean flag=true;

		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				cnt++;
			}
			else
				cnt=1;

			if(cnt>=7){
					flag=false;
					break;
			}
		}
		if(flag)
			System.out.println("not");
		else
			System.out.println("dangerous");

	}
}
