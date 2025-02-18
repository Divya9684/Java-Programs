import java.util.Scanner;
class GoodPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		int cnt=0;

		for(int i=1;i<=num;i++){
			boolean flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag){
				outer:
				for(int l=i;l>0;l/=10){
					int rem=l%10;
					if(rem==1){
						flag=false;
						break;
					}
				
					else{
						for(int k=2;k<rem;k++){
							if(rem%k==0){
								flag=false;
								break outer;
							}
						}
					}
				}
				if(flag){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
