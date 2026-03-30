class Factory
{
    String name;
	int year;
	String type;
	
	Factory(){
        System.out.println("Factory object created");
    }

    void produce(){
        System.out.println("Factory produces goods");
    }

    void detail(){
        System.out.println("Name:"+name+",Year:"+year+",Type:"+type);
    }
}
	
	

