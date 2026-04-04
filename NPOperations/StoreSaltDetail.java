class StoreSaltDetail{
    Salt[] salts;
    int curtIndex;

    StoreSaltDetail(Salt[] salts){
        this.salts=salts;
    }

    void save(Salt salt){
        if(this.salts!=null){
            System.out.println("executing salt storage process ..");

            if(salt!=null){
                int index=this.salts.length-1;

                if(curtIndex<=index){
                    this.salts[curtIndex]=salt;
                    this.curtIndex++;
                    salt.printInfo();
                }
                else{
                    System.out.println("storage full, cannot add more salts..");
                }
            }
            else{
                System.out.println("invalid cannot store");
            }
        }
        else{
            System.out.println("salt array is null.");
        }
    }
}