class Pattern10 
{
	public static void main(String[] args) 
	{	
		
		for(int i=1;i<=5;i++){
			int a=i;
			int diff=4;
			for(int j=1;j<=i;j++){
				System.out.print(a+" ");
				a+=diff;
				diff--;
			}
			System.out.println();
		}
	}
}
