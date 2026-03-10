class Server
{
    String[] services;
    Client[] clients;

    Server(String[] services,Client[] clients)
    {
        this.services=services;
        this.clients=clients;
    }

    void display()
    {
        System.out.println("Executing server information......");

        if(this.services!=null)
        {
            System.out.println("Total server type:"+this.services.length);

            for(String service:services)
            {
                System.out.println("Server type:"+service);
            }
        }

        if(this.clients!=null)
        {
            System.out.println("Total clients:"+this.clients.length);

            for(Client client:this.clients)
            {
                client.getInfo();
            }
        }
    }
}