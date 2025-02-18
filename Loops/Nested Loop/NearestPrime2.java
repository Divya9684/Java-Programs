import java.util.Scanner;
class NearestPrime2 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num=new Scanner(System.in).nextInt();
		int nPrime=0;
		int pPrime=0;

		for(int i=num-1;i>=2;i--){
			boolean flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag){
				pPrime=i;
				break;
			}
		}

		for(int i=num+1; ;i++){
			boolean flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag){
				nPrime=i;
				break;
			}
		}
		
		if((nPrime-num)>(num-pPrime))
			System.out.println(pPrime);

		else if ((nPrime-num)<(num-pPrime))
			System.out.println(nPrime);
		else
			System.out.println(pPrime+" "+nPrime);
	}
}
