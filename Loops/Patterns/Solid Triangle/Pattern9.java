class Pattern9 
{
	public static void main(String[] args) 
	{
		int a=1;
		for(int i=1;i<=5;i++){
			int b=a;
			for(int j=1;j<=i;j++){
				System.out.print(b-- +" ");
			}
			a+=i+1;
			System.out.println();
		}
	}
}
