class ChromeRunner{
	public static void main(String... values)
	{
		MobileChromeBrowser mobileChromeBrowser=new MobileChromeBrowser();
		
		ChromeBrowser chromeBrowser=new ChromeBrowser();
		
		Browser browser=new ChromeBrowser();
		
		Browser browser1=new Browser();
		
		Computer computer=new Computer();
		computer.install(mobileChromeBrowser);
		
	}
	
}