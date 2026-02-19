class DecrementLoop{
    public static void main(String[] args)
    {
        int i=5;
        double j=5.5;
        char ch='E';
        float f=5.0f;
        long l=15;

        while(i>0)
        {
            int sparkle=1;
            while(sparkle<=1)
            {
                System.out.println("int: "+i);
                sparkle++;
            }
            i--;
        }

        while(j>1.5)
        {
            int rocket=1;
            while(rocket<=1)
            {
                System.out.println("double: "+j);
                rocket++;
            }
            j--;
        }

        while(ch>='A')
        {
            int star=1;
            while(star<=1)
            {
                System.out.println("char: "+ch);
                star++;
            }
            ch--;
        }

        while(f>1.0f)
        {
            int moon=1;
            while(moon<=1)
            {
                System.out.println("float: "+f);
                moon++;
            }
            f--;
        }

        while(l>10)
        {
            int comet=1;
            while(comet<=1)
            {
                System.out.println("long: "+l);
                comet++;
            }
            l--;
        }
    }
}
