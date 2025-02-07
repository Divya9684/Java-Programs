import java.util.Scanner;
class CheckSeason 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month : ");
		String month=sc.next().toLowerCase();

		//String season=(month==feb || month==mar || month==apr || month==may)?("Summer"):((month==nov || month==dec || month==jan)?("Winter"):((month==jun ||month==jul || month==aug || month==sept)?("Rainy"):("Invalid input")));
		String season=(month.equals("feb") || month.equals("mar") || month.equals("apr") || month.equals("may"))?("Summer"):((month.equals("nov") || month.equals("dec") || month.equals("jan"))?("Winter"):((month.equals("jun") || month.equals("jul") || month.equals("aug") || month.equals("sept"))?("Rainy"):("Invalid input")));

		System.out.println(month+" "+season);

	}
}
