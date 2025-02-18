import java.util.Scanner;

class TemperatureConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("Convert C temperature to : ");
			System.out.println("1. Fahrenheit (F)");
			System.out.println("2. Kelvin (K)");
			System.out.println("3. Rankine (R)");
			System.out.println("4. Exit");

			System.out.print("Enter your option : ");
			int op=sc.nextInt();
			if(op==4)
				break;
			System.out.print("Enter the temperature (C) : ");
			float temp=sc.nextFloat();

			float ans=0;

			switch(op){
				case 1:{
					ans=((temp*(9.0f/5.0f))+32);
					System.out.println(temp+" C is "+ans+" F");
					break;
				}
				case 2:{
					ans=temp+273.15f;
					System.out.println(temp+" C is "+ans+" K");
					break;
				}
				case 3:{
					ans=(temp+273.15f)*(9.0f/5.0f);
					System.out.println(temp+" C is "+ans+" R");
					break;
				}
				default:
					System.out.println("Invalid Option");
			}
		}
		
	}
}
