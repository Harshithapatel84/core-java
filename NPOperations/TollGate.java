class TollGate{
    String name;
    int year;
    int laneCount;
    String location;
    double amount;

    TollGate(String name,int year,int laneCount,String location,double amount){
        this.name=name;
        this.year=year;
        this.laneCount=laneCount;
        this.location=location;
        this.amount=amount;
    }

    void printInfo(){
        System.out.println("executing tollgate details..");
        System.out.println("name:"+this.name+",year:"+this.year+
        ",lanes:"+this.laneCount+",location:"+this.location+
        ",amount:"+this.amount);
    }
}