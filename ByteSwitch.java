class ByteSwitch{
	public static void main(String[] values)
	{
		Byte age=24;
		switch(age)
		{
			case 24:
			System.out.println("age is 24");
			break;
			
			case 32:
			System.out.println("age is 32");
			break;
			
			case 45:
			System.out.println("age is 45");
			break;
			
			default:
			System.out.println("not matched");
		}
	}
}