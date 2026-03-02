class NumberStringOperation{
	int num[];
	int evenSum=0;
	int oddSum=0;
	String text;
	int number;
	
	NumberStringOperation(int[] num)
	{
		this.num=num;
	}
	NumberStringOperation(String text)
	{
		this.text=text;
	}
	NumberStringOperation(int a)
	{
		this.number=number;
	}
	
	void evenOdd()
	{
	for(int i=0;i<num.length;i++)
	{
		if(num[i] % 2 == 0)
		{
			evenSum += num[i];
		}
		else
		{
			oddSum +=num[i];
		}
	}
		System.out.println("even sum is:"+evenSum);
		System.out.println("odd sum is:"+oddSum);
	}
	
	void reverseString(){
		for(int i=text.length()-1;i>=0;i--)
		{
			System.out.println(text.charAt(i));
		}
	}
	
	void sumOfNumber(){
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum += num[i];
		}
		System.out.println("sum is:"+sum);
	}
	
	void palindrome()
	{
		int original=number;
		int rev=0;
		while(number>0)
		{
		   int digit=number%10;
	       rev=rev*10+digit;
		   number=number/10;
		}
		if(rev==original)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}

