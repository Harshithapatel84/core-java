class Statue{
    String name;
    String location;
    double height;
    int year;
    String material;

    Statue(String name,String location,double height,int year,String material){
        this.name=name;
        this.location=location;
        this.height=height;
        this.year=year;
        this.material=material;
    }

    void printInfo(){
        System.out.println("executing statue details to store ");
        System.out.println("name:"+this.name+",location:"+this.location+
        ",height:"+this.height+",year:"+this.year+",material:"+this.material);
    }
}
	
	
	
