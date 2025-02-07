import java.util.Scanner;

class CalculateTips{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter the subtotal : ");
		float subTotal=sc.nextFloat();
		System.out.print("Enter the tip rate : ");
		float tipRate=sc.nextFloat();

		float tip= subTotal*(tipRate/100);
		float total=subTotal+tip;

		System.out.println("The tip is "+tip+" and total is "+total);


	}
}