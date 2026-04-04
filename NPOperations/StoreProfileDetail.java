class StoreProfileDetail{
    Profile[] profiles;
    int curtIndex;

    StoreProfileDetail(Profile[] profiles){
        this.profiles=profiles;
    }

    void save(Profile profile){
        if(this.profiles!=null){
            System.out.println("profile storage is ready..");
            if(profile!=null){
                int index=this.profiles.length-1;
                if(curtIndex<=index){
                    this.profiles[curtIndex]=profile;
                    this.curtIndex++;
                    profile.printInfo();
                }
                else{
                    System.out.println("no space to store more profiles..");
                }
            }
            else{
                System.out.println("profile data missing, cannot save..");
            }
        }
        else{
            System.out.println("profile array not initialized..");
        }
    }
}