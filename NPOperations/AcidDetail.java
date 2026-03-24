class AcidDetail{
    Acid[] acids;
    int curtIndex;

    AcidDetail(Acid[] acids){
        this.acids=acids;
    }

    void save(Acid acid){
        if(this.acids!=null){
            System.out.println("executing the acid details to store..");

            if(acid!=null){
                int index=this.acids.length-1;

                if(curtIndex<=index){
                    this.acids[curtIndex]=acid;
                    this.curtIndex++;
                    acid.printInfo();
                }
                else{
                    System.out.println("storage is full..");
                }
            }
            else{
                System.out.println("cannot sane it is null");
            }
        }
        else{
            System.out.println("caanot store..");
        }
    }
}