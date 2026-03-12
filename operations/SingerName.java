class SingerName{
	String[] musicians;
	int presntIndex=0;
	
	SingerName(String[] musicians)
	{
		this.musicians=musicians;
	}
	void save(String name)
	{
		System.out.println("executing the save of singername..");
		if(this.musicians!=null)
		{
			System.out.println("Singer Name:"+name);
			System.out.println("executing the present index:"+this.presntIndex);
			int singers=this.musicians.length-1;
			if(this.presntIndex<=singers)
			{
				this.musicians[this.presntIndex]=name;
				this.presntIndex++;
				System.out.println("executing the index,then move to next index:"+this.presntIndex);
			}
			else{
				System.out.println("array is .................");
			}
			
		}
		else{
			System.out.println("array cannot be.................");
		}
	}
}