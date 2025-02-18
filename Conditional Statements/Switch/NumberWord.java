class Number 
{
	public static void main(String[] args) 
	{
		int num=1234;
		String str="";
		int rem=0;


		while(num>0){
			rem=num%10;
			switch(rem){
				case 0:{
					str="zero "+str;
					break;
				}
				case 1:{
					str="one "+str;
					break;
				}
				case 2:{
					str="two "+str;
					break;
				}
				case 3:{
					str="three "+str;
					break;
				}
				case 4:{
					str="four"+" "+str;
					break;
				}
				case 5:{
					str="five "+str;
					break;
				}
				case 6:{
					str="six "+str;
					break;
				}
				case 7:{
					str="seven "+str;
					break;
				}
				case 8:{
					str="eight "+str;
					break;
				}
				case 9:{
					str="nine "+str;
					break;
				}
			}
			num/=10;
		}
		System.out.println(str);
	}
}
