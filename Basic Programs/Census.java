class Census
{
	public static void main(String[] args){
		long currPop=312032486;
		final long seconds=(365*24*60*60)*5;
		
		long birth=seconds/7;
		long dead=seconds/13;
		long imm=seconds/45;

		long newPop=currPop+birth-dead+imm;

		System.out.println("Current population is "+currPop);
		System.out.println("New population after 5 years is "+newPop);
	}
}