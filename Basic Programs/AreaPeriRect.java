import java.util.Scanner;

class AreaPeriRect
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the width (cm) : ");
		float width=sc.nextFloat();

		System.out.print("Enter the height (cm) : ");
		float height=sc.nextFloat();

		double area=width*height;
		double perimeter=2*(width+height);

		System.out.println("Area of rectangle is "+area+" cm^2");
		System.out.println("Perimeter of rectangle is "+perimeter+" cm");
	}

}