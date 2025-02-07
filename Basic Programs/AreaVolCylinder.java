import java.util.Scanner;

class AreaVolCylinder{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the radius and height of cylinder (cm) : ");
		float radius=sc.nextFloat();
		float height=sc.nextFloat();

		double area=3.14*radius*radius;
		double volume=area*height;
		
		System.out.println("The area is "+area+" cm^2");
		System.out.println("The volume is "+volume+" cm^3");

	}
}