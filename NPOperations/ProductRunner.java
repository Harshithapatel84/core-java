class ProductRunner{
	public static void main(String... values)
	{
		Product[] product=new Product[137];
		StoreProductDetail prDetail=new StoreProductDetail(product);
		
		Product item = new Product("Mixer",15-06-26,35000,"Ambhasutha",false,"MX154","china",
		ProductType.ELECTRIC_ITEMS,WarrantyYear.TWO);
		Product item1 = new Product("cloth",26,500,"Ajio",true,"Ajio45","india",
		ProductType.CLOTH,WarrantyYear.ONE);
		Product item2 = new Product("Friedge",18-02-26,75000,"Reliance",false,"GD267","india",
		ProductType.ELECTRIC_ITEMS,WarrantyYear.FOUR);
		Product item9= new Product("Footware",31,4000,"FootWareShop",true,"Puma34","china",
		ProductType.FOOTWARE,WarrantyYear.ONE);
		Product item3 = new Product("Furniture",28,350000,"Ambhasutha",false,"Fr34","india",
		ProductType.FURNITURE,WarrantyYear.THREE);
		Product item4 = new Product("Grinder",14-26,5000,"luxe live",false,"10","japan",
		ProductType.ELECTRIC_ITEMS,WarrantyYear.FOUR);
		Product item5 = new Product("accesseries",17,156000,"Kalyan",false,"22Kat","India",
		ProductType.JEWELLERY,WarrantyYear.FOUR);
		Product item6 = new Product("Tv",11-06-26,35000,"Ambhasutha",false,"nexon12","china",
		ProductType.ELECTRIC_ITEMS,WarrantyYear.TWO);
		Product item7 = new Product("PhotoFrame",25,35000,"Ambhasutha",false,"12","india",
		ProductType.ACCESSERIES,WarrantyYear.ONE);
		Product item8 = new Product("Air cooler",28-06-26,35000,"Ambhasutha",false,"A10","USA",
		ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		
		prDetail.save(item);
		prDetail.save(item1);
		prDetail.save(item2);
		prDetail.save(item3);
		prDetail.save(item4);
		prDetail.save(item5);
		prDetail.save(item6);
		prDetail.save(item7);
		prDetail.save(item8);
		prDetail.save(item9);
		
		Product item10 = new Product("Laptop",12-8-26,85000,"DellStore",false,"DL123","USA",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		Product item11 = new Product("Watch",21,12000,"Titan",true,"TT56","india",
        ProductType.ACCESSERIES,WarrantyYear.TWO);
		Product item12 = new Product("Sofa",30,95000,"HomeCenter",false,"SF89","india",
        ProductType.FURNITURE,WarrantyYear.FOUR);
		Product item13 = new Product("Headphones",05-07-26,4500,"Sony",false,"SN45","japan",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.TWO);
		Product item14 = new Product("Shoes",18,3000,"Nike",true,"NK77","vietnam",
        ProductType.FOOTWARE,WarrantyYear.ONE);
		Product item15 = new Product("Necklace",27,250000,"Tanishq",false,"TN99","india",
        ProductType.JEWELLERY,WarrantyYear.FOUR);
		Product item16 = new Product("Table",16,15000,"Ikea",false,"IK45","sweden",
        ProductType.FURNITURE,WarrantyYear.THREE);
		Product item17 = new Product("Mobile",9-9-26,65000,"Samsung",false,"SM88","korea",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.TWO);
		Product item18 = new Product("Bag",23,3500,"Wildcraft",true,"WC22","india",
        ProductType.ACCESSERIES,WarrantyYear.ONE);
		Product item19 = new Product("Ceiling Fan",19-05-26,4500,"Usha",false,"US90","india",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		
		Product item20 = new Product("Camera",10-10-26,55000,"CanonStore",false,"CN101","japan",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		Product item21 = new Product("T-shirt",14,1200,"Zudio",true,"ZD11","india",
        ProductType.CLOTH,WarrantyYear.ONE);
		Product item22 = new Product("Dining Table",22,45000,"UrbanLadder",false,"UL78","india",
        ProductType.FURNITURE,WarrantyYear.FOUR);
		Product item23 = new Product("Smart Watch",8-11-26,8000,"Noise",false,"NS44","india",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.TWO);
		Product item24 = new Product("Sandals",19,1800,"Bata",true,"BT55","india",
        ProductType.FOOTWARE,WarrantyYear.ONE);
		Product item25 = new Product("Bracelet",26,75000,"MalabarGold",false,"MG66","india",
        ProductType.JEWELLERY,WarrantyYear.THREE);
		Product item26 = new Product("Bookshelf",17,12000,"Ikea",false,"IK88","sweden",
        ProductType.FURNITURE,WarrantyYear.TWO);
		Product item27 = new Product("Tablet",06-12-26,30000,"Lenovo",false,"LN22","china",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		Product item28 = new Product("Handbag",24,5000,"Lavie",true,"LV33","india",
        ProductType.ACCESSERIES,WarrantyYear.ONE);
		Product item29 = new Product("Water Heater",15-01-26,9000,"Bajaj",false,"BJ99","india",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.FOUR);
		
		Product item30 = new Product("Rice",12,2500,"Aashirvaad",false,"RC10","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item31 = new Product("Wheat Flour",18,1800,"Pillsbury",false,"WF20","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item32 = new Product("Cooking Oil",9-04-26,2200,"Fortune",false,"FO33","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item33 = new Product("Sugar",21,900,"Madhur",false,"SG11","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item34 = new Product("Salt",15,300,"TataSalt",false,"TS01","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item35 = new Product("Laptop Bag",23,2500,"Skybags",true,"SB45","india",
        ProductType.ACCESSERIES,WarrantyYear.TWO);
		Product item36 = new Product("Microwave",11-03-26,12000,"LG",false,"LG77","korea",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		Product item37 = new Product("Curtains",27,3500,"HomeStop",false,"HS12","india",
        ProductType.FURNITURE,WarrantyYear.TWO);
		Product item38 = new Product("Jeans",19,2200,"Levis",true,"LV78","usa",
        ProductType.CLOTH,WarrantyYear.ONE);
		Product item39 = new Product("Gold Ring",25,95000,"KalyanJewellers",false,"KR55","india",
        ProductType.JEWELLERY,WarrantyYear.FOUR);
		
		Product item40 = new Product("Milk",05-02-26,60,"Nandini",false,"MK01","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item41 = new Product("Bread",12,40,"Britannia",false,"BR22","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item42 = new Product("Refrigerator",20-07-26,68000,"Whirlpool",false,"WP90","usa",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.FOUR);
		Product item43 = new Product("Jacket",16,4500,"Puma",true,"PM33","germany",
        ProductType.CLOTH,WarrantyYear.TWO);
		Product item44 = new Product("Office Chair",28,15000,"Featherlite",false,"FC88","india",
        ProductType.FURNITURE,WarrantyYear.THREE);
		Product item45 = new Product("Bluetooth Speaker",07-9-26,7000,"JBL",false,"JB11","usa",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.TWO);
		Product item46 = new Product("Slippers",19,600,"Relaxo",true,"RX77","india",
        ProductType.FOOTWARE,WarrantyYear.ONE);
		Product item47 = new Product("Earrings",24,35000,"GRT",false,"ER55","india",
        ProductType.JEWELLERY,WarrantyYear.THREE);
		Product item48 = new Product("Wall Clock",13,1200,"Ajanta",false,"AC10","india",
        ProductType.ACCESSERIES,WarrantyYear.TWO);
		Product item49 = new Product("Biscuits",8,120,"ParleG",false,"PG09","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		
		Product item50 = new Product("Eggs",06,180,"Suguna",false,"EG12","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item51 = new Product("Cheese",11,350,"Amul",false,"CH34","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item52 = new Product("Air Conditioner",03-05-26,45000,"Daikin",false,"DK56","japan",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.FOUR);
		Product item53 = new Product("Sweater",17,2800,"H&M",true,"HM21","sweden",
        ProductType.CLOTH,WarrantyYear.TWO);
		Product item54 = new Product("Study Table",29,20000,"Nilkamal",false,"NK44","india",
        ProductType.FURNITURE,WarrantyYear.THREE);
		Product item55 = new Product("Power Bank",02-8-26,2500,"Mi",false,"MI88","china",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.TWO);
		Product item56 = new Product("Boots",22,5000,"Woodland",true,"WD99","india",
        ProductType.FOOTWARE,WarrantyYear.TWO);
		Product item57 = new Product("Diamond Ring",26,150000,"Tanishq",false,"DR77","india",
        ProductType.JEWELLERY,WarrantyYear.FOUR);
		Product item58 = new Product("Sunglasses",15,3000,"RayBan",true,"RB66","italy",
        ProductType.ACCESSERIES,WarrantyYear.TWO);
		Product item59 = new Product("Tea Powder",9,500,"RedLabel",false,"TL10","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		
		Product item60 = new Product("Butter",07,250,"Amul",false,"BT12","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item61 = new Product("Honey",13,600,"Dabur",false,"HN45","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item62 = new Product("Washing Machine",04-06-26,30000,"IFB",false,"IF90","india",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.FOUR);
		Product item63 = new Product("Kurti",18,1500,"Biba",true,"BB23","india",
        ProductType.CLOTH,WarrantyYear.TWO);
		Product item64 = new Product("Bed",26,55000,"Sleepwell",false,"SW78","india",
        ProductType.FURNITURE,WarrantyYear.THREE);
		Product item65 = new Product("Mixer Grinder",01-07-26,7000,"Prestige",false,"PG56","india",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		Product item66 = new Product("Sneakers",21,4200,"Adidas",true,"AD12","germany",
        ProductType.FOOTWARE,WarrantyYear.TWO);
		Product item67 = new Product("Silver Chain",24,18000,"MalabarGold",false,"SC34","india",
        ProductType.JEWELLERY,WarrantyYear.THREE);
		Product item68 = new Product("Wallet",16,1500,"Fastrack",true,"FT88","india",
        ProductType.ACCESSERIES,WarrantyYear.ONE);
		Product item69 = new Product("Coffee Powder",10,700,"Bru",false,"CF22","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		
		Product item70 = new Product("Fan",15,3200,"Usha",false,"FN21","india",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.TWO);
		Product item71 = new Product("Blender",12,4500,"Philips",false,"BL55","netherlands",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		Product item72 = new Product("Dining Chair",20,8000,"UrbanLadder",false,"DC90","india",
        ProductType.FURNITURE,WarrantyYear.THREE);
		Product item73 = new Product("Formal Shirt",18,2200,"PeterEngland",true,"PS33","india",
        ProductType.CLOTH,WarrantyYear.ONE);
		Product item74 = new Product("Running Shoes",25,5000,"Reebok",true,"RB77","usa",
        ProductType.FOOTWARE,WarrantyYear.TWO);
		Product item75 = new Product("Gold Necklace",30,200000,"Tanishq",false,"GN88","india",
        ProductType.JEWELLERY,WarrantyYear.FOUR);
		Product item76 = new Product("Backpack",14,1800,"AmericanTourister",true,"AT12","usa",
        ProductType.ACCESSERIES,WarrantyYear.ONE);
		Product item77 = new Product("Rice Cooker",05-8-26,3500,"Panasonic",false,"RC44","japan",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		Product item78 = new Product("Tomato",11,120,"LocalMarket",false,"TM10","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item79 = new Product("Curtain Rod",22,900,"HomeCenter",false,"CR66","india",
        ProductType.FURNITURE,WarrantyYear.TWO);
		
		Product item80 = new Product("Air Purifier",9-9-26,12000,"Dyson",false,"AP11","uk",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		Product item81 = new Product("Notebook",13,200,"Classmate",false,"NB22","india",
        ProductType.ACCESSERIES,WarrantyYear.ONE);
		Product item82 = new Product("Sofa Set",27,85000,"Godrej",false,"SS55","india",
        ProductType.FURNITURE,WarrantyYear.FOUR);
		Product item83 = new Product("Hoodie",19,2500,"Zara",true,"HD77","spain",
        ProductType.CLOTH,WarrantyYear.TWO);
		Product item84 = new Product("Formal Shoes",23,4200,"Clarks",true,"FS90","uk",
        ProductType.FOOTWARE,WarrantyYear.TWO);
		Product item85 = new Product("Diamond Necklace",31,300000,"KalyanJewellers",false,"DN12","india",
        ProductType.JEWELLERY,WarrantyYear.FOUR);
		Product item86 = new Product("Travel Bag",17,3500,"VIP",true,"TB34","india",
        ProductType.ACCESSERIES,WarrantyYear.ONE);
		Product item87 = new Product("Induction Stove",06-10-26,2800,"Prestige",false,"IS78","india",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		Product item88 = new Product("Onion",12,60,"LocalVendor",false,"ON45","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item89 = new Product("Study Lamp",21,1500,"Syska",false,"SL99","india",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.TWO);
		
		Product item90 = new Product("Electric Kettle",14,1800,"Havells",false,"EK11","india",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.TWO);
		Product item91 = new Product("Toaster",18,2200,"MorphyRichards",false,"TS22","uk",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		Product item92 = new Product("Books",11,900,"SapnaBookHouse",false,"BK33","india",
        ProductType.ACCESSERIES,WarrantyYear.ONE);
		Product item93 = new Product("Wardrobe",26,65000,"Durian",false,"WD44","india",
        ProductType.FURNITURE,WarrantyYear.FOUR);
		Product item94 = new Product("Track Pants",20,1800,"Nike",true,"TP55","usa",
        ProductType.CLOTH,WarrantyYear.ONE);
		Product item95 = new Product("Loafers",23,3500,"Bata",true,"LF66","india",
        ProductType.FOOTWARE,WarrantyYear.TWO);
		Product item96 = new Product("Platinum Ring",29,120000,"Tanishq",false,"PR77","india",
        ProductType.JEWELLERY,WarrantyYear.FOUR);
		Product item97 = new Product("Cap",13,700,"Puma",true,"CP88","germany",
        ProductType.ACCESSERIES,WarrantyYear.ONE);
		Product item98 = new Product("Geyser",05-11-26,12000,"Bajaj",false,"GY99","india",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		Product item99 = new Product("Potato",10,40,"LocalMarket",false,"PT10","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item100 = new Product("Water Bottle",16,500,"Milton",false,"WB21","india",
        ProductType.ACCESSERIES,WarrantyYear.ONE);
		Product item101 = new Product("Iron Box",8-12-26,2500,"Philips",false,"IB32","netherlands",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.THREE);
		Product item102 = new Product("Bed Sheet",19,2200,"BombayDyeing",false,"BS43","india",
        ProductType.FURNITURE,WarrantyYear.TWO);
		Product item103 = new Product("Sweatshirt",21,2600,"Adidas",true,"SW54","germany",
        ProductType.CLOTH,WarrantyYear.TWO);
		Product item104 = new Product("Sandals Women",24,2000,"Metro",true,"SW65","india",
        ProductType.FOOTWARE,WarrantyYear.ONE);
		Product item105 = new Product("Silver Anklet",28,9000,"GRT",false,"SA76","india",
        ProductType.JEWELLERY,WarrantyYear.THREE);
		Product item106 = new Product("Laptop Stand",15,1200,"Portronics",false,"LS87","india",
        ProductType.ACCESSERIES,WarrantyYear.ONE);
		Product item107 = new Product("Rice Bag",12,3000,"IndiaGate",false,"RB98","india",
        ProductType.GROCERIES,WarrantyYear.ONE);
		Product item108 = new Product("Ceiling Light",07-01-26,1800,"Wipro",false,"CL09","india",
        ProductType.ELECTRIC_ITEMS,WarrantyYear.TWO);
		Product item109 = new Product("Office Desk",27,20000,"Godrej",false,"OD10","india",
        ProductType.FURNITURE,WarrantyYear.THREE);
		Product item110 = new Product("Silver Anklet",28,9000,"GRT",false,"SA76","india",
        ProductType.JEWELLERY,WarrantyYear.THREE);
		
		
		
		prDetail.save(item10);
		prDetail.save(item11);
		prDetail.save(item12);
		prDetail.save(item13);
		prDetail.save(item14);
		prDetail.save(item15);
		prDetail.save(item16);
		prDetail.save(item17);
		prDetail.save(item18);
		prDetail.save(item19);
		prDetail.save(item20);
		prDetail.save(item21);
		prDetail.save(item22);
		prDetail.save(item23);
		prDetail.save(item24);
		prDetail.save(item25);
		prDetail.save(item26);
		prDetail.save(item27);
		prDetail.save(item28);
		prDetail.save(item29);
		prDetail.save(item30);
		prDetail.save(item31);
		prDetail.save(item32);
		prDetail.save(item33);
		prDetail.save(item34);
		prDetail.save(item35);
		prDetail.save(item36);
		prDetail.save(item37);
		prDetail.save(item38);
		prDetail.save(item39);
		prDetail.save(item40);
		prDetail.save(item41);
		prDetail.save(item42);
		prDetail.save(item43);
		prDetail.save(item44);
		prDetail.save(item45);
		prDetail.save(item46);
		prDetail.save(item47);
		prDetail.save(item48);
		prDetail.save(item49);
		prDetail.save(item50);
		prDetail.save(item51);
		prDetail.save(item52);
		prDetail.save(item53);
		prDetail.save(item54);
		prDetail.save(item55);
		prDetail.save(item56);
		prDetail.save(item57);
		prDetail.save(item58);
		prDetail.save(item59);
		prDetail.save(item60);
		prDetail.save(item61);
		prDetail.save(item62);
		prDetail.save(item63);
		prDetail.save(item64);
		prDetail.save(item65);
		prDetail.save(item66);
		prDetail.save(item67);
		prDetail.save(item68);
		prDetail.save(item69);
		prDetail.save(item70);
		prDetail.save(item71);
		prDetail.save(item72);
		prDetail.save(item73);
		prDetail.save(item74);
		prDetail.save(item75);
		prDetail.save(item76);
		prDetail.save(item77);
		prDetail.save(item78);
		prDetail.save(item79);
		prDetail.save(item80);
		prDetail.save(item81);
		prDetail.save(item82);
		prDetail.save(item83);
		prDetail.save(item84);
		prDetail.save(item85);
		prDetail.save(item86);
		prDetail.save(item87);
		prDetail.save(item88);
		prDetail.save(item89);
		prDetail.save(item90);
		prDetail.save(item91);
		prDetail.save(item92);
		prDetail.save(item93);
		prDetail.save(item94);
		prDetail.save(item95);
		prDetail.save(item96);
		prDetail.save(item97);
		prDetail.save(item98);
		prDetail.save(item99);
		prDetail.save(item100);
		prDetail.save(item101);
		prDetail.save(item102);
		prDetail.save(item103);
		prDetail.save(item104);
		prDetail.save(item105);
		prDetail.save(item106);
		prDetail.save(item107);
		prDetail.save(item108);
		prDetail.save(item109);
		prDetail.save(item110);
		
		System.out.println("================================================");
		boolean searchId=prDetail.searchByUniqueID("Puma34") ;
		System.out.println(searchId);
		
		System.out.println("================================================");
		boolean searchIDName=prDetail.searchByIdAndName("BT55","Sandals");
		System.out.println(searchIDName);
		
		System.out.println("================================================");
		boolean idNameCountry=prDetail.searchByIDAndNameAndOriginCountry("PG09","Biscuits","india");
		System.out.println(idNameCountry);
		
		System.out.println("================================================");
		prDetail.getAllCountry();
		
		System.out.println("================================================");
		boolean expired = prDetail.checkWarrantyById("NK77");
		System.out.println(expired);
		
		System.out.println("================================================");
		boolean type = prDetail.getAllByType(ProductType.CLOTH);
        System.out.println(type);
		
		
		System.out.println("================================================");
		boolean year = prDetail.getAllByWarrantyYear(WarrantyYear.TWO);
		System.out.println(year);
	}
}