class Media{
    String name;
    int customer;
    int worker;

    Media(){
        System.out.println("Media object with no args");
    }

    void detail(){
        System.out.println("Name:"+name+",Customer:"+customer+
        ",Worker:"+worker);
    }
	
	void showData()
	{
		System.out.println("executing the media platform");
	}
}