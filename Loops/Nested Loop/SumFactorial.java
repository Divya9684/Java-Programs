class SumFactorial 
{
	public static void main(String[] args) 
	{
		int num=1234;
		int sum=0;

		while(num>0){
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++){
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		System.out.println(sum);
	}
}
