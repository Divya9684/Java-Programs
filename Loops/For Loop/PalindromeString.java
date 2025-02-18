import java.util.Scanner;
class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=sc.next();
		String dup=str;
		String rev="";

		for(int i=str.length()-1;i>=0;i--)
			rev+=str.charAt(i);

		if(rev.equals(dup))
			System.out.println(str+" is palindrome string");
		else
			System.out.println(str+" is not palindrome string");
	}
}
