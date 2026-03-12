class StoreModel{
	String[] models;
	int currentIndex=0;
	StoreModel(String[] models)
	{
		this.models=models;
	}
	void storeData(String model)
	{
		System.out.println("executing to store data of two wheeler model...");
		if(this.models!=null)
		{
			System.out.println("model name:"+model);
			System.out.println("executing the present index:"+this.currentIndex);
			int version=this.models.length-1;
			if(this.currentIndex <= version)
			{
				this.models[currentIndex]=model;
				this.currentIndex++;
				System.out.println("executing the current index values,move to next index:"+this.currentIndex);
			}
			else{
				System.out.println("array is full....");
			}
		}
		else{
			System.out.println("array cannot be null............");
		}
		
	}
}