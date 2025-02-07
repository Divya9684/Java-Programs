import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int bjp=0,cng=0,ss=0,aap=0,mns=0,nota=0;
		System.out.println();
		System.out.println("         Welcome");
		System.out.println();
		System.out.print("Enter the population : ");
		int population=sc.nextInt();

		for(int i=1;i<=population;i++){
			System.out.println();
			System.out.println("***LIST OF PARTIES***");
			System.out.println("1.BJP");
			System.out.println("2.CONGRESS");
			System.out.println("3.SHIV SENA");
			System.out.println("4.AAP");
			System.out.println("5.MNS");
			System.out.println("6.NOTA");
			System.out.println();
			System.out.print("Enter the option : ");
			int opt=sc.nextInt();

			if(opt>=1 &&opt<=6){
				if(opt==1){
					bjp++;
					System.out.println("ACHE DIN AYENGE");
				}
				if(opt==2){
					cng++;
					System.out.println("BHARAT TODO");
				}
				if(opt==3){
					ss++;
					System.out.println("HUM HAI ASLI SENA");
				}
				if(opt==4){
					aap++;
					System.out.println("MUZE AZAD KARO");
				}
				if(opt==5){
					mns++;
					System.out.println("JAI MAHARASHTRA");
				}
				if(opt==6){
					nota++;
					System.out.println("YOU ARE AN EDUCATED PERSON");
				}
			}	
			if(!(opt>=1 && opt<=6))
			{
				i--;
				System.out.println("INVALID OPTION");
			}
		}

		System.out.println();

		if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			System.out.println("BJP HAS WON THE ELECTION BY "+bjp+" votes");
			return;

		if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
			System.out.println("CONGRESS HAS WON THE ELECTION BY "+cng+" votes");
			return;

		if(ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota)
			System.out.println("SHIV SENA HAS WON THE ELECTION BY "+ss+" votes");
			return;

		if(aap>=bjp && aap>=cng && aap>=ss && aap>=mns && aap>=nota)
			System.out.println("AAP HAS WON THE ELECTION BY "+aap+" votes");
			return;

		if(mns>=bjp && mns>=cng && mns>=ss && mns>=aap && mns>=nota)
			System.out.println("MNS HAS WON THE ELECTION BY "+mns+" votes");
			return;

		if(nota>=bjp && nota>=cng && nota>=ss && nota>=aap && nota>=mns)
			System.out.println("NOTA HAS WON THE ELECTION BY "+nota+" votes");
	}
}
