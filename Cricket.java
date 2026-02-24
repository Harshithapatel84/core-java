class Cricket{
	String matchType;
	String teamA;
	String teamB;
	String venue;
	int date;
	int runRate;
	int wicketLoss;
	String captainNmae;
	String manOfTheMatch;
	double time;
	int id;
	String nationality;
	double strikeRate;
	int runScored;
	int over;
	String tossDecision;
	boolean result;
	String playerRole;
	int totalMatches;
	
	Cricket(String matchType,String teamA,String teamB,String venue,int date,
	int runRate,int wicketLoss,String captainNmae,String manOfTheMatch,double time,
	int id,String nationality,double strikeRate,int runScored,int over,
	String tossDecision,boolean result,String playerRole,int totalMatches){
		
		this.matchType=matchType;
		this.teamA=teamA;
		this.teamB=teamB;
		this.venue=venue;
		this.date=date;
		this.runRate=runRate;
		this.wicketLoss=wicketLoss;
		this.captainNmae=captainNmae;
		this.manOfTheMatch=manOfTheMatch;
		this.time=time;
		this.id=id;
		this.nationality=nationality;
		this.strikeRate=strikeRate;
		this.runScored=runScored;
		this.over=over;
		this.tossDecision=tossDecision;
		this.result=result;
		this.playerRole=playerRole;
		this.totalMatches=totalMatches;
	}
	
}