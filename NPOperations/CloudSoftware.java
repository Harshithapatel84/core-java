class CloudSoftware{
    String name;
    String version;
    double storageCapacity;
    boolean secure;
    String deployType;

    CloudSoftware(String name,String version,double storageCapacity,boolean secure,String deployType){
        this.name=name;
        this.version=version;
        this.storageCapacity=storageCapacity;
        this.secure=secure;
        this.deployType=deployType;
    }

    void printInfo(){
        System.out.println("executing cloud software details..");
        System.out.println("name:"+this.name+",version:"+this.version+
        ",storage:"+this.storageCapacity+",secure:"+this.secure+
        ",deploy:"+this.deployType);
    }
}