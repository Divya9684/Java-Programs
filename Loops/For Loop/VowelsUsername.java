import java.util.Scanner;
class VowelsUsername 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name : ");
		String name=sc.next().toUpperCase();
		
		int len=name.length();

		for(int i=0;i<len;i++){
			if(name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' || name.charAt(i)=='O' || name.charAt(i)=='U'){
				System.out.println(name.charAt(i));
			}
		}
	}
}
