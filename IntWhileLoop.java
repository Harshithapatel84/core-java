class IntWhileLoop
{
    public static void main(String[] args)
    {
        int i=0;
		double j=1.5;
		char ch='A';
		float f=1.0f;
		long l=10;
		int street = 1;
        int house=1;


        while(i<5)
        {
            System.out.println(i);
            i++;
        }

        while(j<5.5)
        {
            System.out.println(j);
            j++;
        }

        while(ch<='E')
        {
            System.out.println(ch);
            ch++;
        }

        while(f<5.0f)
        {
            System.out.println(f);
            f++;
        }
		 
        while(l<15)
        {
            System.out.println(l);
            l++;
        }
		
	
    while(street <= 3)
    {
    System.out.println("Street: " + street);

    while(house <= 4)
    {
        System.out.println("  House No: " + house);
        house++;
    }

    street++;   

    }
	}
	
}
