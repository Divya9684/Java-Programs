// 2, 6, 22, 276, 65814, ...
class NumSeries2 
{
	public static void main(String[] args) 
	{
		int num=2;
		System.out.print(num+" ");
		for(int i=2,p=2;i<=5;i++,p*=2){
			int pow=1;
			for(int j=1;j<=p;j++)
				pow*=2;
			System.out.print(pow+num+" ");
			num+=pow;
		}
	}
}
