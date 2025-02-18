class Pattern11 
{
	public static void main(String[] args) 
	{
		int diff1=9, diff2=-2;
		for(int i=1;i<=5;i++){
			int a=i;
			System.out.print(a+" ");
			for(int j=1;j<i;j++){
				if(j%2!=0)
					a+=diff1;
				
				else
					a+=diff2;
				System.out.print(a+" ");
			}
			System.out.println();
			diff1 -= 2;
			diff2 += 2;
			
		}
	}
}
