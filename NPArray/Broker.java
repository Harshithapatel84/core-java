class Broker
{
    String[] fields;
    Customer[] customers;

    Broker(String[] fields,Customer[] customers)
    {
        this.fields=fields;
        this.customers=customers;
    }

    void display()
    {
        System.out.println("Executing broker information......");

        if(this.fields!=null)
        {
            System.out.println("Total fields:"+this.fields.length);

            for(String field:this.fields)
            {
                System.out.println("Broker field:"+field);
            }
        }

        if(this.customers!=null)
        {
            System.out.println("Total customers:"+this.customers.length);

            for(Customer customer:this.customers)
            {
                customer.getInfo();
            }
        }
    }
}