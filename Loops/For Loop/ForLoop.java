class ForLoop 
{
	public static void main(String[] args) 
	{
		System.out.println("1 to 10");

		for(int i=1;i<=10;i++){
			System.out.print(i+" ");
		}

		System.out.println();
		System.out.println();
		System.out.println("A to Z");


		for(char ch='A';ch<='Z';ch++){
			System.out.print(ch+" ");
		}

		System.out.println();
		System.out.println();
		System.out.println("z to a");

		for(char ch='z';ch>='a';ch--){
			System.out.print(ch+" ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Digits 0 to 9");

		for(char ch='0';ch<='9';ch++){
			System.out.print(ch+" ");
		}

		System.out.println();
		System.out.println();
		System.out.println("ASCII");

		for(int i=0;i<=127;i++){
			System.out.println(i+" : "+((char)i));
		}
	}
}
