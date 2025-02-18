// 10, 30, 68, 130, 222, 350
class NumSeries3 
{
	public static void main(String[] args) 
	{
		int num=10;
		System.out.print(num+" ");

		for(int i=1, first=20, second=18;i<=5;i++){
			num+=first;
			System.out.print(num+" ");
			first+=second;
			second+=6;
		}

	}
}
