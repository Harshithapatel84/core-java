class Painter{
	String[] colors;
	Brush[] brushes;
	
	Painter(String[] colors,Brush[] brushes)
	{
		this.colors=colors;
		this.brushes=brushes;
	}
	void display()
	{
		System.out.println("executing the paint color by display..");
		if(colors!=null)
		{
			System.out.println("total colors:"+this.colors.length);
			for(String colour:colors)
			{
				System.out.println("color:"+colour);
			}
		}
		System.out.println("executing the type of brushes with prices");
		if(brushes!=null)
		{
			System.out.println("total number:"+this.brushes.length);
			for(Brush brush:brushes)
			{
				brush.getInfo();
			}
		}
	}
}