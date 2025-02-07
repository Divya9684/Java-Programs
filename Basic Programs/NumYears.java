import java.util.Scanner;

class NumYears{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of minutes : ");
		long minutes=sc.nextLong();
		

		long oneDayMin=24*60;
		long totalDays=minutes/oneDayMin;		

		long years=totalDays/365;
		long days=totalDays%365;
	
		System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days");
	}
}