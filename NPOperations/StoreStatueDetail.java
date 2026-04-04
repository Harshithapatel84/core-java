class StoreStatueDetail{
    Statue[] statues;
    int curtIndex;

    StoreStatueDetail(Statue[] statues){
        this.statues=statues;
    }

    void save(Statue statue){
        if(this.statues!=null){
            System.out.println("statue details is ready to store..");

            if(statue!=null){
                int index=this.statues.length-1;

                if(curtIndex<=index){
                    this.statues[curtIndex]=statue;
                    this.curtIndex++;
                    statue.printInfo();
                }
                else{
                    System.out.println("no space to store statue details..");
                }
            }
            else{
                System.out.println("statue data missing, cannot save..");
            }
        }
        else{
            System.out.println("statue array caanot store");
        }
    }
}