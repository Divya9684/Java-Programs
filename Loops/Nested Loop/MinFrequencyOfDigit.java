class MinFrequencyOfDigit 
{
	public static void main(String[] args) 
	{
		long num=91212l;
		System.out.println(num);
		int dgt=9;
		int min=9;
		for(int i=0;i<=9;i++){
			int cnt=0;
			for(long j=num;j>0;j/=10){
				long rem=j%10;
				if(i==rem){
					cnt++;
				}
			}
			if(cnt!=0){
				if(min>cnt){
					min=cnt;
					dgt=i;
				}
			}
		}
		System.out.println("Minimum digit is "+dgt+" with a frequency of "+min);
	}
}
