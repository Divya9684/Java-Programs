// 79, 108, 139, 176, 217, 260
class NumSeries5
{
	public static void main(String[] args) 
	{
		int num=79;
		System.out.print(num+" ");

		for(int i=1, first=29;i<=5;first++){
			boolean flag=true;
			for(int j=2;j<first;j++){
				if(first%j==0){
					flag=false;
					break;
				}
			}
			if(flag){
					num+=first;
					System.out.print(num+" ");
					i++;
			}
		}

	}
}
