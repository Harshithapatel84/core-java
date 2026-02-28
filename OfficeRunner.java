class OfficeRunner {
    public static void main(String[] args) {

        Office office = new Office("Tech Solutions","Bangalore","IT",500,2010,5,true,true,true,true,
		"Ravi Kumar","Development",5000000.0,25000.5f,4.6f,"India",true,true,10,"Corporate");
        office.displayDetails();
		
		 Office office1 = new Office("Tech Solutions","Bangalore","IT",500,2010,5,true,true,true,true,
		 "Ravi Kumar","Development",5000000.0,25000.5,4.6f,"India",true,true,10,"Corporate");
        office1.displayDetails();

        Office office2 = new Office("Global Finance","Mumbai","Finance",300,2005,8,true,true,true,true,
		"Anil Mehta","Accounts",8000000.0,30000.0,4.4f,"India",true,false,12,"Commercial");
        office2.displayDetails();

        Office office3 = new Office("HealthCare Plus","Delhi","Medical",200,2012,4,true,true,false,true,
		"Dr Sharma","Operations",4500000.0,20000.0,4.5f,"India",true,true,6,"Hospital");
        office3.displayDetails();

        Office office4 = new Office("EduSmart","Chennai","Education",150,2015,3,true,false,true,true,
		"Lakshmi Rao","Training",2000000.0,15000.0,4.2f,"India",true,true,5,"Campus");
        office4.displayDetails();

        Office office5 = new Office("BuildRight","Hyderabad","Construction",400,2008,6,true,true,false,true,
		"Suresh Reddy","Engineering",6000000.0,28000.0,4.1f,"India",true,false,8,"Industrial");
         office5.displayDetails();

         Office office6 = new Office("RetailHub","Kolkata","Retail",250,2011,4,true,true,true,false,
		 "Priya Sen","Sales",3500000.0,22000.0,4.0f,"India",true,true,7,"Mall");
         office6.displayDetails();

        Office office7 = new Office("InnoSoft","Pune","Software",600,2018,9,true,true,true,true,
		"Arjun Patil","Research",9000000.0,35000.0,4.8f,"India",true,true,15,"Corporate");
        office7.displayDetails();

        Office office8 = new Office("GreenEnergy","Ahmedabad","Energy",180,2013,5,true,true,false,true,
		"Nikhil Shah","Production",4200000.0,24000.0,4.3f,"India",true,false,9,"Plant");
         office8.displayDetails();

         Office office9 = new Office("MediaWorks","Noida","Media",220,2016,4,true,false,true,true,
		 "Karan Malhotra","Creative",3800000.0,21000.0,4.5f,"India",true,true,6,"Studio");
        office9.displayDetails();
		
		 System.out.println("==========================================================================");
		  
		
		Lotion lotion1 = new Lotion("Daily Moisture Lotion",299.9,"Nivea",2,2025,2027,true,false,
        "Aloe Vera, Vitamin E","Liquid",0.50,"Mild Floral",true,true,400,"White",
        4.5,"Men & Women",true,"India");
        lotion1.lotionDetails();

        Lotion lotion2 = new Lotion("Cocoa Care",349.0,"Vaseline",1,2024,2026,true,true,
        "Cocoa Butter, Glycerin","Cream",0.45,"Cocoa",true,false,350,"Cream",
        4.4,"Dry Skin",true,"USA");
        lotion2.lotionDetails();

         Lotion lotion3 = new Lotion("Herbal Glow",275.5,"Himalaya",3,2025,2028,true,true,
        "Neem, Turmeric","Liquid",0.40,"Herbal",true,true,300,"Light Green",
        4.2,"All Skin",false,"India");
        lotion3.lotionDetails();

        Lotion lotion4 = new Lotion("Soft Touch",310.0,"Dove",2,2024,2027,true,false,
        "Milk Protein","Cream",0.48,"Soft Floral",false,true,450,"White",
        4.3,"Women",true,"UK");
         lotion4.lotionDetails();

         Lotion lotion5 = new Lotion("Ultra Repair",420.0,"L'Oreal",1,2025,2029,true,true,
        "Ceramide, Shea Butter","Cream",0.60,"Luxury",true,true,500,"Pearl",
        4.8,"Very Dry Skin",true,"France");
        lotion5.lotionDetails();

        Lotion lotion6 = new Lotion("Fresh Hydrate",260.0,"Ponds",2,2024,2026,true,false,
        "Vitamin B3","Liquid",0.42,"Fresh",false,true,380,"White",
        4.1,"Men & Women",false,"India");
         lotion6.lotionDetails();

Lotion lotion7 = new Lotion("Aloe Soft",230.0,"Patanjali",2,2025,2027,true,false,
        "Aloe Vera","Gel",0.35,"Natural",true,true,250,"Green",
        4.0,"Sensitive Skin",true,"India");
lotion7.lotionDetails();

Lotion lotion8 = new Lotion("Glow Care",390.0,"Lakme",1,2025,2028,true,true,
        "Saffron, Honey","Cream",0.55,"Sweet Floral",true,false,420,"Light Pink",
        4.6,"Women",true,"India");
lotion8.lotionDetails();

Lotion lotion9 = new Lotion("Daily Fresh",210.0,"Emami",3,2024,2026,true,false,
        "Menthol","Liquid",0.38,"Mint",false,false,300,"Blue",
        3.9,"Men",false,"India");
lotion9.lotionDetails();

Lotion lotion10 = new Lotion("Silk Smooth",450.0,"Matrix",1,2025,2030,true,true,
        "Argan Oil, Vitamin E","Cream",0.65,"Luxury Floral",true,true,550,"Gold",
        4.9,"All Skin",true,"USA");
lotion10.lotionDetails();
      
         System.out.println("==========================================================================");
		  
		Cell cell1 = new Cell("Neuron","Animal Cell","Human","Star-shaped","Transmit Signals",
		0.02,0.001,46,1,365,true,true,true,true,"No Cell Wall","Gel-like",37.0,95.5f,"Brain","Robert Hooke");
        cell1.displayDetails();

        Cell cell2 = new Cell("Red Blood Cell","Animal Cell","Human","Round","Carry Oxygen",
		0.01,0.0008,46,0,120,true,true,false,true,"No Cell Wall","Fluid",37.0,90.2f,"Blood","Karl Landsteiner");
        cell2.displayDetails();

        Cell cell3 = new Cell("White Blood Cell","Animal Cell","Human","Irregular","Fight Infection",
		0.015,0.0012,46,1,13,true,true,true,true,"No Cell Wall","Gel-like",37.0,92.0f,"Blood","Paul Ehrlich");
        cell3.displayDetails();

         Cell cell4 = new Cell("Muscle Cell","Animal Cell","Human","Long","Movement",
		 0.05,0.002,46,1,200,true,true,true,true,"No Cell Wall","Dense",37.0,88.5f,"Muscles","Antonie van Leeuwenhoek");
        cell4.displayDetails();

        Cell cell5 = new Cell("Skin Cell","Animal Cell","Human","Flat","Protection",
		0.03,0.0015,46,1,30,true,true,true,false,"No Cell Wall","Dry",37.0,85.0f,"Skin","Robert Hooke");
        cell5.displayDetails();

        Cell cell6 = new Cell("Plant Cell","Plant Cell","Plant","Rectangular","Photosynthesis",
		0.04,0.0025,20,1,300,true,true,true,true,"Cellulose","Thick",30.0,93.4f,"Leaf","Matthias Schleiden");
        cell6.displayDetails();

        Cell cell7 = new Cell("Bacteria","Prokaryotic","Bacteria","Rod","Reproduction",
		0.005,0.0003,1,0,2,false,true,true,true,"Peptidoglycan","Simple",25.0,80.0f,"Soil","Louis Pasteur");
        cell7.displayDetails();

        Cell cell8 = new Cell("Sperm Cell","Animal Cell","Human","Tail","Reproduction",
		0.02,0.0005,23,1,5,true,true,true,true,"No Cell Wall","Fluid",37.0,89.5f,"Reproductive System","Anton van Leeuwenhoek");
        cell8.displayDetails();

        Cell cell9 = new Cell("Egg Cell","Animal Cell","Human","Round","Reproduction",
		0.1,0.003,23,1,1,true,true,false,true,"No Cell Wall","Rich Cytoplasm",37.0,87.3f,"Ovary","Karl Ernst von Baer");
        cell9.displayDetails();

       Cell cell10 = new Cell("Stem Cell","Animal Cell","Human","Round","Cell Regeneration",
	   0.025,0.0011,46,1,200,true,true,true,true,"No Cell Wall","Gel-like",37.0,94.8f,"Bone Marrow","James Thomson");
       cell10.displayDetails();
    }
}