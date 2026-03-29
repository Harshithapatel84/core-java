class GenderStore{
    String[] genders;
    GenderStore(String[] genders) 
	{
        this.genders = genders;
    }

   void ascend() {
        for(int i=0;i<genders.length-1; i++) 
		{
            for (int j=i+1;j<genders.length;j++) 
			{
                if (genders[i].compareTo(genders[j])>0) 
				{
                    String temp=genders[i];
                    genders[i]=genders[j];
                    genders[j]=temp;
                }
            }
        }
    }
	
     void descend()
	 {
        for (int i=0;i<genders.length-1;i++) 
		{
            for (int j=i+1;j<genders.length;j++) 
			{
                if (genders[i].compareTo(genders[j])<0) 
				{
                    String temp=genders[i];
                    genders[i]=genders[j];
                    genders[j]=temp;
                }
            }
        }
    }

    void display() 
	{
        for (String gender:genders) 
		{
            System.out.println(gender);
        }
	}
}
        
    
