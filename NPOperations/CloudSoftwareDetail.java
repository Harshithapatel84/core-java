class CloudSoftwareDetail{
    CloudSoftware[] clouds;
    int curtIndex;

    CloudSoftwareDetail(CloudSoftware[] clouds){
        this.clouds=clouds;
    }

    void save(CloudSoftware cloud){
        if(this.clouds!=null){
            System.out.println("executing the cloud storage..");

            if(cloud!=null){
                int index=this.clouds.length-1;

                if(curtIndex<=index){
                    this.clouds[curtIndex]=cloud;
                    this.curtIndex++;
                    cloud.printInfo();
                }
                else{
                    System.out.println("cloud is full..");
                }
            }
            else{
                System.out.println("it is null, cannot store..");
            }
        }
        else{
            System.out.println("cloud array is null..");
        }
    }
}