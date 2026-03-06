class Ipl{
	String teamA;
	String teamB;
	int over;
	int runRate;
	String winner;
	Ball ball;
	Ampire ampire;
	Stadium stadium;
	Player player;
	Sponser sponser;
	
	Ipl(String teamA,String teamB,int over,
	int runRate,String winner,Ball ball,Ampire ampire,Stadium stadium,Player player,Sponser sponser)
	{
		this.teamA=teamA;
		this.teamB=teamB;
		this.over=over;
		this.runRate=runRate;
		this.winner=winner;
		this.ball=ball;
		this.ampire=ampire;
		this.stadium=stadium;
		this.player=player;
		this.sponser=sponser;
		
	}
	void getInfo()
	{
		System.out.println("team A:"+this.teamA+",team B:"+this.teamB+",overs:"+this.over+",run rate:"+this.runRate+",winner is:"+this.winner);
		if(this.ball!=null);
		{
			this.ball.display();
		}
	    if(this.ampire!=null)
		{
			this.ampire.getDetails();
		}
		if(this.stadium!=null)
		{
			this.stadium.showData();
		}
		if(this.player!=null)
		{
			this.player.details();
		}
		if(this.sponser!=null)
		{
			this.sponser.printDetails();
		}
	}
	
	
}