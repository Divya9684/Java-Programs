import java.util.Scanner;

class EvenOddWithoutMod{
	public static void main(String[] args){
		System.out.print("Enter the number : ");
		int num=new Scanner(System.in).nextInt();
		//System.out.println(num%2==0);
		System.out.println((num/2)==(num/2.0)); // operations are performs on binary value 
		System.out.println((num/2)*2==num);
	}
}
