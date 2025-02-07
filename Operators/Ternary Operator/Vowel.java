import java.util.Scanner;
class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch=sc.next().charAt(0);

		System.out.println(((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))?(ch+" is a vowel"):(ch+" is a consonent"));
	}
}
