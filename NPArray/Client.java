class Client
{
    int port;
    boolean active;

    Client(int port,boolean active)
    {
        this.port=port;
        this.active=active;
    }

    void getInfo()
    {
        System.out.println("port number:"+this.port);
        System.out.println("Client active:"+this.active);
    }
}