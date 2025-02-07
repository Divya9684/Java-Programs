import java.util.Scanner;

class AreaPeriCircle{
	public static void main(String[] args){
		final float pi=22/7;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the radius (cm) : ");
		float radius=sc.nextFloat();

		double perimeter=2*pi*radius;
		double area=pi*radius*radius;

		System.out.println("Perimeter of circle for radius "+ radius +" cm is "+ perimeter +" cm");
		System.out.println("Area of circle for radius "+ radius +" cm is "+ area +" cm^2");
	}
}