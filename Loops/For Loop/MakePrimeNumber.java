import java.util.Scanner;
class MakePrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		boolean flag=true; //This flag is only for understanding not needed

		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=false; 
				num++;
				i=2;
			}
		}
		System.out.println(num);

	}
}
