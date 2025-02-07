import java.util.Scanner;

class IdentifyTypeChar
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch=sc.next().charAt(0);
		
		System.out.println(((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))?((ch>='a' && ch<='z')?(ch+" is a LowerCase alphabet"):(ch+" is an UpperCase alphabet")):((ch>='0' && ch<='9')?(ch+" is a Digit"):(ch+" is Special Character")));

	}
}
