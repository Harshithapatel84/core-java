class ShampooRunner{
	public static void main(String[] args)
	{
		Shampoo shampoo=new Shampoo("Anti hairfall shampoo",349.9,"Dove",2,2025,2027,true,true,"keratin,aloevera,vitamin E",
		"liquid",0.50,"mold floral",true,true,650,"white",4.5,"men & women",true,"india");
		shampoo.shampooDetails();
		
		Shampoo shampoo1=new Shampoo("Anti Hairfall Shampoo",349.9,"Dove",2,2025,2027,true,true,"Keratin,Aloe Vera,Vitamin E",
        "Liquid",0.50,"Mild Floral",true,true,650,"White",4.5,"Men & Women",true,"India");
        shampoo1.shampooDetails();

        Shampoo shampoo2=new Shampoo("Smooth & Shine",299.5,"Pantene",1,2024,2026,false,true,"Pro-V Formula,Argan Oil",
        "Liquid",0.45,"Fresh Blossom",true,false,600,"Cream",4.3,"Women",true,"USA");
        shampoo2.shampooDetails();

        Shampoo shampoo3=new Shampoo("Strong Roots",399.0,"Clinic Plus",3,2025,2028,true,false,"Milk Protein,Vitamin B5",
        "Liquid",0.55,"Soft Floral",false,true,700,"White",4.2,"Family",false,"India");
        shampoo3.shampooDetails();

        Shampoo shampoo4=new Shampoo("Total Repair",420.0,"L'Oreal",1,2025,2027,false,true,"Ceramide,Protein Complex",
        "Liquid",0.48,"Rose Fresh",true,true,650,"Pearl White",4.6,"Men & Women",true,"France");
        shampoo4.shampooDetails();

        Shampoo shampoo5=new Shampoo("Herbal Care",275.0,"Himalaya",2,2024,2026,true,true,"Neem,Amla,Hibiscus",
        "Liquid",0.40,"Herbal",true,true,500,"Green",4.4,"All Hair Types",true,"India");
        shampoo5.shampooDetails();

        Shampoo shampoo6=new Shampoo("Cool Menthol",310.0,"Head & Shoulders",2,2025,2027,false,true,"Menthol,Zinc",
        "Liquid",0.52,"Mint Fresh",false,false,650,"Blue",4.1,"Men",true,"USA");
        shampoo6.shampooDetails();

        Shampoo shampoo7=new Shampoo("Damage Control",380.0,"Tresemme",1,2025,2028,true,false,"Keratin,Collagen",
        "Liquid",0.60,"Salon Fresh",true,false,750,"Black",4.5,"Women",true,"UK");
        shampoo7.shampooDetails();

        Shampoo shampoo8=new Shampoo("Silky Smooth",260.0,"Sunsilk",2,2024,2026,false,true,"Egg Protein,Vitamin E",
        "Liquid",0.42,"Sweet Floral",false,true,550,"Pink",4.0,"Girls",false,"India");
        shampoo8.shampooDetails();

         Shampoo shampoo9=new Shampoo("Ultra Moisture",450.0,"Matrix",1,2025,2029,true,false,"Shea Butter,Argan Oil",
        "Liquid",0.65,"Luxury Floral",true,true,800,"Gold",4.8,"Dry Hair",true,"USA");
        shampoo9.shampooDetails();
		
		System.out.println("==========================================================================");
		
		Diabetes diabetes1 = new Diabetes("Rahul",45,"Male",180.5,7.8,"Type 2",2020,78.5,170.2,"Dr Mehta",
		"Apollo","Metformin",500,false,true,true,true,true,27.1f,"India");
        diabetes1.displayDetails();

        Diabetes diabetes2 = new Diabetes("Anita",38,"Female",165.2,7.1,"Type 2",2019,65.0,160.5,"Dr Sharma",
		"Fortis","Insulin",20,true,false,true,true,false,25.3f,"India");
        diabetes2.displayDetails();

        Diabetes diabetes3 = new Diabetes("Ramesh",50,"Male",210.0,8.5,"Type 1",2015,82.3,172.0,"Dr Rao",
		"Manipal","Insulin",30,true,true,false,false,true,28.0f,"India");
        diabetes3.displayDetails();

        Diabetes diabetes4 = new Diabetes("Sneha",29,"Female",150.4,6.9,"Type 2",2021,58.2,158.4,"Dr Patel",
		"CityCare","Metformin",500,false,false,true,true,true,23.2f,"India");
        diabetes4.displayDetails();

        Diabetes diabetes5 = new Diabetes("Vikram",60,"Male",190.7,8.0,"Type 2",2010,85.6,168.3,"Dr Gupta",
		"Max","Glimepiride",2,false,true,false,false,false,30.1f,"India");
        diabetes5.displayDetails();

        Diabetes diabetes6 = new Diabetes("Kavya",42,"Female",175.3,7.5,"Type 2",2018,70.4,162.7,"Dr Iyer",
		"Apollo","Metformin",850,false,true,true,false,true,26.6f,"India");
        diabetes6.displayDetails();

        Diabetes diabetes7 = new Diabetes("Arjun",34,"Male",140.8,6.5,"Type 2",2022,75.0,175.0,"Dr Khan",
		"Fortis","Metformin",500,false,false,true,true,true,24.5f,"India");
        diabetes7.displayDetails();

        Diabetes diabetes8 = new Diabetes("Meera",55,"Female",200.1,8.2,"Type 1",2012,68.9,159.8,"Dr Nair",
		"Aster","Insulin",25,true,true,false,true,false,27.0f,"India");
        diabetes8.displayDetails();

        Diabetes diabetes9 = new Diabetes("Suresh",48,"Male",185.9,7.9,"Type 2",2016,80.2,171.4,"Dr Reddy"
		,"Care","Metformin",1000,false,true,true,false,true,27.4f,"India");
        diabetes9.displayDetails();

        Diabetes diabetes10 = new Diabetes("Pooja",36,"Female",160.0,7.0,"Type 2",2023,62.5,165.3,"Dr Verma",
		"Columbia","Metformin",500,false,false,true,true,true,22.9f,"India");
        diabetes10.displayDetails();
		
		System.out.println("==========================================================================");
		
		Conditioner conditioner1 = new Conditioner("Smooth Care",299.9,"Dove",2,2025,2027,true,true,"Keratin,Argan Oil",
        "Cream",0.40,"Mild Floral",true,true,600,"White",4.5,"Men & Women",true,"India");
         conditioner1.conditionerDetails();

        Conditioner conditioner2 = new Conditioner("Silky Shine",279.5,"Pantene",1,2024,2026,false,true,"Pro-V,Vitamin E",
        "Cream",0.35,"Fresh Blossom",true,false,550,"Cream",4.3,"Women",true,"USA");
         conditioner2.conditionerDetails();

        Conditioner conditioner3 = new Conditioner("Strong Roots",350.0,"Clinic Plus",3,2025,2028,true,false,"Milk Protein,Biotin",
        "Cream",0.45,"Soft Floral",false,true,650,"White",4.2,"Family",false,"India");
        conditioner3.conditionerDetails();

        Conditioner conditioner4 = new Conditioner("Total Repair",420.0,"L'Oreal",1,2025,2027,false,true,"Ceramide,Protein Complex",
        "Cream",0.50,"Rose Fresh",true,true,700,"Pearl White",4.6,"Men & Women",true,"France");
        conditioner4.conditionerDetails();

        Conditioner conditioner5 = new Conditioner("Herbal Smooth",260.0,"Himalaya",2,2024,2026,true,true,"Aloe Vera,Neem",
        "Cream",0.38,"Herbal",true,true,500,"Green",4.4,"All Hair Types",true,"India");
         conditioner5.conditionerDetails();

        Conditioner conditioner6 = new Conditioner("Cool Mint",310.0,"Head & Shoulders",2,2025,2027,false,true,"Menthol,Zinc",
        "Cream",0.42,"Mint Fresh",false,false,620,"Blue",4.1,"Men",true,"USA");
        conditioner6.conditionerDetails();

        Conditioner conditioner7 = new Conditioner("Damage Control",380.0,"Tresemme",1,2025,2028,true,false,"Keratin,Collagen",
        "Cream",0.55,"Salon Fresh",true,false,750,"Black",4.5,"Women",true,"UK");
        conditioner7.conditionerDetails();

        Conditioner conditioner8 = new Conditioner("Soft & Smooth",240.0,"Sunsilk",2,2024,2026,false,true,"Egg Protein,Vitamin B5",
        "Cream",0.36,"Sweet Floral",false,true,540,"Pink",4.0,"Girls",false,"India");
        conditioner8.conditionerDetails();

        Conditioner conditioner9 = new Conditioner("Ultra Moisture",450.0,"Matrix",1,2025,2029,true,false,"Shea Butter,Argan Oil",
        "Cream",0.60,"Luxury Floral",true,true,800,"Gold",4.8,"Dry Hair",true,"USA");
        conditioner9.conditionerDetails();

        Conditioner conditioner10 = new Conditioner("Daily Care",220.0,"Patanjali",2,2024,2026,true,true,"Amla,Shikakai",
        "Cream",0.33,"Natural",true,true,500,"White",4.2,"Men & Women",false,"India");
         conditioner10.conditionerDetails();
		 
		 System.out.println("==========================================================================");
		
		 
		 Brain brain1 = new Brain("Human Brain",1.4,"Left & Right Hemisphere",25,860000000,120,true,true,
        "Cognitive","Skull",20.5,"Left",true,true,120,"Grey",
        85.5,"Nervous System",true,"Human");
        brain1.displayDetails();

Brain brain2 = new Brain("Student Brain",1.3,"Balanced",20,750000000,110,true,true,
        "Learning","Skull",18.0,"Right",true,true,115,"Grey",
        80.0,"Central Nervous System",true,"Human");
brain2.displayDetails();

Brain brain3 = new Brain("Scientist Brain",1.5,"Dominant Left",40,900000000,140,true,true,
        "Analytical","Skull",22.0,"Left",true,true,130,"Grey",
        90.5,"Nervous System",true,"Human");
brain3.displayDetails();

Brain brain4 = new Brain("Artist Brain",1.35,"Dominant Right",30,820000000,115,true,true,
        "Creative","Skull",19.5,"Right",true,false,118,"Grey",
        88.0,"Nervous System",true,"Human");
brain4.displayDetails();

Brain brain5 = new Brain("Child Brain",1.1,"Developing",10,600000000,100,true,true,
        "Growth","Skull",15.0,"Balanced",false,false,105,"Light Grey",
        75.0,"Central System",true,"Human");
brain5.displayDetails();

Brain brain6 = new Brain("Athlete Brain",1.45,"Balanced",28,850000000,115,true,true,
        "Reflex","Skull",21.0,"Balanced",true,true,140,"Grey",
        92.0,"Nervous System",true,"Human");
brain6.displayDetails();

Brain brain7 = new Brain("Engineer Brain",1.38,"Left Dominant",35,870000000,130,true,true,
        "Logical","Skull",20.0,"Left",true,true,125,"Grey",
        89.0,"Central Nervous System",true,"Human");
brain7.displayDetails();

Brain brain8 = new Brain("Doctor Brain",1.42,"Balanced",45,880000000,135,true,true,
        "Medical","Skull",23.0,"Left",true,true,128,"Grey",
        91.0,"Nervous System",true,"Human");
brain8.displayDetails();

Brain brain9 = new Brain("Writer Brain",1.36,"Right Dominant",33,810000000,118,true,true,
        "Creative","Skull",18.5,"Right",true,true,117,"Grey",
        87.5,"Central System",true,"Human");
brain9.displayDetails();

Brain brain10 = new Brain("Research Brain",1.48,"Left Dominant",50,920000000,145,true,true,
        "Scientific","Skull",24.0,"Left",true,true,132,"Grey",
        95.0,"Nervous System",true,"Human");
brain10.displayDetails();

          System.out.println("==========================================================================");
		  
		  Organ organ1 = new Organ("Heart","Chest","Pump Blood","Red","Cone",0.30,12.0,2000000,30,95,
		  true,true,true,true,"All","Circulatory",5.5,98.5f,"Center Chest","Human");
         organ1.displayDetails();

        Organ organ2 = new Organ("Lungs","Chest","Breathing","Pink","Spongy",1.10,25.0,3000000,28,92,
		true,true,true,true,"All","Respiratory",6.2,96.3f,"Upper Chest","Human");
        organ2.displayDetails();

        Organ organ3 = new Organ("Liver","Abdomen","Detoxification","Dark Red","Triangular",1.50,20.0,2500000,35,90,true,true,true,false,"All","Digestive",4.8,94.0f,"Right Abdomen","Human");
        organ3.displayDetails();

        Organ organ4 = new Organ("Kidney","Lower Back","Filter Blood","Brown","Bean",0.25,10.0,1800000,32,93,
		true,true,true,false,"All","Excretory",3.5,95.5f,"Back","Human");
        organ4.displayDetails();

        Organ organ5 = new Organ("Brain","Head","Control Body","Grey","Oval",1.40,18.0,860000000,25,98,
		true,false,true,true,"All","Nervous",7.0,99.0f,"Skull","Human");
        organ5.displayDetails();

        Organ organ6 = new Organ("Stomach","Abdomen","Digest Food","Pink","J-Shaped",0.50,15.0,1500000,29,88,
		false,true,false,true,"All","Digestive",2.5,90.2f,"Upper Abdomen","Human");
        organ6.displayDetails();

        Organ organ7 = new Organ("Pancreas","Abdomen","Produce Insulin","Yellow","Leaf",0.10,14.0,1200000,31,87,
        false,true,false,false,"All","Endocrine",2.0,89.5f,"Behind Stomach","Human");
        organ7.displayDetails();

         Organ organ8 = new Organ("Spleen","Left Abdomen","Filter Blood","Purple","Oval",0.15,11.0,900000,33,85,
        false,false,false,false,"All","Immune",1.8,88.0f,"Left Abdomen","Human");
        organ8.displayDetails();

         Organ organ9 = new Organ("Intestine","Abdomen","Absorb Nutrients","Pink","Tube",1.80,600.0,4000000,27,91,
		 false,false,false,true,"All","Digestive",3.0,93.4f,"Abdomen","Human");
         organ9.displayDetails();

        Organ organ10 = new Organ("Eye","Face","Vision","Black","Round",0.02,2.5,500000,24,97,
		false,false,true,true,"All","Sensory",1.2,97.8f,"Face","Human");
        organ10.displayDetails();
	}
}

