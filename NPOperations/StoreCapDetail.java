class StoreCapDetail{
	Cap[] caps;
	int curtIndex;
	
	StoreCapDetail(Cap[] caps)
	{
		this.caps=caps;
	}
	void save(Cap cap)
	{
		if(this.caps!=null)
		{
			System.out.println("cap details is not null execute..");
			if(cap!=null)
			{
				int index=this.caps.length-1;
				if(curtIndex<=index)
				{
					this.caps[curtIndex]=cap;
					this.curtIndex++;
					cap.printInfo();
				}
			}
			else{
				System.out.println("cap is null");
			}
		}
		else
		{
			System.out.println("details is null..");
		}
	}
}