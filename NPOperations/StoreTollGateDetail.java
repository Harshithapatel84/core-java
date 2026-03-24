class StoreTollGateDetail{
    TollGate[] tolls;
    int curtIndex;

    StoreTollGateDetail(TollGate[] tolls){
        this.tolls=tolls;
    }

    void save(TollGate toll){
        if(this.tolls!=null){
            System.out.println("executing the tollgate storage to store data..");

            if(toll!=null){
                int index=this.tolls.length-1;
				if(curtIndex<=index){
                    this.tolls[curtIndex]=toll;
                    this.curtIndex++;
                    toll.printInfo();
                }
                else{
                    System.out.println("there is no space..");
                }
            }
            else{
                System.out.println("tollgate is null..");
            }
        }
        else{
            System.out.println("array cannot be null..");
        }
    }
}