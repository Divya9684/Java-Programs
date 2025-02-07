import java.util.Scanner;
class CharUsername 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name : ");
		String name=sc.next().toUpperCase();

		int len=name.length();

		for(int i=0;i<len;i++){
			System.out.println(name.charAt(i));
		}
	}
}
