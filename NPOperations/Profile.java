class Profile{
    String name;
    int follower;
    boolean isPrivate;
    String bio;
    String gender;

    Profile(String name,int follower,boolean isPrivate,String bio,String gender){
        this.name=name;
        this.follower=follower;
        this.isPrivate=isPrivate;
        this.bio=bio;
        this.gender=gender;
    }

    void printInfo(){
        System.out.println("executing profile details..");
        System.out.println("name:"+this.name+",followers:"+this.follower+
        ",private:"+this.isPrivate+",bio:"+this.bio+",gender:"+this.gender);
    }
}