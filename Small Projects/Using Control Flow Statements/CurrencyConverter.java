import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("       CURRENCY CONVERTER");
		System.out.println();
		System.out.print("Enter the Amount (INR) : ");
		float inr=sc.nextFloat();
		System.out.println();

		System.out.println("LIST OF CURRENCY");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("4. DNR");
		System.out.println("5. YEN");

		System.out.print("Enter the Currency : ");
		String crr=sc.next().toUpperCase();

		float conCurr=0;

		if(crr.equals("USD")){
			conCurr=inr/86.56f;
			System.out.println(inr+" INR = "+conCurr+" USD ");
		}

		else if(crr.equals("EUR")){
			conCurr=inr/90.25f;
			System.out.println(inr+" INR = "+conCurr+" EUR ");
		}

		else if(crr.equals("GBP")){
			conCurr=inr/107.66f;
			System.out.println(inr+" INR = "+conCurr+" GBP ");
		}

		else if(crr.equals("PKR")){
			conCurr=inr/0.31f;
			System.out.println(inr+" INR = "+conCurr+" PKR ");
		}

		else if(crr.equals("DNR")){
			conCurr=inr/280.76f;
			System.out.println(inr+" INR = "+conCurr+" DNR ");
		}

		else if(crr.equals("YEN")){
			conCurr=inr/0.56f;
			System.out.println(inr+" INR = "+conCurr+" YEN ");
		}
		else{
			System.out.println("INVALID INPUT");
		}
	}
}
