class CompanyNameRunner{
	public static void main(String[] args)
	{
		String[] company = new String[5];
		PertroliumCompanyName companyName= new PertroliumCompanyName(company);
		companyName.store("IOCL");
		companyName.store("BPCL");
		companyName.store("RIL");
		companyName.store("Nayara");
		companyName.store("Shell India");
		
		System.out.println("=======================================================");
		
		boolean found= companyName.search("RIL");
		System.out.println("name found:"+found);
		
		System.out.println("=======================================================");
		
		String[] singer=new String[20];
		SingerName name=new SingerName(singer); 
		name.save("Arjith singh");
		name.save("Arjunjanya");
		name.save("vijay prakash");
		name.save("anuradha");
		name.save("chitra");
		name.save("vasuki vaibhav");
		name.save("balasubramanya");
		name.save("shreya ghosha");
		name.save("sonu nigam");
		name.save("A R rehaman");
		name.save("arman malik");
		name.save("Justin Bieber");
		name.save("rihana");
		name.save("katy perry");
		name.save("raghu dixit");
		name.save("rajesh krishnan");
		name.save("aishwarya rangarajan");
		name.save("yesudas");
		name.save("hemanth");
		name.save("chandan shetty");
		
		System.out.println("=======================================================");
		
		boolean foundName=name.search("vijay prakash");
		System.out.println("name found:"+foundName);
		
		System.out.println("=======================================================");
		
		String[] model=new String[50];
		StoreModel storeModel=new StoreModel(model);
		storeModel.storeData("Honda");
		storeModel.storeData("TVS");
		storeModel.storeData("splender");
		storeModel.storeData("rx-100");
		storeModel.storeData("suzuki");
		storeModel.storeData("bajaj platina 100");
		storeModel.storeData("Hero splendor splus");
		storeModel.storeData("bajaj platina 150");
		storeModel.storeData("yamaha R15");
		storeModel.storeData("royal enfield classic");
		storeModel.storeData("TVS apache RT");
		storeModel.storeData("honda shine");
		storeModel.storeData("suzuki access 125");
		storeModel.storeData("hero passion pro");
		storeModel.storeData("yamaha XZ");
		storeModel.storeData("honda dio");
		storeModel.storeData("hero glamour");
		storeModel.storeData("tvs rider 125");
		storeModel.storeData("bajaj avender 225");
		storeModel.storeData("suzuki gizzer");
		storeModel.storeData("KTM Duke 125");
		storeModel.storeData("KTM Duke 200");
		storeModel.storeData("KTM Duke 250");
		storeModel.storeData("KTM RC 200");
		storeModel.storeData("KTM RC 390");
		storeModel.storeData("Royal Enfield Hunter 350");
		storeModel.storeData("Royal Enfield Meteor 350");
		storeModel.storeData("Royal Enfield Bullet 350");
		storeModel.storeData("Royal Enfield Himalayan");
		storeModel.storeData("Bajaj Pulsar 125");
		storeModel.storeData("Bajaj Pulsar 180");
		storeModel.storeData("Bajaj Pulsar NS200");
		storeModel.storeData("Bajaj Dominar 250");
		storeModel.storeData("Bajaj Dominar 400");
		storeModel.storeData("Hero Xpulse 200");
		storeModel.storeData("Hero Xtreme 160R");
		storeModel.storeData("Hero HF Deluxe");
		storeModel.storeData("Hero Super Splendor");
		storeModel.storeData("TVS Star City Plus");
		storeModel.storeData("TVS Sport");
		storeModel.storeData("TVS Ronin");
		storeModel.storeData("Yamaha MT 15");
		storeModel.storeData("Yamaha FZ S");
		storeModel.storeData("Yamaha Fazer");
		storeModel.storeData("Honda Hornet 2.0");
		storeModel.storeData("Honda SP 125");
		storeModel.storeData("Honda CB Unicorn");
		storeModel.storeData("Suzuki Burgman Street");
		storeModel.storeData("Suzuki Avenis 125");
		storeModel.storeData("Suzuki Hayabusa");
		
		System.out.println("=================================================");
		
		boolean foundModel=storeModel.search("Honda SP 125");
		System.out.println("name found:"+foundModel);
		
	}
}