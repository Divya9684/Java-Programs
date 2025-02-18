import java.util.Scanner;
class NearestPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int dup=num;

		int nPrime=0;
		int pPrime=0;

		boolean flag=true;

		for(int i=2;i<num;i++)
			if(num%i==0)
				flag=false;

		if(flag)
			num++;

		for(int i=2;i<num;i++){
			if(num%i==0){
				i=2;
				num++;
			}
		}

		nPrime=num;

		num=dup;
		if(flag)
			num--;

		for(int j=2;j<num;j++){
			if(num%j==0){
				j=2;
				num--;
			}
		}

		pPrime=num;

		if((nPrime-dup)>(dup-pPrime))
			System.out.println(pPrime);

		else if ((nPrime-dup)<(dup-pPrime))
			System.out.println(nPrime);
		else
			System.out.println(pPrime+" "+nPrime);
	}
}


