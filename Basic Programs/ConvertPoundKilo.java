import java.util.Scanner;

class ConvertPoundKilo
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter a number in pounds : ");
		float pounds=sc.nextFloat();

		float kilograms=pounds*0.454f;

		System.out.println(pounds+" is "+kilograms+" kilograms");
	}

}