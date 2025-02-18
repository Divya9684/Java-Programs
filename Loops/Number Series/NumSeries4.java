// 1, 3, 9, 33, 153, 873
class NumSeries4
{
	public static void main(String[] args) 
	{
		int num=1;
		System.out.print(num+" ");
		for(int i=1, first=2,second=3;i<=5;i++){
			num+=first;
			System.out.print(num+" ");
			first*=second;
			second++;
		}
	}
}
