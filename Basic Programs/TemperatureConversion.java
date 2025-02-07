import java.util.Scanner;

class TemperatureConversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the degree in celsius : ");
		double celsius=sc.nextDouble();

		double fahrenheit=(9.0/5.0)*celsius+32;

		System.out.print(celsius+" celsius is "+fahrenheit+" fahrenheit");

	}
}