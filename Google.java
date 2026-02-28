class Google{
	String color;
	String founderName;
	int foundedYear;
	String headQuater;
	int employeeCount;
	String annualRevenue;
	String emailService;
	String cloudService;
	String searchEngineName;
	double stockPrice;
	boolean publicCompany;
	boolean provideCloudServicde;
	int productCount;
	String browserName;
	String parentCompany;
	String videoPlatform;
	String mobileOs;
	String ceo;
	int totalOffice;
	String mapService;
	
	Google(String color,String founderName,int foundedYear,	String headQuater,int employeeCount,String annualRevenue,
	String emailService,String cloudService,String searchEngineName,double stockPrice,boolean publicCompany,
	boolean provideCloudServicde,int productCount,String browserName,String parentCompany,String videoPlatform,
	String mobileOs,String ceo,int totalOffice,String mapService
	){
		this.color=color;
		this.founderName=founderName;
		this.foundedYear=foundedYear;
		this.headQuater=headQuater;
		this.employeeCount=employeeCount;
		this.annualRevenue=annualRevenue;
		this.emailService=emailService;
		this.cloudService=cloudService;
		this.searchEngineName=searchEngineName;
		this.stockPrice=stockPrice;
		this.publicCompany=publicCompany;
		this.provideCloudServicde=provideCloudServicde;
		this.productCount=productCount;
		this.browserName=browserName;
		this.parentCompany=parentCompany;
		this.videoPlatform=videoPlatform;
		this.mobileOs=mobileOs;
		this.ceo=ceo;
		this.totalOffice=totalOffice;
		this.mapService=mapService;
	}
	
	void display()
	{
		System.out.println("exploring the google infrastructure.....");
		System.out.println("google symbol color:"+color);
		System.out.println("google founder name:"+founderName);
		System.out.println("foundedYear:"+foundedYear);
		System.out.println("headQuater:"+headQuater);
		System.out.println("employeeCount:"+employeeCount);
		System.out.println("annualRevenue:"+annualRevenue);
		System.out.println("emailService:"+emailService);
		System.out.println("cloudService:"+cloudService);
		System.out.println("searchEngineName:"+searchEngineName);
		System.out.println("stockPrice:"+stockPrice);
		System.out.println("publicCompany:"+publicCompany);
		System.out.println("provideCloudServicde:"+provideCloudServicde);
		System.out.println("productCount:"+productCount);
		System.out.println("browserName:"+browserName);
		System.out.println("parentCompany:"+parentCompany);
		System.out.println("emailService:"+videoPlatform);
		System.out.println("mobileOs:"+mobileOs);
		System.out.println(" ceo:"+ceo);
		System.out.println("totalOffice:"+totalOffice);
		System.out.println("mapService:"+mapService);
	}
	
}