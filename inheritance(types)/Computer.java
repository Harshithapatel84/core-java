class Computer{
	Computer()
	{
		
	}
	void install(Browser browser)
	{
	System.out.println("executing the install in computer");
	if(browser!=null)
	{
		browser.open();
		if(browser instanceof MobileChromeBrowser)
		{
		MobileChromeBrowser mobile=(MobileChromeBrowser)browser;
		mobile.fastOpen();
		mobile.offline();
		}
	}
	}
}