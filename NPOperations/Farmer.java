class Farmer{
    String name;
    String occupation;
    String location;
    double income;
    String cropName;

    Farmer(String name,String occupation,String location,double income,String cropName){
        this.name=name;
        this.occupation=occupation;
        this.location=location;
        this.income=income;
        this.cropName=cropName;
    }

    void printInfo(){
        System.out.println("farmer details execution started..");
        System.out.println("name:"+this.name+",occupation:"+this.occupation+
        ",location:"+this.location+",income:"+this.income+
        ",crop:"+this.cropName);
    }
}