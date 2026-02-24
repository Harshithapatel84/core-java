class CricketRunner{
    public static void main(String[] values)
	{
		Cricket cricket=new Cricket("T20","India","Australia","dubai",18-4-16,76,5,"surya kumar yadav","kl rahul",
		17-20,27,"Indian",67,156,4,"bowling",true,"batting",4);
		System.out.println("match type:"+cricket.matchType);
		System.out.println("team A:"+cricket.teamA);
		System.out.println(" team B:"+cricket.teamB);
		System.out.println("venue:"+cricket.venue);
		System.out.println("match date:"+cricket.date);
		System.out.println("no of wicket loss:"+cricket.wicketLoss);
		System.out.println("captain name:"+cricket.captainNmae);
		System.out.println("man Of The Match:"+cricket.manOfTheMatch);
		System.out.println("match timings:"+cricket.time);
		System.out.println("Player id:"+cricket.id);
		System.out.println("Players nationality:"+cricket.nationality);
		System.out.println("strike Rate :"+cricket.strikeRate);
		System.out.println("runsScored:"+cricket.runScored);
		System.out.println("over:"+cricket.over);
		System.out.println("run rate:"+cricket.runRate);
		System.out.println("toss decision by team:"+cricket.tossDecision);
		System.out.println(" result:"+cricket.result);
		System.out.println("individual player role:"+cricket.playerRole);
		System.out.println(" total matches:"+cricket.totalMatches);

	}
	
	}