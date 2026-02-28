class OrganizerRunner {
    public static void main(String[] args) {

        Organizer organizer1 = new Organizer("Desk Organizer","Plastic","Black","Rectangle","Office",299.9,
		2,2025,2028,true,true,true,false,"HomeNeeds","Stationery",0.50,4.5f,5,"India",true);
        organizer1.displayDetails();

        Organizer organizer2 = new Organizer("Kitchen Organizer","Steel","Silver","Round","Kitchen",
		499.0,1,2024,2029,true,true,false,true,"HomePlus","Storage",1.20,4.3f,3,"India",true);
        organizer2.displayDetails();

        Organizer organizer3 = new Organizer("Wardrobe Organizer","Cloth","Grey","Square","Bedroom",
		699.5,3,2025,2030,true,false,true,true,"Ikea","Furniture",2.00,4.6f,6,"Sweden",true);
        organizer3.displayDetails();

        Organizer organizer4 = new Organizer("Makeup Organizer","Acrylic","Transparent","Oval","Dressing",
		399.0,2,2024,2028,true,true,true,false,"BeautyCo","Cosmetics",0.75,4.4f,4,"USA",true);
        organizer4.displayDetails();

        Organizer organizer5 = new Organizer("File Organizer","Wood","Brown","Rectangle","Office",899.9,
		1,2023,2032,true,true,false,true,"WoodCraft","Stationery",3.50,4.2f,8,"India",true);
        organizer5.displayDetails();

        Organizer organizer6 = new Organizer("Cable Organizer","Rubber","Black","Small","Electronics",199.9,
		5,2025,2027,true,false,true,false,"TechGear","Accessories",0.20,4.1f,2,"China",false);
        organizer6.displayDetails();

        Organizer organizer7 = new Organizer("Toy Organizer","Plastic","Blue","Box","Kids Room",549.0,2,
		2024,2029,true,true,true,true,"FunHome","Storage",1.80,4.5f,5,"India",true);
        organizer7.displayDetails();

        Organizer organizer8 = new Organizer("Shoe Organizer","Fabric","Black","Long","Bedroom",799.0,1,
		2025,2031,true,true,false,true,"UrbanHome","Furniture",2.30,4.3f,10,"India",true);
        organizer8.displayDetails();

        Organizer organizer9 = new Organizer("Drawer Organizer","Plastic","White","Rectangle","Kitchen",
		249.5,4,2025,2028,true,true,true,false,"SmartStore","Utility",0.60,4.0f,6,"India",true);
        organizer9.displayDetails();

        Organizer organizer10 = new Organizer("Bag Organizer","Cloth","Pink","Square","Travel",
		459.9,2,2024,2030,true,false,true,true,"TravelMate","Accessories",1.10,4.7f,4,"USA",true);
        organizer10.displayDetails();
		
		System.out.println("=================================================================");
		
		Education education1 = new Education("ABC Engineering College","Computer Science","B.Tech","VTU","Bangalore",
        4,2001,3000,150,12,true,true,true,true,"NAAC A+","English",
        120000.0,4.6f,"India",true);
        education1.displayDetails();

        Education education2 = new Education("XYZ Medical College","MBBS","Medical","RGUHS","Mysore",
        5,1998,2000,120,8,true,true,true,true,"NAAC A","English",
        250000.0,4.5f,"India",false);
        education2.displayDetails();

        Education education3 = new Education("Global Business School","MBA","Postgraduate","Bangalore University","Bangalore",
        2,2005,1800,90,15,true,true,false,true,"NBA","English",
        150000.0,4.3f,"India",true);
        education3.displayDetails();

        Education education4 = new Education("National Law College","LLB","Law","Delhi University","Delhi",
        3,1995,1200,70,10,true,false,true,true,"NAAC A","English",
        100000.0,4.4f,"India",false);
        education4.displayDetails();

        Education education5 = new Education("Creative Arts College","BFA","Arts","Mumbai University","Mumbai",
        3,2010,900,50,25,true,true,false,false,"NAAC B+","English",
        80000.0,4.1f,"India",true);
        education5.displayDetails();

        Education education6 = new Education("Tech Innovation Institute","M.Tech","Postgraduate","IIT","Chennai",
        2,1980,2500,200,5,true,true,true,true,"NAAC A++","English",
        200000.0,4.8f,"India",true);
        education6.displayDetails();

        Education education7 = new Education("Sunrise Polytechnic","Diploma","Technical","State Board","Hyderabad",
        3,2008,1500,85,30,true,false,true,false,"AICTE","English",
        60000.0,4.0f,"India",false);
        education7.displayDetails();

        Education education8 = new Education("Modern Science College","B.Sc","Undergraduate","Calcutta University","Kolkata",
        3,2003,2200,110,18,true,true,true,true,"NAAC A","English",
        90000.0,4.2f,"India",true);
        education8.displayDetails();

        Education education9 = new Education("Future Tech University","PhD","Doctorate","Anna University","Chennai",
        3,1990,1000,300,7,true,true,true,true,"NAAC A++","English",
        300000.0,4.9f,"India",true);
        education9.displayDetails();

        Education education10 = new Education("Elite Commerce College","B.Com","Undergraduate","Osmania University","Hyderabad",
        3,2006,2500,130,20,true,false,true,true,"NAAC A","English",
        85000.0,4.3f,"India",false);
        education10.displayDetails();
    }
}

