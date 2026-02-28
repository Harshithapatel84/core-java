class StandRunner{

public static void main(String[] args) {

        Stand stand = new Stand("Laptop Stand","Amazon Basics","Aluminium","Silver","Portable",
		"Office Use","Rectangular","ABC Industries","India",30,25,20,2,1499.99,1.2,4.6,0.8f,
		true,true, false);
        stand.displayInfo();
		
		Stand stand1 = new Stand("Laptop Stand","Amazon Basics","Aluminium","Silver","Portable",
        "Office Use","Rectangular","ABC Industries","India",30,25,20,2,1499.99,1.2,4.6,0.8f,
        true,true,false);
        stand1.displayInfo();

        Stand stand2 = new Stand("Monitor Stand","HP","Steel","Black","Adjustable",
        "Office Use","Square","TechWorld","USA",35,28,22,3,1999.50,1.8,4.7,1.0f,
        true,false,true);
        stand2.displayInfo();

        Stand stand3 = new Stand("Mobile Stand","Boat","Plastic","White","Foldable",
        "Home Use","Oval","GadgetPro","India",15,10,5,1,499.99,0.5,4.3,0.3f,
        false,true,false);
        stand3.displayInfo();

        Stand stand4 = new Stand("Tablet Stand","Samsung","Aluminium","Grey","Rotatable",
        "Office Use","Rectangular","SmartTech","Korea",20,15,8,2,999.00,0.9,4.5,0.6f,
        true,true,true);
        stand4.displayInfo();

         Stand stand5 = new Stand("TV Stand","Sony","Wood","Brown","Fixed",
        "Living Room","Rectangle","HomeDecors","Japan",120,45,60,5,7999.99,15.0,4.8,10.0f,
        false,false,true);
        stand5.displayInfo();

        Stand stand6 = new Stand("Speaker Stand","JBL","Metal","Black","Height Adjustable",
        "Studio Use","Round","SoundMax","Germany",40,30,90,4,2999.75,3.5,4.6,2.5f,
        true,true,false);
        stand6.displayInfo();

        Stand stand7 = new Stand("Book Stand","Classmate","Plastic","Blue","Portable",
        "Study Use","Triangle","EduTech","India",25,18,12,2,349.99,0.7,4.2,0.4f,
        false,true,false);
        stand7.displayInfo();

        Stand stand8 = new Stand("Camera Stand","Canon","Carbon Fiber","Black","Tripod",
        "Outdoor Use","Tripod","PhotoGear","USA",150,20,20,3,5999.99,2.0,4.9,1.8f,
        true,false,true);
        stand8.displayInfo();

        Stand stand9 = new Stand("Mic Stand","Shure","Steel","Silver","Adjustable",
        "Studio Use","Round","AudioTech","UK",45,20,100,4,2499.99,2.8,4.7,2.0f,
        true,true,true);
        stand9.displayInfo();
		
		System.out.println("=====================================================================");
		
        Map map = new Map("City Map","India","Karnataka","Bangalore","English","Digital","MapTech Pvt Ltd","Mercator",
            "1:50000",500,120,15,2025,250.7,4.8,12.9,77.6,2.1f,true,true);
        map.displayInfo();
		
		Map map1 = new Map("World Map","Earth","Global","New York","English","Printed","GeoWorld Ltd","Robinson",
        "1:1000000",1000,200,25,2024,500.5,5.2,40.7,74.0,3.5f,true,true);
        map1.displayInfo();

        Map map2 = new Map("Country Map","India","Maharashtra","Mumbai","Hindi","Digital","MapIndia Corp","Mercator",
        "1:75000",600,150,18,2023,300.2,4.5,19.0,72.8,2.8f,true,false);
        map2.displayInfo();

        Map map3 = new Map("State Map","USA","California","Los Angeles","English","Printed","StateMaps Inc","Lambert",
        "1:50000",450,110,12,2022,220.0,4.2,34.0,118.2,2.0f,false,true);
        map3.displayInfo();

        Map map4 = new Map("Tourist Map","France","Ile-de-France","Paris","French","Digital","EuroMaps","Transverse Mercator",
        "1:25000",300,90,10,2025,180.8,4.9,48.8,2.3,1.5f,true,true);
         map4.displayInfo();

        Map map5 = new Map("Metro Map","Japan","Tokyo","Tokyo","Japanese","Digital","Nippon Maps","Mercator",
        "1:20000",250,70,8,2024,150.6,4.7,35.6,139.7,1.2f,true,false);
        map5.displayInfo();

        Map map6 = new Map("Political Map","India","Delhi","New Delhi","English","Printed","Capital Maps","Robinson",
        "1:60000",400,100,14,2021,210.3,4.3,28.6,77.2,2.4f,false,true);
        map6.displayInfo();

        Map map7 = new Map("Physical Map","Brazil","Sao Paulo","Sao Paulo","Portuguese","Printed","GeoBrazil","Lambert",
        "1:85000",550,130,16,2020,260.9,4.1,23.5,46.6,2.9f,true,true);
        map7.displayInfo();

        Map map8 = new Map("Road Map","UK","England","London","English","Digital","BritMaps","Transverse Mercator",
        "1:40000",350,95,11,2023,190.4,4.6,51.5,0.1,1.8f,true,false);
        map8.displayInfo();

        Map map9 = new Map("Regional Map","Australia","Victoria","Melbourne","English","Printed","AussieMaps","Mercator",
        "1:70000",480,115,13,2022,230.7,4.4,37.8,144.9,2.6f,false,true);
        map9.displayInfo();
		
		System.out.println("=====================================================================");
		
		Toxic toxic = new Toxic("Sulfuric Acid","H2SO4","Industrial Chemical","Colorless","Odorless",
                      "ChemTech Industries","Cool & Dry Place","High","Skin Contact",9,36,2024,5,
                        50.0,337.0,10.0,1.84,98.5f,false,true,true);
        toxic.displayInfo();
		
		Toxic toxic1 = new Toxic("Nitric Acid","HNO3","Industrial Chemical","Colorless","Sharp Odor",
        "LabChem Pvt Ltd","Cool Place","High","Inhalation",8,24,2023,4,
        45.0,83.0,-42.0,1.51,96.5f,false,true,true);
        toxic1.displayInfo();

        Toxic toxic2 = new Toxic("Hydrochloric Acid","HCl","Industrial Chemical","Colorless","Pungent",
        "ChemCore Ltd","Dry Area","High","Skin Contact",7,30,2022,4,
        40.0,-85.0,-114.0,1.18,99.0f,false,true,true);
        toxic2.displayInfo();

        Toxic toxic3 = new Toxic("Ammonia","NH3","Gas","Colorless","Strong Odor",
        "GasTech Corp","Pressurized Tank","Medium","Inhalation",6,18,2024,3,
        35.0,-33.0,-78.0,0.73,92.0f,true,false,true);
        toxic3.displayInfo();

        Toxic toxic4 = new Toxic("Benzene","C6H6","Organic Compound","Colorless","Sweet Odor",
        "PetroChem Inc","Cool & Ventilated","High","Inhalation",9,20,2021,5,
        30.0,80.1,5.5,0.87,97.8f,true,false,true);
        toxic4.displayInfo();

        Toxic toxic5 = new Toxic("Chlorine","Cl2","Gas","Greenish","Strong Odor",
        "AquaPure Ltd","Cylindrical Tank","High","Inhalation",8,12,2023,4,
        25.0,-34.0,-101.0,3.21,95.0f,false,true,true);
        toxic5.displayInfo();

        Toxic toxic6 = new Toxic("Formaldehyde","CH2O","Preservative","Colorless","Pungent",
        "BioSafe Labs","Sealed Container","Medium","Skin Contact",7,15,2022,3,
        28.0,-19.0,-92.0,0.82,90.5f,true,true,false);
        toxic6.displayInfo();

        Toxic toxic7 = new Toxic("Mercury","Hg","Heavy Metal","Silver","Odorless",
        "MetalWorks","Room Temperature","High","Skin Contact",10,60,2020,5,
        15.0,356.7,-38.8,13.53,99.9f,false,false,true);
        toxic7.displayInfo();

        Toxic toxic8 = new Toxic("Carbon Monoxide","CO","Gas","Colorless","Odorless",
        "AirChem","Compressed Cylinder","High","Inhalation",9,10,2024,4,
        20.0,-191.5,-205.0,1.25,98.0f,true,false,true);
        toxic8.displayInfo();

        Toxic toxic9 = new Toxic("Sodium Hydroxide","NaOH","Industrial Chemical","White","Odorless",
        "AlkaliCorp","Dry Container","High","Skin Contact",8,36,2023,4,
        32.0,1388.0,318.0,2.13,97.0f,false,true,true);
        toxic9.displayInfo();
		
		System.out.println("=====================================================================");
		
		Trophy trophy = new Trophy("Championship Trophy","State Cricket League","Rahul",
        "Sports","Metal","Golden","Cup","ABC Trophies","India",
        2025,45,5,2,4999.8,4.9,20.5,1.5f,true,true,true);
        trophy.displayInfo();
		
		Trophy trophy1 = new Trophy("Championship Trophy","State Cricket League","Rahul",
        "Sports","Metal","Golden","Cup","ABC Trophies","India",
        2025,45,5,2,4999.8,4.9,20.5,1.5f,true,true,true);
        trophy1.displayInfo();

        Trophy trophy2 = new Trophy("Winner Trophy","National Football Cup","Arjun",
        "Sports","Steel","Silver","Shield","Star Awards","USA",
        2024,40,4,1,3999.5,4.7,18.0,1.2f,true,false,true);
        trophy2.displayInfo();

        Trophy trophy3 = new Trophy("Best Player Trophy","District Kabaddi","Vikram",
        "Sports","Fiber","Bronze","Statue","Victory Makers","India",
        2023,35,3,1,2999.9,4.5,16.5,1.0f,false,true,false);
        trophy3.displayInfo();

        Trophy trophy4 = new Trophy("Excellence Award","School Annual Day","Sneha",
        "Education","Crystal","Transparent","Star","Bright Trophies","UK",
        2025,30,2,1,1999.0,4.8,14.0,0.9f,true,true,false);
        trophy4.displayInfo();

        Trophy trophy5 = new Trophy("Champion Cup","State Hockey League","Rohit",
        "Sports","Metal","Golden","Cup","Elite Awards","Canada",
        2022,50,6,3,5999.5,4.6,22.0,1.8f,true,true,true);
        trophy5.displayInfo();

        Trophy trophy6 = new Trophy("Achievement Trophy","Corporate Event","Anita",
        "Corporate","Glass","Blue","Tower","Corporate Gifts","Germany",
        2024,28,2,1,2499.5,4.4,15.0,1.1f,false,true,false);
        trophy6.displayInfo();

        Trophy trophy7 = new Trophy("Runner Up Trophy","College Fest","Kiran",
        "Cultural","Wood","Brown","Shield","Campus Awards","India",
        2023,32,3,1,1799.9,4.3,17.5,1.3f,true,false,false);
        trophy7.displayInfo();

        Trophy trophy8 = new Trophy("Gold Medal Trophy","Olympiad","Meera",
        "Academic","Metal","Gold","Medal","Scholars Hub","Japan",
        2025,20,1,1,1499.0,4.9,12.0,0.7f,true,true,true);
        trophy8.displayInfo();

        Trophy trophy9 = new Trophy("Sportsmanship Trophy","Inter School Meet","Aditya",
        "Sports","Alloy","Silver","Cup","FairPlay Awards","Australia",
        2024,38,4,2,3499.5,4.6,19.0,1.4f,true,false,true);
        trophy9.displayInfo();
		
		System.out.println("=====================================================================");
		
		DumbBell dumbBell = new DumbBell("PowerLift Pro","Cast Iron","Black",
        "Rubber Grip","Hex","Powder Coated","FitEquip","India",
        "Gym","DLX-2025",20,6,2,150,2499.5,50.0,35.5,2.5f,true,true);
		dumbBell.displayDetail();
		
		DumbBell dumbBell1 = new DumbBell("PowerLift Pro","Cast Iron","Black",
        "Rubber Grip","Hex","Powder Coated","FitEquip","India",
        "Gym","DLX-2025",
        20,6,2,150,
        2499.5,50.0,35.5,
        2.5f,true,true);
        dumbBell1.displayDetail();

        DumbBell dumbBell2 = new DumbBell("IronFlex","Steel","Silver",
        "Foam Grip","Round","Chrome","StrongBody","USA",
        "Home","IF-100",
        15,4,1,200,
        1999.0,40.0,30.0,
        2.0f,false,true);
        dumbBell2.displayDetail();

         DumbBell dumbBell3 = new DumbBell("MuscleMax","Rubber","Red",
        "Textured Grip","Hex","Rubber Coated","GymPro","Germany",
        "Gym","MM-500",
        25,8,3,100,
        3499.9,60.0,38.0,
        3.0f,true,true);
        dumbBell3.displayDetail();

         DumbBell dumbBell4 = new DumbBell("FitStrong","Iron","Blue",
        "Knurled Grip","Round","Matte","HealthCorp","UK",
        "Home","FS-200",
        10,2,1,250,
        1499.5,30.0,28.0,
        1.8f,false,false);
        dumbBell4.displayDetail();

        DumbBell dumbBell5 = new DumbBell("TitanLift","Steel","Grey",
        "Rubber Grip","Hex","Powder Coated","TitanWorks","Canada",
        "Gym","TL-900",
        30,10,5,80,
        4999.0,80.0,40.0,
        3.5f,true,true);
        dumbBell5.displayDetail();

        DumbBell dumbBell6 = new DumbBell("FlexiFit","PVC","Green",
        "Foam Grip","Round","Plastic","WellnessCo","India",
        "Home","FF-50",
        5,2,1,300,
        899.9,15.0,20.0,
        1.5f,false,false);
        dumbBell6.displayDetail();

        DumbBell dumbBell7 = new DumbBell("BeastMode","Cast Iron","Black",
        "Knurled Grip","Hex","Powder Coated","BeastGear","Australia",
        "Gym","BM-700",
        35,12,4,60,
        5999.5,90.0,42.0,
        3.8f,true,true);
        dumbBell7.displayDetail();

        DumbBell dumbBell8 = new DumbBell("CorePower","Steel","White",
        "Rubber Grip","Round","Chrome","CoreFit","Japan",
        "Home","CP-300",
        12,4,2,180,
        1799.0,35.0,29.5,
        2.2f,false,true);
        dumbBell8.displayDetail();

        DumbBell dumbBell9 = new DumbBell("UltraLift","Iron","Gold",
        "Textured Grip","Hex","Glossy","UltraSports","Italy",
        "Gym","UL-1000",
        40,14,6,40,
        6999.9,100.0,45.0,
        4.0f,true,true);
       dumbBell9.displayDetail();
    }
}
    



