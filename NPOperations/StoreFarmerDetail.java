class StoreFarmerDetail{
    Farmer[] farmers;
    int curtIndex;

    StoreFarmerDetail(Farmer[] farmers){
        this.farmers=farmers;
    }

    void save(Farmer farmer){
        if(this.farmers!=null){
            System.out.println("executing the farmer storage process..");

            if(farmer!=null){
                int index=this.farmers.length-1;

                if(curtIndex<=index){
                    this.farmers[curtIndex]=farmer;
                    this.curtIndex++;
                    farmer.printInfo();
                }
                else{
                    System.out.println("storage full, cannot add more farmers..");
                }
            }
            else{
                System.out.println("invalid cannot sore..");
            }
        }
        else{
            System.out.println("farmer array is null..");
        }
    }
}