package com.xworkz.space.runner;

import com.xworkz.space.dto.SpaceProbeDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpaceProbeRunner {
    public static void main(String[] args) {
        List<SpaceProbeDTO> spaceProbeDTOS = new ArrayList<>();

        spaceProbeDTOS.add(new SpaceProbeDTO("SP-001", "Voyager 1", "Jupiter", "NASA", 825.0, LocalDateTime.of(1977, 9, 5, 12, 0), LocalDateTime.of(1979, 3, 5, 10, 30), "Chemical", 470.5, "X-Band", 24000000000.0, 17.0, "Imaging Camera", "Magnetometer", 18000, true, "Active", 35.5, "Interstellar"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-002", "Voyager 2", "Neptune", "NASA", 825.0, LocalDateTime.of(1977, 8, 20, 11, 0), LocalDateTime.of(1989, 8, 25, 9, 45), "Chemical", 468.0, "X-Band", 20000000000.0, 15.5, "Spectrometer", "Camera", 17500, true, "Active", 33.2, "Gravity Assist"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-003", "Cassini", "Saturn", "NASA/ESA", 5600.0, LocalDateTime.of(1997, 10, 15, 4, 30), LocalDateTime.of(2004, 7, 1, 8, 0), "Chemical", 885.0, "Ka-Band", 1500000000.0, 19.2, "Radar", "Infrared Spectrometer", 7300, false, "Completed", 0.0, "Saturn Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-004", "Juno", "Jupiter", "NASA", 3625.0, LocalDateTime.of(2011, 8, 5, 16, 25), LocalDateTime.of(2016, 7, 5, 3, 20), "Solar Electric", 500.0, "X-Band", 800000000.0, 20.0, "Microwave Radiometer", "Magnetometer", 6000, true, "Active", 42.5, "Polar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-005", "New Horizons", "Pluto", "NASA", 478.0, LocalDateTime.of(2006, 1, 19, 14, 0), LocalDateTime.of(2015, 7, 14, 11, 49), "Chemical", 240.0, "X-Band", 7600000000.0, 16.2, "LORRI", "REX", 7000, true, "Extended Mission", 25.0, "Kuiper Belt"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-006", "Chandrayaan-1", "Moon", "ISRO", 1380.0, LocalDateTime.of(2008, 10, 22, 6, 22), LocalDateTime.of(2008, 11, 8, 18, 30), "Chemical", 700.0, "S-Band", 384400.0, 1.6, "Terrain Mapper", "Moon Impact Probe", 312, false, "Completed", 0.0, "Lunar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-007", "Chandrayaan-2", "Moon", "ISRO", 3850.0, LocalDateTime.of(2019, 7, 22, 14, 43), LocalDateTime.of(2019, 8, 20, 9, 15), "Chemical", 1000.0, "S-Band", 384400.0, 1.6, "Orbiter Camera", "Imaging IR Spectrometer", 3650, true, "Active", 65.0, "Lunar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-008", "Chandrayaan-3", "Moon", "ISRO", 3900.0, LocalDateTime.of(2023, 7, 14, 14, 35), LocalDateTime.of(2023, 8, 23, 18, 4), "Chemical", 1050.0, "S-Band", 384400.0, 1.6, "LIBS", "APXS", 365, true, "Active", 72.0, "Lunar Surface"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-009", "Mars Orbiter Mission", "Mars", "ISRO", 1337.0, LocalDateTime.of(2013, 11, 5, 14, 38), LocalDateTime.of(2014, 9, 24, 8, 0), "Chemical", 840.0, "S-Band", 225000000.0, 24.1, "Methane Sensor", "Camera", 2800, false, "Completed", 0.0, "Mars Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-010", "Perseverance", "Mars", "NASA", 1025.0, LocalDateTime.of(2020, 7, 30, 11, 50), LocalDateTime.of(2021, 2, 18, 20, 55), "Nuclear", 1100.0, "X-Band", 225000000.0, 5.4, "SuperCam", "Mastcam-Z", 5000, true, "Active", 85.0, "Jezero Crater"));spaceProbeDTOS.add(new SpaceProbeDTO("SP-011", "Curiosity", "Mars", "NASA", 899.0, LocalDateTime.of(2011, 11, 26, 15, 2), LocalDateTime.of(2012, 8, 6, 5, 17), "Nuclear", 1200.0, "X-Band", 225000000.0, 5.8, "ChemCam", "MAHLI", 5200, true, "Active", 78.6, "Gale Crater"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-012", "Spirit", "Mars", "NASA", 185.0, LocalDateTime.of(2003, 6, 10, 17, 58), LocalDateTime.of(2004, 1, 4, 4, 35), "Solar", 900.0, "UHF", 225000000.0, 4.5, "Panoramic Camera", "Mini-TES", 2210, false, "Completed", 0.0, "Columbia Hills"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-013", "Opportunity", "Mars", "NASA", 185.0, LocalDateTime.of(2003, 7, 7, 3, 18), LocalDateTime.of(2004, 1, 25, 5, 5), "Solar", 900.0, "UHF", 225000000.0, 4.8, "Microscopic Imager", "Alpha Spectrometer", 5352, false, "Completed", 0.0, "Meridiani Planum"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-014", "Messenger", "Mercury", "NASA", 1107.0, LocalDateTime.of(2004, 8, 3, 6, 15), LocalDateTime.of(2011, 3, 18, 1, 10), "Chemical", 640.0, "X-Band", 91690000.0, 8.2, "Mercury Laser Altimeter", "Gamma Ray Spectrometer", 4045, false, "Completed", 0.0, "Mercury Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-015", "BepiColombo", "Mercury", "ESA/JAXA", 4100.0, LocalDateTime.of(2018, 10, 20, 1, 45), LocalDateTime.of(2025, 12, 5, 10, 0), "Ion", 950.0, "Ka-Band", 92000000.0, 7.6, "Laser Altimeter", "Magnetometer", 3650, true, "Cruising", 84.0, "Mercury Transfer"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-016", "Akatsuki", "Venus", "JAXA", 500.0, LocalDateTime.of(2010, 5, 21, 22, 58), LocalDateTime.of(2015, 12, 7, 8, 51), "Chemical", 700.0, "X-Band", 41000000.0, 6.4, "Infrared Camera", "Ultraviolet Imager", 6200, true, "Active", 40.2, "Venus Elliptical Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-017", "Magellan", "Venus", "NASA", 1035.0, LocalDateTime.of(1989, 5, 4, 18, 47), LocalDateTime.of(1990, 8, 10, 13, 30), "Chemical", 900.0, "S-Band", 41000000.0, 7.2, "Synthetic Aperture Radar", "Altimeter", 1600, false, "Completed", 0.0, "Venus Mapping Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-018", "Venera-9", "Venus", "Soviet Union", 4936.0, LocalDateTime.of(1975, 6, 8, 12, 39), LocalDateTime.of(1975, 10, 22, 5, 13), "Chemical", 850.0, "VHF", 41000000.0, 7.1, "Panorama Camera", "Pressure Sensor", 136, false, "Completed", 0.0, "Venus Descent"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-019", "Pioneer 10", "Jupiter", "NASA", 258.0, LocalDateTime.of(1972, 3, 3, 1, 49), LocalDateTime.of(1973, 12, 4, 2, 26), "Chemical", 160.0, "S-Band", 18000000000.0, 12.8, "Imaging Photopolarimeter", "Magnetometer", 11300, false, "Completed", 0.0, "Solar Escape"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-020", "Pioneer 11", "Saturn", "NASA", 259.0, LocalDateTime.of(1973, 4, 6, 2, 11), LocalDateTime.of(1979, 9, 1, 16, 29), "Chemical", 165.0, "S-Band", 17000000000.0, 11.9, "Cosmic Ray Detector", "Imaging System", 11600, false, "Completed", 0.0, "Saturn Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HYB-001", "Hayabusa", "Asteroid Itokawa", "JAXA", 510.0, LocalDateTime.of(2003, 5, 9, 13, 29), LocalDateTime.of(2005, 9, 12, 8, 45), "Ion", 620.0, "X-Band", 320000000.0, 9.8, "Near Infrared Spectrometer", "Sampling Horn", 2557, false, "Completed", 0.0, "Asteroid Rendezvous"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HY2-001", "Hayabusa2", "Asteroid Ryugu", "JAXA", 609.0, LocalDateTime.of(2014, 12, 3, 4, 22), LocalDateTime.of(2018, 6, 27, 9, 10), "Ion", 680.0, "X-Band", 340000000.0, 10.2, "Thermal Infrared Imager", "LIDAR", 2190, false, "Completed", 0.0, "Sample Return"));
        spaceProbeDTOS.add(new SpaceProbeDTO("OSR-001", "OSIRIS-REx", "Asteroid Bennu", "NASA", 2110.0, LocalDateTime.of(2016, 9, 8, 23, 5), LocalDateTime.of(2018, 12, 3, 11, 15), "Chemical", 1220.0, "Ka-Band", 334000000.0, 8.7, "OCAMS", "OLA", 2555, false, "Completed", 0.0, "Sample Return"));
        spaceProbeDTOS.add(new SpaceProbeDTO("DWN-001", "Dawn", "Ceres", "NASA", 1217.0, LocalDateTime.of(2007, 9, 27, 11, 34), LocalDateTime.of(2015, 3, 6, 15, 42), "Ion", 1050.0, "X-Band", 413000000.0, 7.9, "Framing Camera", "Visible Spectrometer", 4040, false, "Completed", 0.0, "Ceres Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("RST-001", "Rosetta", "Comet 67P", "ESA", 3000.0, LocalDateTime.of(2004, 3, 2, 7, 17), LocalDateTime.of(2014, 8, 6, 9, 0), "Chemical", 980.0, "S-Band", 510000000.0, 6.5, "OSIRIS Camera", "ROSINA", 4600, false, "Completed", 0.0, "Comet Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PHL-001", "Philae", "Comet 67P", "ESA", 100.0, LocalDateTime.of(2004, 3, 2, 7, 17), LocalDateTime.of(2014, 11, 12, 16, 35), "Cold Gas", 120.0, "S-Band", 510000000.0, 1.2, "Drill System", "Gas Analyzer", 64, false, "Completed", 0.0, "Surface Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PKR-001", "Parker Solar Probe", "Sun", "NASA", 685.0, LocalDateTime.of(2018, 8, 12, 7, 31), LocalDateTime.of(2018, 11, 5, 13, 20), "Solar Electric", 900.0, "Ka-Band", 150000000.0, 192.0, "FIELDS", "WISPR", 6000, true, "Active", 72.8, "Solar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SOB-001", "Solar Orbiter", "Sun", "ESA/NASA", 1800.0, LocalDateTime.of(2020, 2, 10, 5, 3), LocalDateTime.of(2020, 6, 15, 12, 0), "Chemical", 840.0, "X-Band", 148000000.0, 42.5, "EUI", "PHI", 5200, true, "Active", 80.5, "Heliocentric Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SOH-001", "SOHO", "Sun", "ESA/NASA", 1850.0, LocalDateTime.of(1995, 12, 2, 8, 8), LocalDateTime.of(1996, 1, 15, 10, 0), "Chemical", 1100.0, "S-Band", 150000000.0, 30.0, "LASCO", "MDI", 11000, true, "Active", 18.5, "Lagrange L1"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TW1-001", "Tianwen-1", "Mars", "CNSA", 5000.0, LocalDateTime.of(2020, 7, 23, 12, 41), LocalDateTime.of(2021, 2, 10, 11, 52), "Chemical", 1350.0, "X-Band", 225000000.0, 4.8, "HiRIC Camera", "Mineralogy Spectrometer", 4500, true, "Active", 68.0, "Mars Orbit"));spaceProbeDTOS.add(new SpaceProbeDTO("HYB-001","Hayabusa","Asteroid Itokawa","JAXA",510.0,LocalDateTime.of(2003,5,9,13,29),LocalDateTime.of(2005,9,12,8,45),"Ion",620.0,"X-Band",320000000.0,9.8,"Near Infrared Spectrometer","Sampling Horn",2557,false,"Completed",0.0,"Asteroid Rendezvous"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HY2-001","Hayabusa2","Asteroid Ryugu","JAXA",609.0,LocalDateTime.of(2014,12,3,4,22),LocalDateTime.of(2018,6,27,9,10),"Ion",680.0,"X-Band",340000000.0,10.2,"Thermal Infrared Imager","LIDAR",2190,false,"Completed",0.0,"Sample Return"));
        spaceProbeDTOS.add(new SpaceProbeDTO("OSR-001","OSIRIS-REx","Asteroid Bennu","NASA",2110.0,LocalDateTime.of(2016,9,8,23,5),LocalDateTime.of(2018,12,3,11,15),"Chemical",1220.0,"Ka-Band",334000000.0,8.7,"OCAMS","OLA",2555,false,"Completed",0.0,"Sample Return"));
        spaceProbeDTOS.add(new SpaceProbeDTO("DWN-001","Dawn","Ceres","NASA",1217.0,LocalDateTime.of(2007,9,27,11,34),LocalDateTime.of(2015,3,6,15,42),"Ion",1050.0,"X-Band",413000000.0,7.9,"Framing Camera","Visible Spectrometer",4040,false,"Completed",0.0,"Ceres Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("RST-001","Rosetta","Comet 67P","ESA",3000.0,LocalDateTime.of(2004,3,2,7,17),LocalDateTime.of(2014,8,6,9,0),"Chemical",980.0,"S-Band",510000000.0,6.5,"OSIRIS Camera","ROSINA",4600,false,"Completed",0.0,"Comet Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PHL-001","Philae","Comet 67P","ESA",100.0,LocalDateTime.of(2004,3,2,7,17),LocalDateTime.of(2014,11,12,16,35),"Cold Gas",120.0,"S-Band",510000000.0,1.2,"Drill System","Gas Analyzer",64,false,"Completed",0.0,"Surface Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PKR-001","Parker Solar Probe","Sun","NASA",685.0,LocalDateTime.of(2018,8,12,7,31),LocalDateTime.of(2018,11,5,13,20),"Solar Electric",900.0,"Ka-Band",150000000.0,192.0,"FIELDS","WISPR",6000,true,"Active",72.8,"Solar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SOB-001","Solar Orbiter","Sun","ESA/NASA",1800.0,LocalDateTime.of(2020,2,10,5,3),LocalDateTime.of(2020,6,15,12,0),"Chemical",840.0,"X-Band",148000000.0,42.5,"EUI","PHI",5200,true,"Active",80.5,"Heliocentric Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SOH-001","SOHO","Sun","ESA/NASA",1850.0,LocalDateTime.of(1995,12,2,8,8),LocalDateTime.of(1996,1,15,10,0),"Chemical",1100.0,"S-Band",150000000.0,30.0,"LASCO","MDI",11000,true,"Active",18.5,"Lagrange L1"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TW1-001","Tianwen-1","Mars","CNSA",5000.0,LocalDateTime.of(2020,7,23,12,41),LocalDateTime.of(2021,2,10,11,52),"Chemical",1350.0,"X-Band",225000000.0,4.8,"HiRIC Camera","Mineralogy Spectrometer",4500,true,"Active",68.0,"Mars Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LRO-001","Lunar Reconnaissance Orbiter","Moon","NASA",1916.0,LocalDateTime.of(2009,6,18,21,32),LocalDateTime.of(2009,6,23,10,0),"Chemical",950.0,"S-Band",384400.0,1.6,"LROC","LOLA",6200,true,"Active",44.3,"Lunar Polar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SMT-001","SMART-1","Moon","ESA",367.0,LocalDateTime.of(2003,9,27,23,14),LocalDateTime.of(2004,11,15,6,0),"Ion",500.0,"X-Band",384400.0,1.5,"AMIE Camera","D-CIXS",1100,false,"Completed",0.0,"Lunar Spiral Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("KGY-001","Kaguya","Moon","JAXA",2914.0,LocalDateTime.of(2007,9,14,1,31),LocalDateTime.of(2007,10,4,12,0),"Chemical",920.0,"S-Band",384400.0,1.6,"Terrain Camera","Laser Altimeter",700,false,"Completed",0.0,"Lunar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LN2-001","Luna 2","Moon","Soviet Union",390.0,LocalDateTime.of(1959,9,12,6,39),LocalDateTime.of(1959,9,13,21,2),"Chemical",120.0,"VHF",384400.0,2.3,"Radiation Detector","Magnetometer",2,false,"Completed",0.0,"Impact Trajectory"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LN9-001","Luna 9","Moon","Soviet Union",1583.0,LocalDateTime.of(1966,1,31,11,41),LocalDateTime.of(1966,2,3,18,45),"Chemical",300.0,"VHF",384400.0,1.7,"Panoramic Camera","Radiation Sensor",4,false,"Completed",0.0,"Soft Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("GLL-001","Galileo","Jupiter","NASA",2223.0,LocalDateTime.of(1989,10,18,16,53),LocalDateTime.of(1995,12,7,0,0),"Chemical",890.0,"X-Band",778000000.0,17.3,"SSI Camera","Dust Detector",5110,false,"Completed",0.0,"Jupiter Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ICE-001","International Cometary Explorer","Comet Giacobini-Zinner","NASA",479.0,LocalDateTime.of(1978,8,12,15,12),LocalDateTime.of(1985,9,11,9,20),"Chemical",410.0,"S-Band",780000000.0,12.5,"Plasma Analyzer","Magnetometer",2580,false,"Completed",0.0,"Comet Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("STD-001","Stardust","Comet Wild 2","NASA",385.0,LocalDateTime.of(1999,2,7,21,4),LocalDateTime.of(2004,1,2,13,30),"Chemical",430.0,"X-Band",620000000.0,13.8,"Dust Collector","Navigation Camera",2520,false,"Completed",0.0,"Sample Return"));
        spaceProbeDTOS.add(new SpaceProbeDTO("DPI-001","Deep Impact","Comet Tempel 1","NASA",650.0,LocalDateTime.of(2005,1,12,18,47),LocalDateTime.of(2005,7,4,5,52),"Chemical",560.0,"X-Band",431000000.0,10.4,"High Resolution Imager","Impactor",181,false,"Completed",0.0,"Comet Impact"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ULY-001","Ulysses","Sun","ESA/NASA",370.0,LocalDateTime.of(1990,10,6,11,47),LocalDateTime.of(1992,2,8,14,30),"Chemical",420.0,"S-Band",149600000.0,26.0,"Solar Wind Detector","Magnetometer",6570,false,"Completed",0.0,"Solar Polar Orbit"));spaceProbeDTOS.add(new SpaceProbeDTO("VNR-013","Venera 13","Venus","Soviet Union",760.0,LocalDateTime.of(1981,10,30,6,4),LocalDateTime.of(1982,3,1,3,10),"Chemical",540.0,"VHF",41000000.0,7.3,"Panoramic Camera","Soil Sampler",122,false,"Completed",0.0,"Venus Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("VNR-014","Venera 14","Venus","Soviet Union",760.0,LocalDateTime.of(1981,11,4,7,15),LocalDateTime.of(1982,3,5,5,40),"Chemical",545.0,"VHF",41000000.0,7.2,"Drill","Spectrometer",121,false,"Completed",0.0,"Venus Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MRN-009","Mariner 9","Mars","NASA",998.0,LocalDateTime.of(1971,5,30,22,23),LocalDateTime.of(1971,11,14,18,0),"Chemical",610.0,"S-Band",225000000.0,6.1,"Television Camera","Infrared Radiometer",720,false,"Completed",0.0,"Mars Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MRN-010","Mariner 10","Mercury","NASA",503.0,LocalDateTime.of(1973,11,3,17,45),LocalDateTime.of(1974,3,29,20,48),"Chemical",395.0,"S-Band",91600000.0,8.5,"UV Spectrometer","Camera",1450,false,"Completed",0.0,"Mercury Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("EXP-001","ExoMars Trace Gas Orbiter","Mars","ESA/Roscosmos",4332.0,LocalDateTime.of(2016,3,14,9,31),LocalDateTime.of(2016,10,19,14,42),"Chemical",1180.0,"X-Band",225000000.0,4.7,"NOMAD","CaSSIS",3400,true,"Active",63.4,"Mars Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SCH-001","Schiaparelli EDM","Mars","ESA",577.0,LocalDateTime.of(2016,3,14,9,31),LocalDateTime.of(2016,10,19,14,48),"Chemical",260.0,"UHF",225000000.0,5.0,"Meteorological Station","Accelerometer",1,false,"Failed",0.0,"Mars Descent"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LUC-001","Lucy","Jupiter Trojans","NASA",1550.0,LocalDateTime.of(2021,10,16,9,34),LocalDateTime.of(2027,8,12,10,0),"Solar Electric",960.0,"X-Band",628000000.0,14.2,"L'LORRI","Thermal Spectrometer",6200,true,"Cruising",86.7,"Trojan Asteroids"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PSY-001","Psyche","Asteroid Psyche","NASA",2747.0,LocalDateTime.of(2023,10,13,14,19),LocalDateTime.of(2029,8,1,12,0),"Solar Electric",1300.0,"X-Band",450000000.0,12.1,"Multispectral Imager","Gamma Spectrometer",5400,true,"Cruising",90.4,"Asteroid Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HER-001","Hera","Didymos","ESA",1128.0,LocalDateTime.of(2024,10,7,15,52),LocalDateTime.of(2026,12,15,10,30),"Chemical",760.0,"X-Band",11000000.0,6.9,"Asteroid Camera","Laser Altimeter",1800,true,"Cruising",88.2,"Binary Asteroid"));
        spaceProbeDTOS.add(new SpaceProbeDTO("DRT-001","DART","Dimorphos","NASA",610.0,LocalDateTime.of(2021,11,24,6,21),LocalDateTime.of(2022,9,26,23,14),"Solar Electric",720.0,"X-Band",11000000.0,6.6,"DRACO Camera","Navigation Unit",306,false,"Completed",0.0,"Kinetic Impact"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SLR-001","SELENE-2","Moon","JAXA",4200.0,LocalDateTime.of(2028,1,14,9,0),LocalDateTime.of(2028,2,18,13,0),"Chemical",1200.0,"S-Band",384400.0,1.6,"Terrain Mapper","Ground Radar",1500,true,"Planned",100.0,"Lunar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LUN-025","Luna 25","Moon","Roscosmos",1750.0,LocalDateTime.of(2023,8,11,23,10),LocalDateTime.of(2023,8,19,14,57),"Chemical",810.0,"X-Band",384400.0,1.6,"Lander Camera","Drill",8,false,"Failed",0.0,"Lunar Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LUN-026","Luna 26","Moon","Roscosmos",1850.0,LocalDateTime.of(2027,5,10,8,0),LocalDateTime.of(2027,6,18,9,30),"Chemical",830.0,"X-Band",384400.0,1.6,"Spectrometer","Neutron Detector",1825,true,"Planned",100.0,"Lunar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ADR-001","Aditya-L1","Sun","ISRO",1480.0,LocalDateTime.of(2023,9,2,11,50),LocalDateTime.of(2024,1,6,16,0),"Chemical",920.0,"S-Band",150000000.0,29.8,"VELC","SUIT",3650,true,"Active",84.5,"Lagrange L1"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SLM-001","SLIM","Moon","JAXA",700.0,LocalDateTime.of(2023,9,7,23,42),LocalDateTime.of(2024,1,20,0,20),"Chemical",510.0,"X-Band",384400.0,1.6,"Navigation Camera","Landing Radar",120,true,"Active",48.7,"Precision Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LIC-001","Liciacube","Dimorphos","ASI",14.0,LocalDateTime.of(2021,11,24,6,21),LocalDateTime.of(2022,9,26,23,16),"Cold Gas",90.0,"X-Band",11000000.0,6.5,"LUKE Camera","LEIA Camera",310,false,"Completed",0.0,"Asteroid Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("RAS-001","Ranger 7","Moon","NASA",366.0,LocalDateTime.of(1964,7,28,16,50),LocalDateTime.of(1964,7,31,13,25),"Chemical",250.0,"S-Band",384400.0,2.1,"Television Camera","Impact Sensor",3,false,"Completed",0.0,"Impact Mission"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SUR-001","Surveyor 1","Moon","NASA",995.0,LocalDateTime.of(1966,5,30,14,41),LocalDateTime.of(1966,6,2,6,17),"Chemical",340.0,"S-Band",384400.0,1.8,"Television Camera","Soil Sampler",180,false,"Completed",0.0,"Soft Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ZON-001","Zond 3","Moon","Soviet Union",960.0,LocalDateTime.of(1965,7,18,15,38),LocalDateTime.of(1965,7,20,9,12),"Chemical",320.0,"VHF",384400.0,2.2,"Imaging Camera","Radiometer",120,false,"Completed",0.0,"Lunar Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("CMP-001","Comet Interceptor","Comet","ESA",970.0,LocalDateTime.of(2029,5,15,10,30),LocalDateTime.of(2030,11,20,8,15),"Chemical",710.0,"X-Band",700000000.0,13.5,"Dust Analyzer","Plasma Instrument",2500,true,"Planned",100.0,"Comet Intercept"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ODY-001","Mars Odyssey","Mars","NASA",725.0,LocalDateTime.of(2001,4,7,15,2),LocalDateTime.of(2001,10,24,2,30),"Chemical",780.0,"X-Band",225000000.0,4.9,"THEMIS","Gamma Ray Spectrometer",9000,true,"Active",22.5,"Mars Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MRO-001","Mars Reconnaissance Orbiter","Mars","NASA",2180.0,LocalDateTime.of(2005,8,12,11,43),LocalDateTime.of(2006,3,10,21,24),"Chemical",1020.0,"X-Band",225000000.0,5.3,"HiRISE","CRISM",7200,true,"Active",45.7,"Mars Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("INS-001","InSight","Mars","NASA",694.0,LocalDateTime.of(2018,5,5,11,5),LocalDateTime.of(2018,11,26,19,52),"Chemical",610.0,"UHF",225000000.0,4.8,"SEIS","HP3",1440,false,"Completed",0.0,"Mars Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("VKG-001","Viking 1","Mars","NASA",3527.0,LocalDateTime.of(1975,8,20,21,22),LocalDateTime.of(1976,6,19,8,12),"Chemical",1200.0,"S-Band",225000000.0,4.6,"Imaging System","Biology Experiment",2245,false,"Completed",0.0,"Mars Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("VKG-002","Viking 2","Mars","NASA",3527.0,LocalDateTime.of(1975,9,9,18,39),LocalDateTime.of(1976,8,7,12,30),"Chemical",1195.0,"S-Band",225000000.0,4.7,"Camera","Gas Chromatograph",1316,false,"Completed",0.0,"Mars Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MEX-001","Mars Express","Mars","ESA",1123.0,LocalDateTime.of(2003,6,2,17,45),LocalDateTime.of(2003,12,25,3,10),"Chemical",845.0,"X-Band",225000000.0,5.1,"HRSC","MARSIS",8000,true,"Active",36.9,"Mars Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("BCO-001","Bepi Colombo MPO","Mercury","ESA",2300.0,LocalDateTime.of(2018,10,20,1,45),LocalDateTime.of(2025,12,5,9,30),"Ion",970.0,"Ka-Band",91600000.0,8.1,"Mercury Imaging System","Laser Altimeter",3600,true,"Cruising",87.0,"Mercury Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("VEX-001","Venus Express","Venus","ESA",1270.0,LocalDateTime.of(2005,11,9,3,33),LocalDateTime.of(2006,4,11,7,10),"Chemical",870.0,"X-Band",41000000.0,7.2,"VIRTIS","MAG",3200,false,"Completed",0.0,"Venus Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PIC-001","PICARD","Sun","CNES",315.0,LocalDateTime.of(2010,6,15,2,42),LocalDateTime.of(2010,6,16,10,15),"Chemical",320.0,"S-Band",149600000.0,29.7,"SODISM","PREMOS",1200,false,"Completed",0.0,"Low Earth Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("GEN-001","Genesis","Sun","NASA",636.0,LocalDateTime.of(2001,8,8,16,13),LocalDateTime.of(2001,11,16,9,45),"Chemical",480.0,"S-Band",150000000.0,30.2,"Solar Wind Collector","Ion Monitor",1120,false,"Completed",0.0,"Lagrange L1"));
        spaceProbeDTOS.add(new SpaceProbeDTO("CLC-001","CLUSTER-1","Magnetosphere","ESA",1200.0,LocalDateTime.of(2000,7,16,12,39),LocalDateTime.of(2000,8,9,8,15),"Chemical",640.0,"S-Band",45000.0,7.8,"FGM","PEACE",6800,true,"Active",18.0,"Polar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("CLC-002","CLUSTER-2","Magnetosphere","ESA",1200.0,LocalDateTime.of(2000,7,16,12,40),LocalDateTime.of(2000,8,9,8,20),"Chemical",640.0,"S-Band",45000.0,7.8,"EFW","WHISPER",6800,true,"Active",18.5,"Polar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("CLC-003","CLUSTER-3","Magnetosphere","ESA",1200.0,LocalDateTime.of(2000,7,16,12,41),LocalDateTime.of(2000,8,9,8,25),"Chemical",640.0,"S-Band",45000.0,7.8,"CIS","RAPID",6800,true,"Active",18.2,"Polar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("CLC-004","CLUSTER-4","Magnetosphere","ESA",1200.0,LocalDateTime.of(2000,7,16,12,42),LocalDateTime.of(2000,8,9,8,30),"Chemical",640.0,"S-Band",45000.0,7.8,"ASPOC","DWP",6800,true,"Active",18.1,"Polar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LUN-027","Luna 27","Moon","Roscosmos",1850.0,LocalDateTime.of(2028,8,14,11,25),LocalDateTime.of(2028,9,16,15,30),"Chemical",820.0,"X-Band",384400.0,1.6,"Drill","Mass Spectrometer",1800,true,"Planned",100.0,"South Pole Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("EUR-001","Europa Clipper","Europa","NASA",6065.0,LocalDateTime.of(2024,10,14,16,6),LocalDateTime.of(2030,4,11,9,15),"Solar Electric",1500.0,"Ka-Band",628300000.0,13.7,"EIS","MASPEX",5000,true,"Cruising",94.2,"Europa Flybys"));
        spaceProbeDTOS.add(new SpaceProbeDTO("JCE-001","JUICE","Ganymede","ESA",6070.0,LocalDateTime.of(2023,4,14,12,14),LocalDateTime.of(2031,7,20,10,45),"Chemical",1420.0,"X-Band",778000000.0,14.0,"JANUS","RIME",6000,true,"Cruising",91.0,"Jupiter System"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TIT-001","Dragonfly","Titan","NASA",875.0,LocalDateTime.of(2028,7,1,9,45),LocalDateTime.of(2034,6,15,8,30),"Nuclear",1320.0,"X-Band",1400000000.0,5.9,"DragonCam","DraMS",4200,true,"Planned",100.0,"Titan Flight"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ENV-001","EnVision","Venus","ESA",2150.0,LocalDateTime.of(2031,11,20,10,15),LocalDateTime.of(2033,5,18,14,40),"Chemical",1080.0,"Ka-Band",41000000.0,7.1,"VenSAR","SRS",3650,true,"Planned",100.0,"Venus Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("DAV-001","DAVINCI","Venus","NASA",2100.0,LocalDateTime.of(2030,6,15,13,20),LocalDateTime.of(2031,11,10,11,30),"Chemical",1110.0,"X-Band",41000000.0,7.0,"Mass Spectrometer","Descent Camera",1500,true,"Planned",100.0,"Atmospheric Descent"));
        spaceProbeDTOS.add(new SpaceProbeDTO("VER-001","VERITAS","Venus","NASA",2500.0,LocalDateTime.of(2031,5,10,8,45),LocalDateTime.of(2032,12,18,16,10),"Chemical",1180.0,"Ka-Band",41000000.0,7.2,"Radar Mapper","Infrared Spectrometer",2500,true,"Planned",100.0,"Venus Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("COM-001","Comet Nucleus Tour","Comet","ESA",1650.0,LocalDateTime.of(2032,4,15,7,20),LocalDateTime.of(2035,9,28,10,40),"Ion",950.0,"X-Band",690000000.0,11.8,"Dust Analyzer","Spectrometer",4200,true,"Planned",100.0,"Comet Rendezvous"));
        spaceProbeDTOS.add(new SpaceProbeDTO("AST-001","Asteroid Explorer","Asteroid Eros","JAXA",980.0,LocalDateTime.of(2029,2,18,6,15),LocalDateTime.of(2031,1,25,12,10),"Ion",780.0,"Ka-Band",316000000.0,9.5,"Laser Imager","Mineral Analyzer",2800,true,"Cruising",89.5,"Asteroid Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("NEP-001","Neptune Explorer","Neptune","NASA",5400.0,LocalDateTime.of(2034,8,10,15,40),LocalDateTime.of(2046,10,14,9,15),"Nuclear",1750.0,"X-Band",4500000000.0,16.8,"Atmospheric Probe","Magnetometer",7000,true,"Planned",100.0,"Neptune Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("URA-001","Uranus Orbiter","Uranus","ESA",5200.0,LocalDateTime.of(2035,5,12,12,25),LocalDateTime.of(2048,3,20,11,45),"Nuclear",1680.0,"Ka-Band",2900000000.0,15.7,"Ice Mapper","Infrared Camera",7200,true,"Planned",100.0,"Uranus Orbit"));spaceProbeDTOS.add(new SpaceProbeDTO("MAV-001","MAVEN","Mars","NASA",2454.0,LocalDateTime.of(2013,11,18,18,28),LocalDateTime.of(2014,9,22,2,24),"Chemical",1135.0,"X-Band",225000000.0,4.5,"IUVS","NGIMS",4200,true,"Active",41.2,"Mars Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MGS-001","Mars Global Surveyor","Mars","NASA",1060.0,LocalDateTime.of(1996,11,7,17,0),LocalDateTime.of(1997,9,12,14,30),"Chemical",980.0,"X-Band",225000000.0,4.3,"MOC","TES",3650,false,"Completed",0.0,"Mars Polar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PHX-001","Phoenix","Mars","NASA",670.0,LocalDateTime.of(2007,8,4,9,26),LocalDateTime.of(2008,5,25,23,38),"Chemical",640.0,"UHF",225000000.0,4.7,"Robotic Arm","TEGA",151,false,"Completed",0.0,"Mars Arctic Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PFD-001","Mars Pathfinder","Mars","NASA",895.0,LocalDateTime.of(1996,12,4,6,58),LocalDateTime.of(1997,7,4,16,56),"Chemical",710.0,"X-Band",225000000.0,5.1,"IMP Camera","Sojourner Rover",224,false,"Completed",0.0,"Ares Vallis"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SJR-001","Sojourner","Mars","NASA",10.6,LocalDateTime.of(1996,12,4,6,58),LocalDateTime.of(1997,7,4,17,15),"Solar",55.0,"UHF",225000000.0,0.1,"APXS","Hazard Cameras",83,false,"Completed",0.0,"Mars Surface"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ZHU-001","Zhurong","Mars","CNSA",240.0,LocalDateTime.of(2020,7,23,12,41),LocalDateTime.of(2021,5,14,23,18),"Solar",520.0,"UHF",225000000.0,0.2,"Terrain Camera","Ground Radar",358,false,"Completed",0.0,"Utopia Planitia"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HOP-001","Hope Probe","Mars","UAE Space Agency",1350.0,LocalDateTime.of(2020,7,19,21,58),LocalDateTime.of(2021,2,9,15,42),"Chemical",860.0,"X-Band",225000000.0,4.4,"EXI","EMIRS",2500,true,"Active",53.7,"Mars Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("NOZ-001","Nozomi","Mars","JAXA",540.0,LocalDateTime.of(1998,7,4,18,12),LocalDateTime.of(2003,12,14,11,10),"Chemical",430.0,"X-Band",225000000.0,4.2,"Plasma Analyzer","Magnetometer",1985,false,"Failed",0.0,"Mars Transfer"));
        spaceProbeDTOS.add(new SpaceProbeDTO("FOB-001","Fobos-Grunt","Phobos","Roscosmos",13300.0,LocalDateTime.of(2011,11,9,0,16),LocalDateTime.of(2011,11,9,5,30),"Chemical",1450.0,"X-Band",225000000.0,3.8,"Sample Drill","Spectrometer",3,false,"Failed",0.0,"Earth Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MEX-002","Mars 2020 Helicopter","Mars","NASA",1.8,LocalDateTime.of(2020,7,30,11,50),LocalDateTime.of(2021,2,18,20,55),"Solar",35.0,"ZigBee",225000000.0,0.0,"Navigation Camera","Color Camera",1100,false,"Completed",0.0,"Jezero Crater"));
        spaceProbeDTOS.add(new SpaceProbeDTO("GNS-001","Genesis II","Sun","NASA",680.0,LocalDateTime.of(2028,4,12,8,30),LocalDateTime.of(2028,7,18,14,15),"Solar Electric",640.0,"Ka-Band",149600000.0,31.4,"Solar Particle Analyzer","Dust Collector",2600,true,"Planned",100.0,"L1 Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SOL-001","Solar Cruiser","Sun","NASA",900.0,LocalDateTime.of(2027,3,8,7,10),LocalDateTime.of(2027,8,12,9,20),"Solar Sail",820.0,"X-Band",149600000.0,35.6,"Solar Sail Camera","Particle Sensor",3100,true,"Planned",100.0,"Heliocentric Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MER-002","Mercury Explorer","Mercury","JAXA",1850.0,LocalDateTime.of(2030,9,18,6,15),LocalDateTime.of(2036,1,24,12,40),"Ion",980.0,"Ka-Band",91600000.0,8.4,"Mercury Mapper","Spectrometer",4500,true,"Planned",100.0,"Mercury Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("VEN-002","Venus Climate Orbiter","Venus","ISRO",1750.0,LocalDateTime.of(2028,12,5,11,45),LocalDateTime.of(2029,6,19,8,15),"Chemical",870.0,"S-Band",41000000.0,7.0,"Cloud Imager","Thermal Spectrometer",2500,true,"Planned",100.0,"Venus Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LUN-028","Lunar Ice Mapper","Moon","NASA",1450.0,LocalDateTime.of(2029,1,14,5,30),LocalDateTime.of(2029,2,17,9,45),"Chemical",780.0,"X-Band",384400.0,1.6,"Ice Radar","Infrared Mapper",2100,true,"Planned",100.0,"Polar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TTN-001","Titan Explorer","Titan","ESA",4200.0,LocalDateTime.of(2032,6,18,10,20),LocalDateTime.of(2040,8,11,13,40),"Nuclear",1650.0,"Ka-Band",1400000000.0,6.2,"Methane Analyzer","Atmospheric Camera",6200,true,"Planned",100.0,"Titan Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ENC-001","Enceladus Explorer","Enceladus","NASA",3850.0,LocalDateTime.of(2033,4,7,12,35),LocalDateTime.of(2041,10,9,15,20),"Nuclear",1580.0,"X-Band",1275000000.0,6.5,"Ice Penetrating Radar","Mass Spectrometer",6400,true,"Planned",100.0,"Enceladus Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TRI-001","Trident","Triton","NASA",1950.0,LocalDateTime.of(2029,10,25,8,25),LocalDateTime.of(2038,6,18,11,15),"Chemical",940.0,"Ka-Band",4500000000.0,15.8,"High Resolution Camera","Magnetometer",5000,true,"Planned",100.0,"Triton Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("CER-002","Ceres Mapper","Ceres","ESA",1650.0,LocalDateTime.of(2031,7,12,14,10),LocalDateTime.of(2034,2,28,10,50),"Ion",910.0,"X-Band",413000000.0,8.0,"Surface Imager","Neutron Detector",3200,true,"Cruising",92.5,"Ceres Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ERS-001","Eros Surveyor","Asteroid Eros","NASA",980.0,LocalDateTime.of(2030,11,8,9,20),LocalDateTime.of(2032,12,14,8,40),"Ion",720.0,"X-Band",316000000.0,9.1,"Laser Altimeter","Camera",2700,true,"Cruising",88.6,"Asteroid Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HAL-001","Halley Observer","Halley's Comet","ESA",1550.0,LocalDateTime.of(2035,5,16,7,25),LocalDateTime.of(2061,7,9,10,30),"Ion",840.0,"Ka-Band",5200000000.0,18.2,"Dust Analyzer","Comet Camera",9500,true,"Planned",100.0,"Comet Rendezvous"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ORB-001","Orbital Surveyor","Moon","ISRO",1200.0,LocalDateTime.of(2029,8,4,11,35),LocalDateTime.of(2029,9,1,9,10),"Chemical",760.0,"S-Band",384400.0,1.7,"Mapping Camera","Laser Altimeter",1800,true,"Planned",100.0,"Lunar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("JOV-001","Jovian Observer","Jupiter","ESA",4800.0,LocalDateTime.of(2034,2,12,8,15),LocalDateTime.of(2041,5,24,11,40),"Nuclear",1700.0,"Ka-Band",778000000.0,13.6,"Radiation Monitor","Infrared Spectrometer",6000,true,"Planned",100.0,"Jupiter Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SAT-001","Saturn Mapper","Saturn","NASA",5100.0,LocalDateTime.of(2035,9,6,10,45),LocalDateTime.of(2043,11,19,12,30),"Nuclear",1820.0,"X-Band",1430000000.0,10.8,"Ring Imager","Magnetometer",6800,true,"Planned",100.0,"Saturn Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("KBO-001","Kuiper Belt Observer","Kuiper Belt","NASA",2950.0,LocalDateTime.of(2036,3,18,6,25),LocalDateTime.of(2048,8,22,15,50),"Nuclear",1260.0,"Ka-Band",6200000000.0,17.4,"Wide Angle Camera","Dust Detector",7200,true,"Planned",100.0,"Kuiper Belt"));spaceProbeDTOS.add(new SpaceProbeDTO("APL-001","Apollo Lunar Orbiter","Moon","NASA",1800.0,LocalDateTime.of(2030,1,15,9,30),LocalDateTime.of(2030,2,12,11,45),"Chemical",850.0,"S-Band",384400.0,1.7,"Orbital Camera","Laser Altimeter",2200,true,"Planned",100.0,"Lunar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("IOX-001","Io Explorer","Io","NASA",4700.0,LocalDateTime.of(2033,5,12,7,45),LocalDateTime.of(2040,8,25,10,30),"Nuclear",1720.0,"Ka-Band",778000000.0,17.1,"Volcano Imager","Radiation Detector",6200,true,"Planned",100.0,"Io Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("GNY-001","Ganymede Mapper","Ganymede","ESA",4350.0,LocalDateTime.of(2032,9,18,6,15),LocalDateTime.of(2039,12,11,14,20),"Chemical",1580.0,"X-Band",778000000.0,14.5,"Ice Radar","Infrared Spectrometer",6100,true,"Cruising",92.0,"Ganymede Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("CAL-001","Callisto Observer","Callisto","NASA",4520.0,LocalDateTime.of(2034,4,20,13,25),LocalDateTime.of(2042,6,15,9,40),"Nuclear",1685.0,"Ka-Band",778000000.0,13.8,"Surface Camera","Gravity Sensor",6400,true,"Planned",100.0,"Callisto Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("EUR-002","Europa Lander","Europa","NASA",3980.0,LocalDateTime.of(2035,2,14,8,50),LocalDateTime.of(2042,5,9,12,15),"Chemical",1450.0,"X-Band",628300000.0,12.9,"Ice Drill","Life Detector",3200,true,"Planned",100.0,"Europa Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MIM-001","Mimas Explorer","Mimas","ESA",2800.0,LocalDateTime.of(2036,8,7,10,20),LocalDateTime.of(2044,11,3,13,45),"Ion",990.0,"Ka-Band",1430000000.0,9.8,"Terrain Camera","Spectrometer",4300,true,"Planned",100.0,"Mimas Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("RHE-001","Rhea Surveyor","Rhea","NASA",2950.0,LocalDateTime.of(2037,3,9,6,40),LocalDateTime.of(2045,8,16,10,10),"Ion",1020.0,"X-Band",1430000000.0,9.6,"Ice Mapper","Thermal Imager",4400,true,"Planned",100.0,"Rhea Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("DIO-001","Dione Orbiter","Dione","ESA",2875.0,LocalDateTime.of(2036,6,12,9,15),LocalDateTime.of(2044,9,20,15,25),"Chemical",1040.0,"Ka-Band",1430000000.0,9.7,"Surface Radar","Laser Scanner",4200,true,"Planned",100.0,"Dione Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TET-001","Tethys Explorer","Tethys","NASA",2760.0,LocalDateTime.of(2037,10,5,7,55),LocalDateTime.of(2045,12,14,11,20),"Ion",980.0,"X-Band",1430000000.0,9.5,"Optical Camera","Dust Sensor",4100,true,"Planned",100.0,"Tethys Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HYP-001","Hyperion Mission","Hyperion","NASA",2680.0,LocalDateTime.of(2038,1,18,5,30),LocalDateTime.of(2046,4,10,14,50),"Chemical",950.0,"Ka-Band",1430000000.0,9.2,"Surface Imager","Gravity Sensor",4300,true,"Planned",100.0,"Hyperion Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PHO-001","Phoebe Explorer","Phoebe","ESA",2890.0,LocalDateTime.of(2038,7,11,8,20),LocalDateTime.of(2046,10,25,12,40),"Ion",1010.0,"X-Band",1430000000.0,9.4,"Wide Camera","Spectrometer",4200,true,"Planned",100.0,"Phoebe Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MIR-001","Miranda Orbiter","Uranus","NASA",4100.0,LocalDateTime.of(2039,2,8,11,10),LocalDateTime.of(2051,5,14,10,25),"Nuclear",1620.0,"Ka-Band",2900000000.0,15.4,"Terrain Mapper","Infrared Camera",7200,true,"Planned",100.0,"Miranda Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ARI-001","Ariel Explorer","Uranus","ESA",4250.0,LocalDateTime.of(2039,5,19,10,35),LocalDateTime.of(2051,8,18,11,55),"Nuclear",1640.0,"X-Band",2900000000.0,15.3,"Ice Radar","Magnetometer",7100,true,"Planned",100.0,"Ariel Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("UMB-001","Umbriel Surveyor","Uranus","NASA",4180.0,LocalDateTime.of(2039,8,14,9,15),LocalDateTime.of(2051,11,12,15,30),"Chemical",1590.0,"Ka-Band",2900000000.0,15.2,"Optical Imager","Gamma Spectrometer",7000,true,"Planned",100.0,"Umbriel Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TIT-002","Titania Observer","Uranus","ESA",4320.0,LocalDateTime.of(2040,1,6,8,40),LocalDateTime.of(2052,4,20,13,50),"Nuclear",1665.0,"X-Band",2900000000.0,15.6,"Laser Altimeter","Mineral Scanner",7350,true,"Planned",100.0,"Titania Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("OBE-001","Oberon Explorer","Uranus","NASA",4390.0,LocalDateTime.of(2040,4,22,7,10),LocalDateTime.of(2052,8,8,12,20),"Nuclear",1680.0,"Ka-Band",2900000000.0,15.5,"Panoramic Camera","Ice Spectrometer",7400,true,"Planned",100.0,"Oberon Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("NER-001","Nereid Mission","Neptune","ESA",3950.0,LocalDateTime.of(2041,3,18,9,45),LocalDateTime.of(2054,7,12,10,30),"Ion",1510.0,"X-Band",4500000000.0,16.2,"Orbital Camera","Radiation Sensor",7600,true,"Planned",100.0,"Nereid Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PRO-001","Proteus Explorer","Neptune","NASA",4050.0,LocalDateTime.of(2041,7,27,6,20),LocalDateTime.of(2054,11,16,14,15),"Chemical",1545.0,"Ka-Band",4500000000.0,16.0,"High Resolution Camera","Gravity Analyzer",7700,true,"Planned",100.0,"Proteus Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LAR-001","Larissa Orbiter","Neptune","ESA",3980.0,LocalDateTime.of(2042,1,13,11,30),LocalDateTime.of(2055,5,10,15,40),"Ion",1490.0,"X-Band",4500000000.0,16.1,"Laser Mapper","Infrared Sensor",7500,true,"Planned",100.0,"Larissa Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("CHA-001","Charon Surveyor","Charon","NASA",3220.0,LocalDateTime.of(2042,8,5,10,15),LocalDateTime.of(2055,12,20,13,30),"Nuclear",1380.0,"Ka-Band",5900000000.0,14.8,"Terrain Camera","Composition Analyzer",7800,true,"Planned",100.0,"Charon Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PLT-001","Pluto Polar Orbiter","Pluto","ESA",3380.0,LocalDateTime.of(2043,2,19,7,40),LocalDateTime.of(2056,7,18,10,20),"Nuclear",1420.0,"X-Band",5900000000.0,14.9,"Polar Camera","Ice Radar",7900,true,"Planned",100.0,"Pluto Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SED-001","Sedna Explorer","Sedna","NASA",3650.0,LocalDateTime.of(2043,9,8,9,50),LocalDateTime.of(2065,11,25,12,40),"Nuclear",1500.0,"Ka-Band",12000000000.0,19.5,"Deep Space Camera","Dust Analyzer",9800,true,"Planned",100.0,"Sedna Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ERI-001","Eris Observer","Eris","ESA",3720.0,LocalDateTime.of(2044,4,14,8,25),LocalDateTime.of(2067,9,30,14,15),"Nuclear",1525.0,"X-Band",14500000000.0,20.2,"Wide Field Camera","Spectrometer",10200,true,"Planned",100.0,"Eris Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MAK-001","Makemake Explorer","Makemake","NASA",3550.0,LocalDateTime.of(2044,11,22,6,15),LocalDateTime.of(2066,12,18,11,45),"Nuclear",1480.0,"Ka-Band",6800000000.0,18.7,"Imaging System","Thermal Sensor",9600,true,"Planned",100.0,"Makemake Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HAU-001","Haumea Mission","Haumea","ESA",3480.0,LocalDateTime.of(2045,5,17,10,30),LocalDateTime.of(2068,8,21,15,10),"Nuclear",1465.0,"X-Band",6500000000.0,18.5,"Ring Mapper","Infrared Spectrometer",9700,true,"Planned",100.0,"Haumea Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-70", "Mission-70", "Venus", "NASA", 1200.0, LocalDateTime.of(2020, 11, 15, 10, 30), LocalDateTime.of(2022, 11, 15, 11, 45), "Ion", 850.0, "S-Band", 17500000.0, 40.0, "Radar", "Magnetometer", 170, true, "Aborted", 70.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-71", "Mission-71", "Pluto", "ISRO", 1210.0, LocalDateTime.of(2021, 12, 16, 10, 30), LocalDateTime.of(2023, 12, 16, 11, 45), "Nuclear", 855.0, "Ka-Band", 17750000.0, 41.0, "Magnetometer", "Camera", 171, false, "In Progress", 71.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-72", "Mission-72", "Mars", "ESA", 1220.0, LocalDateTime.of(2022, 1, 17, 10, 30), LocalDateTime.of(2024, 1, 17, 11, 45), "Chemical", 860.0, "X-Band", 18000000.0, 42.0, "Camera", "Spectrometer", 172, true, "Success", 72.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-73", "Mission-73", "Moon", "JAXA", 1230.0, LocalDateTime.of(2023, 2, 18, 10, 30), LocalDateTime.of(2025, 2, 18, 11, 45), "Solar Electric", 865.0, "S-Band", 18250000.0, 43.0, "Spectrometer", "Radar", 173, false, "Failed", 73.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-74", "Mission-74", "Jupiter", "SpaceX", 1240.0, LocalDateTime.of(2024, 3, 19, 10, 30), LocalDateTime.of(2026, 3, 19, 11, 45), "Ion", 870.0, "Ka-Band", 18500000.0, 44.0, "Radar", "Magnetometer", 174, true, "Aborted", 74.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-75", "Mission-75", "Saturn", "NASA", 1250.0, LocalDateTime.of(2010, 4, 20, 10, 30), LocalDateTime.of(2012, 4, 20, 11, 45), "Nuclear", 875.0, "X-Band", 18750000.0, 45.0, "Magnetometer", "Camera", 175, false, "In Progress", 75.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-76", "Mission-76", "Venus", "ISRO", 1260.0, LocalDateTime.of(2011, 5, 21, 10, 30), LocalDateTime.of(2013, 5, 21, 11, 45), "Chemical", 880.0, "S-Band", 19000000.0, 46.0, "Camera", "Spectrometer", 176, true, "Success", 76.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-77", "Mission-77", "Pluto", "ESA", 1270.0, LocalDateTime.of(2012, 6, 22, 10, 30), LocalDateTime.of(2014, 6, 22, 11, 45), "Solar Electric", 885.0, "Ka-Band", 19250000.0, 47.0, "Spectrometer", "Radar", 177, false, "Failed", 77.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-78", "Mission-78", "Mars", "JAXA", 1280.0, LocalDateTime.of(2013, 7, 23, 10, 30), LocalDateTime.of(2015, 7, 23, 11, 45), "Ion", 890.0, "X-Band", 19500000.0, 48.0, "Radar", "Magnetometer", 178, true, "Aborted", 78.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-79", "Mission-79", "Moon", "SpaceX", 1290.0, LocalDateTime.of(2014, 8, 24, 10, 30), LocalDateTime.of(2016, 8, 24, 11, 45), "Nuclear", 895.0, "S-Band", 19750000.0, 49.0, "Magnetometer", "Camera", 179, false, "In Progress", 79.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-80", "Mission-80", "Jupiter", "NASA", 1300.0, LocalDateTime.of(2015, 9, 25, 10, 30), LocalDateTime.of(2017, 9, 25, 11, 45), "Chemical", 900.0, "Ka-Band", 20000000.0, 10.0, "Camera", "Spectrometer", 180, true, "Success", 80.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-81", "Mission-81", "Saturn", "ISRO", 1310.0, LocalDateTime.of(2016, 10, 26, 10, 30), LocalDateTime.of(2018, 10, 26, 11, 45), "Solar Electric", 905.0, "X-Band", 20250000.0, 11.0, "Spectrometer", "Radar", 181, false, "Failed", 81.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-82", "Mission-82", "Venus", "ESA", 1320.0, LocalDateTime.of(2017, 11, 27, 10, 30), LocalDateTime.of(2019, 11, 27, 11, 45), "Ion", 910.0, "S-Band", 20500000.0, 12.0, "Radar", "Magnetometer", 182, true, "Aborted", 82.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-83", "Mission-83", "Pluto", "JAXA", 1330.0, LocalDateTime.of(2018, 12, 28, 10, 30), LocalDateTime.of(2020, 12, 28, 11, 45), "Nuclear", 915.0, "Ka-Band", 20750000.0, 13.0, "Magnetometer", "Camera", 183, false, "In Progress", 83.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-84", "Mission-84", "Mars", "SpaceX", 1340.0, LocalDateTime.of(2019, 1, 1, 10, 30), LocalDateTime.of(2021, 1, 1, 11, 45), "Chemical", 920.0, "X-Band", 21000000.0, 14.0, "Camera", "Spectrometer", 184, true, "Success", 84.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-85", "Mission-85", "Moon", "NASA", 1350.0, LocalDateTime.of(2020, 2, 2, 10, 30), LocalDateTime.of(2022, 2, 2, 11, 45), "Solar Electric", 925.0, "S-Band", 21250000.0, 15.0, "Spectrometer", "Radar", 185, false, "Failed", 85.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-86", "Mission-86", "Jupiter", "ISRO", 1360.0, LocalDateTime.of(2021, 3, 3, 10, 30), LocalDateTime.of(2023, 3, 3, 11, 45), "Ion", 930.0, "Ka-Band", 21500000.0, 16.0, "Radar", "Magnetometer", 186, true, "Aborted", 86.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-87", "Mission-87", "Saturn", "ESA", 1370.0, LocalDateTime.of(2022, 4, 4, 10, 30), LocalDateTime.of(2024, 4, 4, 11, 45), "Nuclear", 935.0, "X-Band", 21750000.0, 17.0, "Magnetometer", "Camera", 187, false, "In Progress", 87.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-88", "Mission-88", "Venus", "JAXA", 1380.0, LocalDateTime.of(2023, 5, 5, 10, 30), LocalDateTime.of(2025, 5, 5, 11, 45), "Chemical", 940.0, "S-Band", 22000000.0, 18.0, "Camera", "Spectrometer", 188, true, "Success", 88.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-89", "Mission-89", "Pluto", "SpaceX", 1390.0, LocalDateTime.of(2024, 6, 6, 10, 30), LocalDateTime.of(2026, 6, 6, 11, 45), "Solar Electric", 945.0, "Ka-Band", 22250000.0, 19.0, "Spectrometer", "Radar", 189, false, "Failed", 89.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-90", "Mission-90", "Mars", "NASA", 1400.0, LocalDateTime.of(2010, 7, 7, 10, 30), LocalDateTime.of(2012, 7, 7, 11, 45), "Ion", 950.0, "X-Band", 22500000.0, 20.0, "Radar", "Magnetometer", 190, true, "Aborted", 90.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-91", "Mission-91", "Moon", "ISRO", 1410.0, LocalDateTime.of(2011, 8, 8, 10, 30), LocalDateTime.of(2013, 8, 8, 11, 45), "Nuclear", 955.0, "S-Band", 22750000.0, 21.0, "Magnetometer", "Camera", 191, false, "In Progress", 91.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-92", "Mission-92", "Jupiter", "ESA", 1420.0, LocalDateTime.of(2012, 9, 9, 10, 30), LocalDateTime.of(2014, 9, 9, 11, 45), "Chemical", 960.0, "Ka-Band", 23000000.0, 22.0, "Camera", "Spectrometer", 192, true, "Success", 92.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-93", "Mission-93", "Saturn", "JAXA", 1430.0, LocalDateTime.of(2013, 10, 10, 10, 30), LocalDateTime.of(2015, 10, 10, 11, 45), "Solar Electric", 965.0, "X-Band", 23250000.0, 23.0, "Spectrometer", "Radar", 193, false, "Failed", 93.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-94", "Mission-94", "Venus", "SpaceX", 1440.0, LocalDateTime.of(2014, 11, 11, 10, 30), LocalDateTime.of(2016, 11, 11, 11, 45), "Ion", 970.0, "S-Band", 23500000.0, 24.0, "Radar", "Magnetometer", 194, true, "Aborted", 94.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-95", "Mission-95", "Pluto", "NASA", 1450.0, LocalDateTime.of(2015, 12, 12, 10, 30), LocalDateTime.of(2017, 12, 12, 11, 45), "Nuclear", 975.0, "Ka-Band", 23750000.0, 25.0, "Magnetometer", "Camera", 195, false, "In Progress", 95.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-96", "Mission-96", "Mars", "ISRO", 1460.0, LocalDateTime.of(2016, 1, 13, 10, 30), LocalDateTime.of(2018, 1, 13, 11, 45), "Chemical", 980.0, "X-Band", 24000000.0, 26.0, "Camera", "Spectrometer", 196, true, "Success", 96.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-97", "Mission-97", "Moon", "ESA", 1470.0, LocalDateTime.of(2017, 2, 14, 10, 30), LocalDateTime.of(2019, 2, 14, 11, 45), "Solar Electric", 985.0, "S-Band", 24250000.0, 27.0, "Spectrometer", "Radar", 197, false, "Failed", 97.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-98", "Mission-98", "Jupiter", "JAXA", 1480.0, LocalDateTime.of(2018, 3, 15, 10, 30), LocalDateTime.of(2020, 3, 15, 11, 45), "Ion", 990.0, "Ka-Band", 24500000.0, 28.0, "Radar", "Magnetometer", 198, true, "Aborted", 98.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-99", "Mission-99", "Saturn", "SpaceX", 1490.0, LocalDateTime.of(2019, 4, 16, 10, 30), LocalDateTime.of(2021, 4, 16, 11, 45), "Nuclear", 995.0, "X-Band", 24750000.0, 29.0, "Magnetometer", "Camera", 199, false, "In Progress", 99.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-100", "Mission-100", "Venus", "NASA", 1500.0, LocalDateTime.of(2020, 5, 17, 10, 30), LocalDateTime.of(2022, 5, 17, 11, 45), "Chemical", 1000.0, "S-Band", 25000000.0, 30.0, "Camera", "Spectrometer", 200, true, "Success", 0.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-101", "Mission-101", "Pluto", "ISRO", 1510.0, LocalDateTime.of(2021, 6, 18, 10, 30), LocalDateTime.of(2023, 6, 18, 11, 45), "Solar Electric", 1005.0, "Ka-Band", 25250000.0, 31.0, "Spectrometer", "Radar", 201, false, "Failed", 1.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-102", "Mission-102", "Mars", "ESA", 1520.0, LocalDateTime.of(2022, 7, 19, 10, 30), LocalDateTime.of(2024, 7, 19, 11, 45), "Ion", 1010.0, "X-Band", 25500000.0, 32.0, "Radar", "Magnetometer", 202, true, "Aborted", 2.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-103", "Mission-103", "Moon", "JAXA", 1530.0, LocalDateTime.of(2023, 8, 20, 10, 30), LocalDateTime.of(2025, 8, 20, 11, 45), "Nuclear", 1015.0, "S-Band", 25750000.0, 33.0, "Magnetometer", "Camera", 203, false, "In Progress", 3.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-104", "Mission-104", "Jupiter", "SpaceX", 1540.0, LocalDateTime.of(2024, 9, 21, 10, 30), LocalDateTime.of(2026, 9, 21, 11, 45), "Chemical", 1020.0, "Ka-Band", 26000000.0, 34.0, "Camera", "Spectrometer", 204, true, "Success", 4.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-105", "Mission-105", "Saturn", "NASA", 1550.0, LocalDateTime.of(2010, 10, 22, 10, 30), LocalDateTime.of(2012, 10, 22, 11, 45), "Solar Electric", 1025.0, "X-Band", 26250000.0, 35.0, "Spectrometer", "Radar", 205, false, "Failed", 5.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-106", "Mission-106", "Venus", "ISRO", 1560.0, LocalDateTime.of(2011, 11, 23, 10, 30), LocalDateTime.of(2013, 11, 23, 11, 45), "Ion", 1030.0, "S-Band", 26500000.0, 36.0, "Radar", "Magnetometer", 206, true, "Aborted", 6.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-107", "Mission-107", "Pluto", "ESA", 1570.0, LocalDateTime.of(2012, 12, 24, 10, 30), LocalDateTime.of(2014, 12, 24, 11, 45), "Nuclear", 1035.0, "Ka-Band", 26750000.0, 37.0, "Magnetometer", "Camera", 207, false, "In Progress", 7.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-108", "Mission-108", "Mars", "JAXA", 1580.0, LocalDateTime.of(2013, 1, 25, 10, 30), LocalDateTime.of(2015, 1, 25, 11, 45), "Chemical", 1040.0, "X-Band", 27000000.0, 38.0, "Camera", "Spectrometer", 208, true, "Success", 8.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-109", "Mission-109", "Moon", "SpaceX", 1590.0, LocalDateTime.of(2014, 2, 26, 10, 30), LocalDateTime.of(2016, 2, 26, 11, 45), "Solar Electric", 1045.0, "S-Band", 27250000.0, 39.0, "Spectrometer", "Radar", 209, false, "Failed", 9.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-110", "Mission-110", "Jupiter", "NASA", 1600.0, LocalDateTime.of(2015, 3, 27, 10, 30), LocalDateTime.of(2017, 3, 27, 11, 45), "Ion", 1050.0, "Ka-Band", 27500000.0, 40.0, "Radar", "Magnetometer", 210, true, "Aborted", 10.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-111", "Mission-111", "Saturn", "ISRO", 1610.0, LocalDateTime.of(2016, 4, 28, 10, 30), LocalDateTime.of(2018, 4, 28, 11, 45), "Nuclear", 1055.0, "X-Band", 27750000.0, 41.0, "Magnetometer", "Camera", 211, false, "In Progress", 11.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-112", "Mission-112", "Venus", "ESA", 1620.0, LocalDateTime.of(2017, 5, 1, 10, 30), LocalDateTime.of(2019, 5, 1, 11, 45), "Chemical", 1060.0, "S-Band", 28000000.0, 42.0, "Camera", "Spectrometer", 212, true, "Success", 12.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-113", "Mission-113", "Pluto", "JAXA", 1630.0, LocalDateTime.of(2018, 6, 2, 10, 30), LocalDateTime.of(2020, 6, 2, 11, 45), "Solar Electric", 1065.0, "Ka-Band", 28250000.0, 43.0, "Spectrometer", "Radar", 213, false, "Failed", 13.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-114", "Mission-114", "Mars", "SpaceX", 1640.0, LocalDateTime.of(2019, 7, 3, 10, 30), LocalDateTime.of(2021, 7, 3, 11, 45), "Ion", 1070.0, "X-Band", 28500000.0, 44.0, "Radar", "Magnetometer", 214, true, "Aborted", 14.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-115", "Mission-115", "Moon", "NASA", 1650.0, LocalDateTime.of(2020, 8, 4, 10, 30), LocalDateTime.of(2022, 8, 4, 11, 45), "Nuclear", 1075.0, "S-Band", 28750000.0, 45.0, "Magnetometer", "Camera", 215, false, "In Progress", 15.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-116", "Mission-116", "Jupiter", "ISRO", 1660.0, LocalDateTime.of(2021, 9, 5, 10, 30), LocalDateTime.of(2023, 9, 5, 11, 45), "Chemical", 1080.0, "Ka-Band", 29000000.0, 46.0, "Camera", "Spectrometer", 216, true, "Success", 16.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-117", "Mission-117", "Saturn", "ESA", 1670.0, LocalDateTime.of(2022, 10, 6, 10, 30), LocalDateTime.of(2024, 10, 6, 11, 45), "Solar Electric", 1085.0, "X-Band", 29250000.0, 47.0, "Spectrometer", "Radar", 217, false, "Failed", 17.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-118", "Mission-118", "Venus", "JAXA", 1680.0, LocalDateTime.of(2023, 11, 7, 10, 30), LocalDateTime.of(2025, 11, 7, 11, 45), "Ion", 1090.0, "S-Band", 29500000.0, 48.0, "Radar", "Magnetometer", 218, true, "Aborted", 18.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-119", "Mission-119", "Pluto", "SpaceX", 1690.0, LocalDateTime.of(2024, 12, 8, 10, 30), LocalDateTime.of(2026, 12, 8, 11, 45), "Nuclear", 1095.0, "Ka-Band", 29750000.0, 49.0, "Magnetometer", "Camera", 219, false, "In Progress", 19.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-120", "Mission-120", "Mars", "NASA", 1700.0, LocalDateTime.of(2010, 1, 9, 10, 30), LocalDateTime.of(2012, 1, 9, 11, 45), "Chemical", 1100.0, "X-Band", 30000000.0, 10.0, "Camera", "Spectrometer", 220, true, "Success", 20.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-121", "Mission-121", "Moon", "ISRO", 1710.0, LocalDateTime.of(2011, 2, 10, 10, 30), LocalDateTime.of(2013, 2, 10, 11, 45), "Solar Electric", 1105.0, "S-Band", 30250000.0, 11.0, "Spectrometer", "Radar", 221, false, "Failed", 21.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-122", "Mission-122", "Jupiter", "ESA", 1720.0, LocalDateTime.of(2012, 3, 11, 10, 30), LocalDateTime.of(2014, 3, 11, 11, 45), "Ion", 1110.0, "Ka-Band", 30500000.0, 12.0, "Radar", "Magnetometer", 222, true, "Aborted", 22.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-123", "Mission-123", "Saturn", "JAXA", 1730.0, LocalDateTime.of(2013, 4, 12, 10, 30), LocalDateTime.of(2015, 4, 12, 11, 45), "Nuclear", 1115.0, "X-Band", 30750000.0, 13.0, "Magnetometer", "Camera", 223, false, "In Progress", 23.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-124", "Mission-124", "Venus", "SpaceX", 1740.0, LocalDateTime.of(2014, 5, 13, 10, 30), LocalDateTime.of(2016, 5, 13, 11, 45), "Chemical", 1120.0, "S-Band", 31000000.0, 14.0, "Camera", "Spectrometer", 224, true, "Success", 24.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-125", "Mission-125", "Pluto", "NASA", 1750.0, LocalDateTime.of(2015, 6, 14, 10, 30), LocalDateTime.of(2017, 6, 14, 11, 45), "Solar Electric", 1125.0, "Ka-Band", 31250000.0, 15.0, "Spectrometer", "Radar", 225, false, "Failed", 25.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-126", "Mission-126", "Mars", "ISRO", 1760.0, LocalDateTime.of(2016, 7, 15, 10, 30), LocalDateTime.of(2018, 7, 15, 11, 45), "Ion", 1130.0, "X-Band", 31500000.0, 16.0, "Radar", "Magnetometer", 226, true, "Aborted", 26.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-127", "Mission-127", "Moon", "ESA", 1770.0, LocalDateTime.of(2017, 8, 16, 10, 30), LocalDateTime.of(2019, 8, 16, 11, 45), "Nuclear", 1135.0, "S-Band", 31750000.0, 17.0, "Magnetometer", "Camera", 227, false, "In Progress", 27.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-128", "Mission-128", "Jupiter", "JAXA", 1780.0, LocalDateTime.of(2018, 9, 17, 10, 30), LocalDateTime.of(2020, 9, 17, 11, 45), "Chemical", 1140.0, "Ka-Band", 32000000.0, 18.0, "Camera", "Spectrometer", 228, true, "Success", 28.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-129", "Mission-129", "Saturn", "SpaceX", 1790.0, LocalDateTime.of(2019, 10, 18, 10, 30), LocalDateTime.of(2021, 10, 18, 11, 45), "Solar Electric", 1145.0, "X-Band", 32250000.0, 19.0, "Spectrometer", "Radar", 229, false, "Failed", 29.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-130", "Mission-130", "Venus", "NASA", 1800.0, LocalDateTime.of(2020, 11, 19, 10, 30), LocalDateTime.of(2022, 11, 19, 11, 45), "Ion", 1150.0, "S-Band", 32500000.0, 20.0, "Radar", "Magnetometer", 230, true, "Aborted", 30.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-131", "Mission-131", "Pluto", "ISRO", 1810.0, LocalDateTime.of(2021, 12, 20, 10, 30), LocalDateTime.of(2023, 12, 20, 11, 45), "Nuclear", 1155.0, "Ka-Band", 32750000.0, 21.0, "Magnetometer", "Camera", 231, false, "In Progress", 31.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-132", "Mission-132", "Mars", "ESA", 1820.0, LocalDateTime.of(2022, 1, 21, 10, 30), LocalDateTime.of(2024, 1, 21, 11, 45), "Chemical", 1160.0, "X-Band", 33000000.0, 22.0, "Camera", "Spectrometer", 232, true, "Success", 32.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-133", "Mission-133", "Moon", "JAXA", 1830.0, LocalDateTime.of(2023, 2, 22, 10, 30), LocalDateTime.of(2025, 2, 22, 11, 45), "Solar Electric", 1165.0, "S-Band", 33250000.0, 23.0, "Spectrometer", "Radar", 233, false, "Failed", 33.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-134", "Mission-134", "Jupiter", "SpaceX", 1840.0, LocalDateTime.of(2024, 3, 23, 10, 30), LocalDateTime.of(2026, 3, 23, 11, 45), "Ion", 1170.0, "Ka-Band", 33500000.0, 24.0, "Radar", "Magnetometer", 234, true, "Aborted", 34.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-135", "Mission-135", "Saturn", "NASA", 1850.0, LocalDateTime.of(2010, 4, 24, 10, 30), LocalDateTime.of(2012, 4, 24, 11, 45), "Nuclear", 1175.0, "X-Band", 33750000.0, 25.0, "Magnetometer", "Camera", 235, false, "In Progress", 35.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-136", "Mission-136", "Venus", "ISRO", 1860.0, LocalDateTime.of(2011, 5, 25, 10, 30), LocalDateTime.of(2013, 5, 25, 11, 45), "Chemical", 1180.0, "S-Band", 34000000.0, 26.0, "Camera", "Spectrometer", 236, true, "Success", 36.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-137", "Mission-137", "Pluto", "ESA", 1870.0, LocalDateTime.of(2012, 6, 26, 10, 30), LocalDateTime.of(2014, 6, 26, 11, 45), "Solar Electric", 1185.0, "Ka-Band", 34250000.0, 27.0, "Spectrometer", "Radar", 237, false, "Failed", 37.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-138", "Mission-138", "Mars", "JAXA", 1880.0, LocalDateTime.of(2013, 7, 27, 10, 30), LocalDateTime.of(2015, 7, 27, 11, 45), "Ion", 1190.0, "X-Band", 34500000.0, 28.0, "Radar", "Magnetometer", 238, true, "Aborted", 38.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-139", "Mission-139", "Moon", "SpaceX", 1890.0, LocalDateTime.of(2014, 8, 28, 10, 30), LocalDateTime.of(2016, 8, 28, 11, 45), "Nuclear", 1195.0, "S-Band", 34750000.0, 29.0, "Magnetometer", "Camera", 239, false, "In Progress", 39.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-140", "Mission-140", "Jupiter", "NASA", 1900.0, LocalDateTime.of(2015, 9, 1, 10, 30), LocalDateTime.of(2017, 9, 1, 11, 45), "Chemical", 1200.0, "Ka-Band", 35000000.0, 30.0, "Camera", "Spectrometer", 240, true, "Success", 40.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-141", "Mission-141", "Saturn", "ISRO", 1910.0, LocalDateTime.of(2016, 10, 2, 10, 30), LocalDateTime.of(2018, 10, 2, 11, 45), "Solar Electric", 1205.0, "X-Band", 35250000.0, 31.0, "Spectrometer", "Radar", 241, false, "Failed", 41.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-142", "Mission-142", "Venus", "ESA", 1920.0, LocalDateTime.of(2017, 11, 3, 10, 30), LocalDateTime.of(2019, 11, 3, 11, 45), "Ion", 1210.0, "S-Band", 35500000.0, 32.0, "Radar", "Magnetometer", 242, true, "Aborted", 42.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-143", "Mission-143", "Pluto", "JAXA", 1930.0, LocalDateTime.of(2018, 12, 4, 10, 30), LocalDateTime.of(2020, 12, 4, 11, 45), "Nuclear", 1215.0, "Ka-Band", 35750000.0, 33.0, "Magnetometer", "Camera", 243, false, "In Progress", 43.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-144", "Mission-144", "Mars", "SpaceX", 1940.0, LocalDateTime.of(2019, 1, 5, 10, 30), LocalDateTime.of(2021, 1, 5, 11, 45), "Chemical", 1220.0, "X-Band", 36000000.0, 34.0, "Camera", "Spectrometer", 244, true, "Success", 44.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-145", "Mission-145", "Moon", "NASA", 1950.0, LocalDateTime.of(2020, 2, 6, 10, 30), LocalDateTime.of(2022, 2, 6, 11, 45), "Solar Electric", 1225.0, "S-Band", 36250000.0, 35.0, "Spectrometer", "Radar", 245, false, "Failed", 45.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-146", "Mission-146", "Jupiter", "ISRO", 1960.0, LocalDateTime.of(2021, 3, 7, 10, 30), LocalDateTime.of(2023, 3, 7, 11, 45), "Ion", 1230.0, "Ka-Band", 36500000.0, 36.0, "Radar", "Magnetometer", 246, true, "Aborted", 46.0, "Transfer Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-147", "Mission-147", "Saturn", "ESA", 1970.0, LocalDateTime.of(2022, 4, 8, 10, 30), LocalDateTime.of(2024, 4, 8, 11, 45), "Nuclear", 1235.0, "X-Band", 36750000.0, 37.0, "Magnetometer", "Camera", 247, false, "In Progress", 47.0, "Elliptical"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-148", "Mission-148", "Venus", "JAXA", 1980.0, LocalDateTime.of(2023, 5, 9, 10, 30), LocalDateTime.of(2025, 5, 9, 11, 45), "Chemical", 1240.0, "S-Band", 37000000.0, 38.0, "Camera", "Spectrometer", 248, true, "Success", 48.0, "Circular"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SP-149", "Mission-149", "Pluto", "SpaceX", 1990.0, LocalDateTime.of(2024, 6, 10, 10, 30), LocalDateTime.of(2026, 6, 10, 11, 45), "Solar Electric", 1245.0, "Ka-Band", 37250000.0, 39.0, "Spectrometer", "Radar", 249, false, "Failed", 49.0, "Transfer Orbit"));spaceProbeDTOS.add(new SpaceProbeDTO("CER-003","Ceres Polar Explorer","Ceres","NASA",1820.0,LocalDateTime.of(2031,3,12,8,20),LocalDateTime.of(2034,7,15,11,40),"Ion",930.0,"X-Band",414000000.0,8.2,"Polar Camera","Neutron Spectrometer",3400,true,"Cruising",91.0,"Polar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("VES-001","Vesta Mapper","Vesta","ESA",1715.0,LocalDateTime.of(2032,5,19,9,15),LocalDateTime.of(2035,10,12,13,25),"Ion",920.0,"Ka-Band",353000000.0,8.5,"Mineral Mapper","Laser Altimeter",3300,true,"Planned",100.0,"Vesta Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PAL-001","Pallas Observer","Asteroid Pallas","JAXA",1625.0,LocalDateTime.of(2033,2,8,6,40),LocalDateTime.of(2036,6,20,15,30),"Ion",910.0,"X-Band",414000000.0,8.7,"Optical Camera","Infrared Spectrometer",3200,true,"Cruising",88.0,"Asteroid Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HYG-001","Hygiea Explorer","Asteroid Hygiea","NASA",1760.0,LocalDateTime.of(2033,8,16,10,20),LocalDateTime.of(2037,1,25,10,15),"Ion",940.0,"Ka-Band",470000000.0,8.4,"Dust Analyzer","Thermal Camera",3500,true,"Planned",100.0,"Hygiea Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("IDA-001","Ida Surveyor","Asteroid Ida","ESA",1180.0,LocalDateTime.of(2031,11,18,7,30),LocalDateTime.of(2034,8,22,14,45),"Chemical",760.0,"X-Band",430000000.0,9.1,"Stereo Camera","Gamma Spectrometer",2500,true,"Cruising",83.0,"Asteroid Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("GAS-001","Gaspra Mission","Asteroid Gaspra","NASA",1225.0,LocalDateTime.of(2032,4,15,5,50),LocalDateTime.of(2035,2,19,12,40),"Chemical",770.0,"S-Band",395000000.0,8.8,"Surface Imager","Radiometer",2450,true,"Planned",100.0,"Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ERO-001","Eros Orbiter","Asteroid Eros","ESA",1435.0,LocalDateTime.of(2034,1,22,11,15),LocalDateTime.of(2037,5,14,10,30),"Ion",890.0,"Ka-Band",316000000.0,9.3,"Laser Mapper","Dust Detector",3100,true,"Cruising",89.0,"Eros Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("BEN-001","Bennu Mapper","Asteroid Bennu","NASA",1560.0,LocalDateTime.of(2034,9,8,9,10),LocalDateTime.of(2036,11,18,13,20),"Chemical",845.0,"X-Band",334000000.0,8.6,"Surface Camera","Sample Arm",2700,true,"Planned",100.0,"Bennu Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("RYG-001","Ryugu Observer","Asteroid Ryugu","JAXA",1495.0,LocalDateTime.of(2035,3,18,6,45),LocalDateTime.of(2037,7,30,11,25),"Ion",875.0,"Ka-Band",340000000.0,8.5,"Terrain Mapper","LIDAR",2600,true,"Cruising",92.0,"Ryugu Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ITK-001","Itokawa Explorer","Asteroid Itokawa","JAXA",1390.0,LocalDateTime.of(2035,10,5,8,40),LocalDateTime.of(2038,1,21,9,45),"Ion",860.0,"X-Band",320000000.0,8.3,"Navigation Camera","Spectrometer",2500,true,"Planned",100.0,"Itokawa Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TEM-001","Tempel Observer","Comet Tempel 1","ESA",1850.0,LocalDateTime.of(2036,4,12,10,50),LocalDateTime.of(2039,6,14,12,30),"Chemical",980.0,"Ka-Band",500000000.0,10.8,"Comet Camera","Dust Analyzer",3800,true,"Cruising",95.0,"Comet Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("WLD-001","Wild Explorer","Comet Wild 2","NASA",1790.0,LocalDateTime.of(2036,12,18,11,25),LocalDateTime.of(2040,2,22,10,15),"Ion",955.0,"X-Band",610000000.0,11.2,"Collector","Mass Spectrometer",3900,true,"Planned",100.0,"Comet Rendezvous"));
        spaceProbeDTOS.add(new SpaceProbeDTO("BOR-001","Borrelly Mission","Comet Borrelly","ESA",1880.0,LocalDateTime.of(2037,7,14,9,30),LocalDateTime.of(2041,1,19,14,10),"Chemical",990.0,"Ka-Band",640000000.0,10.9,"High Gain Camera","Dust Counter",4000,true,"Cruising",94.0,"Borrelly Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HAL-002","Halley Return","Halley's Comet","NASA",2450.0,LocalDateTime.of(2040,8,21,7,45),LocalDateTime.of(2061,4,18,13,50),"Nuclear",1250.0,"X-Band",5200000000.0,19.0,"Wide Camera","Ion Analyzer",9800,true,"Planned",100.0,"Halley Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TUP-001","Tempel Upgrade","Comet Tempel 2","ESA",1920.0,LocalDateTime.of(2038,6,18,10,35),LocalDateTime.of(2042,8,17,12,25),"Ion",1015.0,"Ka-Band",680000000.0,11.0,"Thermal Camera","Gas Analyzer",4100,true,"Cruising",90.0,"Comet Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("EXP-002","Exoplanet Mapper","Kepler-452b","NASA",5200.0,LocalDateTime.of(2045,1,10,8,30),LocalDateTime.of(2065,6,12,15,20),"Fusion",2200.0,"Laser",1400000000000.0,45.0,"Deep Space Telescope","Planet Analyzer",12000,true,"Concept",100.0,"Interstellar"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ALP-001","Alpha Centauri Probe","Alpha Centauri","NASA",6100.0,LocalDateTime.of(2046,5,16,9,40),LocalDateTime.of(2075,8,19,14,30),"Fusion",2500.0,"Laser",41000000000000.0,60.0,"Star Imager","Radiation Detector",15000,true,"Concept",100.0,"Interstellar"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PRX-001","Proxima Mission","Proxima Centauri b","ESA",6300.0,LocalDateTime.of(2047,7,8,11,20),LocalDateTime.of(2080,2,10,10,15),"Fusion",2600.0,"Laser",40100000000000.0,62.0,"Planet Camera","Life Detector",16000,true,"Concept",100.0,"Interstellar"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SIR-001","Sirius Explorer","Sirius System","NASA",7200.0,LocalDateTime.of(2048,3,19,7,50),LocalDateTime.of(2090,11,15,13,25),"Antimatter",3000.0,"Laser",81000000000000.0,85.0,"Star Mapper","Spectrometer",18000,true,"Concept",100.0,"Deep Space"));
        spaceProbeDTOS.add(new SpaceProbeDTO("BET-001","Betelgeuse Observer","Betelgeuse","ESA",8500.0,LocalDateTime.of(2050,6,14,10,10),LocalDateTime.of(2120,5,10,15,40),"Antimatter",3400.0,"Laser",642000000000000.0,95.0,"Infrared Telescope","Gamma Detector",25000,true,"Concept",100.0,"Interstellar"));
        spaceProbeDTOS.add(new SpaceProbeDTO("AND-001","Andromeda Scout","Andromeda Edge","NASA",9800.0,LocalDateTime.of(2055,2,20,8,15),LocalDateTime.of(2200,7,18,11,20),"Warp Drive",5000.0,"Quantum",2500000000000000.0,500.0,"Quantum Imager","Dark Matter Detector",50000,true,"Concept",100.0,"Galaxy Mission"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MIL-001","Milky Way Mapper","Galactic Center","ESA",9100.0,LocalDateTime.of(2052,10,8,9,30),LocalDateTime.of(2140,4,16,14,25),"Fusion",4100.0,"Quantum",260000000000000.0,180.0,"Galactic Telescope","Gravity Sensor",32000,true,"Concept",100.0,"Galactic Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("QSP-001","Quantum Space Probe","Deep Space","ISRO",5600.0,LocalDateTime.of(2051,11,11,6,20),LocalDateTime.of(2072,3,28,10,15),"Quantum Ion",2750.0,"Quantum",950000000000.0,75.0,"Quantum Scanner","Particle Detector",17000,true,"Concept",100.0,"Deep Space"));
        spaceProbeDTOS.add(new SpaceProbeDTO("DSM-001","Dark Space Mapper","Oort Cloud","NASA",4700.0,LocalDateTime.of(2049,9,17,8,10),LocalDateTime.of(2070,1,30,13,50),"Fusion",2100.0,"Laser",15000000000000.0,70.0,"Dark Matter Sensor","Infrared Camera",20000,true,"Concept",100.0,"Oort Cloud"));
        spaceProbeDTOS.add(new SpaceProbeDTO("OCR-001","Oort Cloud Researcher","Oort Cloud","ESA",4850.0,LocalDateTime.of(2050,12,12,9,50),LocalDateTime.of(2072,9,15,12,30),"Fusion",2150.0,"Laser",15500000000000.0,72.0,"Particle Analyzer","Wide Camera",20500,true,"Concept",100.0,"Outer Solar System"));
        spaceProbeDTOS.add(new SpaceProbeDTO("CER-003","Ceres Polar Explorer","Ceres","NASA",1820.0,LocalDateTime.of(2031,3,12,8,20),LocalDateTime.of(2034,7,15,11,40),"Ion",930.0,"X-Band",414000000.0,8.2,"Polar Camera","Neutron Spectrometer",3400,true,"Cruising",91.0,"Polar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("VES-001","Vesta Mapper","Vesta","ESA",1715.0,LocalDateTime.of(2032,5,19,9,15),LocalDateTime.of(2035,10,12,13,25),"Ion",920.0,"Ka-Band",353000000.0,8.5,"Mineral Mapper","Laser Altimeter",3300,true,"Planned",100.0,"Vesta Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PAL-001","Pallas Observer","Asteroid Pallas","JAXA",1625.0,LocalDateTime.of(2033,2,8,6,40),LocalDateTime.of(2036,6,20,15,30),"Ion",910.0,"X-Band",414000000.0,8.7,"Optical Camera","Infrared Spectrometer",3200,true,"Cruising",88.0,"Asteroid Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HYG-001","Hygiea Explorer","Asteroid Hygiea","NASA",1760.0,LocalDateTime.of(2033,8,16,10,20),LocalDateTime.of(2037,1,25,10,15),"Ion",940.0,"Ka-Band",470000000.0,8.4,"Dust Analyzer","Thermal Camera",3500,true,"Planned",100.0,"Hygiea Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("IDA-001","Ida Surveyor","Asteroid Ida","ESA",1180.0,LocalDateTime.of(2031,11,18,7,30),LocalDateTime.of(2034,8,22,14,45),"Chemical",760.0,"X-Band",430000000.0,9.1,"Stereo Camera","Gamma Spectrometer",2500,true,"Cruising",83.0,"Asteroid Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("GAS-001","Gaspra Mission","Asteroid Gaspra","NASA",1225.0,LocalDateTime.of(2032,4,15,5,50),LocalDateTime.of(2035,2,19,12,40),"Chemical",770.0,"S-Band",395000000.0,8.8,"Surface Imager","Radiometer",2450,true,"Planned",100.0,"Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ERO-001","Eros Orbiter","Asteroid Eros","ESA",1435.0,LocalDateTime.of(2034,1,22,11,15),LocalDateTime.of(2037,5,14,10,30),"Ion",890.0,"Ka-Band",316000000.0,9.3,"Laser Mapper","Dust Detector",3100,true,"Cruising",89.0,"Eros Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("BEN-001","Bennu Mapper","Asteroid Bennu","NASA",1560.0,LocalDateTime.of(2034,9,8,9,10),LocalDateTime.of(2036,11,18,13,20),"Chemical",845.0,"X-Band",334000000.0,8.6,"Surface Camera","Sample Arm",2700,true,"Planned",100.0,"Bennu Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("RYG-001","Ryugu Observer","Asteroid Ryugu","JAXA",1495.0,LocalDateTime.of(2035,3,18,6,45),LocalDateTime.of(2037,7,30,11,25),"Ion",875.0,"Ka-Band",340000000.0,8.5,"Terrain Mapper","LIDAR",2600,true,"Cruising",92.0,"Ryugu Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ITK-001","Itokawa Explorer","Asteroid Itokawa","JAXA",1390.0,LocalDateTime.of(2035,10,5,8,40),LocalDateTime.of(2038,1,21,9,45),"Ion",860.0,"X-Band",320000000.0,8.3,"Navigation Camera","Spectrometer",2500,true,"Planned",100.0,"Itokawa Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TEM-001","Tempel Observer","Comet Tempel 1","ESA",1850.0,LocalDateTime.of(2036,4,12,10,50),LocalDateTime.of(2039,6,14,12,30),"Chemical",980.0,"Ka-Band",500000000.0,10.8,"Comet Camera","Dust Analyzer",3800,true,"Cruising",95.0,"Comet Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("WLD-001","Wild Explorer","Comet Wild 2","NASA",1790.0,LocalDateTime.of(2036,12,18,11,25),LocalDateTime.of(2040,2,22,10,15),"Ion",955.0,"X-Band",610000000.0,11.2,"Collector","Mass Spectrometer",3900,true,"Planned",100.0,"Comet Rendezvous"));
        spaceProbeDTOS.add(new SpaceProbeDTO("BOR-001","Borrelly Mission","Comet Borrelly","ESA",1880.0,LocalDateTime.of(2037,7,14,9,30),LocalDateTime.of(2041,1,19,14,10),"Chemical",990.0,"Ka-Band",640000000.0,10.9,"High Gain Camera","Dust Counter",4000,true,"Cruising",94.0,"Borrelly Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HAL-002","Halley Return","Halley's Comet","NASA",2450.0,LocalDateTime.of(2040,8,21,7,45),LocalDateTime.of(2061,4,18,13,50),"Nuclear",1250.0,"X-Band",5200000000.0,19.0,"Wide Camera","Ion Analyzer",9800,true,"Planned",100.0,"Halley Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TUP-001","Tempel Upgrade","Comet Tempel 2","ESA",1920.0,LocalDateTime.of(2038,6,18,10,35),LocalDateTime.of(2042,8,17,12,25),"Ion",1015.0,"Ka-Band",680000000.0,11.0,"Thermal Camera","Gas Analyzer",4100,true,"Cruising",90.0,"Comet Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("EXP-002","Exoplanet Mapper","Kepler-452b","NASA",5200.0,LocalDateTime.of(2045,1,10,8,30),LocalDateTime.of(2065,6,12,15,20),"Fusion",2200.0,"Laser",1400000000000.0,45.0,"Deep Space Telescope","Planet Analyzer",12000,true,"Concept",100.0,"Interstellar"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ALP-001","Alpha Centauri Probe","Alpha Centauri","NASA",6100.0,LocalDateTime.of(2046,5,16,9,40),LocalDateTime.of(2075,8,19,14,30),"Fusion",2500.0,"Laser",41000000000000.0,60.0,"Star Imager","Radiation Detector",15000,true,"Concept",100.0,"Interstellar"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PRX-001","Proxima Mission","Proxima Centauri b","ESA",6300.0,LocalDateTime.of(2047,7,8,11,20),LocalDateTime.of(2080,2,10,10,15),"Fusion",2600.0,"Laser",40100000000000.0,62.0,"Planet Camera","Life Detector",16000,true,"Concept",100.0,"Interstellar"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SIR-001","Sirius Explorer","Sirius System","NASA",7200.0,LocalDateTime.of(2048,3,19,7,50),LocalDateTime.of(2090,11,15,13,25),"Antimatter",3000.0,"Laser",81000000000000.0,85.0,"Star Mapper","Spectrometer",18000,true,"Concept",100.0,"Deep Space"));
        spaceProbeDTOS.add(new SpaceProbeDTO("BET-001","Betelgeuse Observer","Betelgeuse","ESA",8500.0,LocalDateTime.of(2050,6,14,10,10),LocalDateTime.of(2120,5,10,15,40),"Antimatter",3400.0,"Laser",642000000000000.0,95.0,"Infrared Telescope","Gamma Detector",25000,true,"Concept",100.0,"Interstellar"));
        spaceProbeDTOS.add(new SpaceProbeDTO("AND-001","Andromeda Scout","Andromeda Edge","NASA",9800.0,LocalDateTime.of(2055,2,20,8,15),LocalDateTime.of(2200,7,18,11,20),"Warp Drive",5000.0,"Quantum",2500000000000000.0,500.0,"Quantum Imager","Dark Matter Detector",50000,true,"Concept",100.0,"Galaxy Mission"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MIL-001","Milky Way Mapper","Galactic Center","ESA",9100.0,LocalDateTime.of(2052,10,8,9,30),LocalDateTime.of(2140,4,16,14,25),"Fusion",4100.0,"Quantum",260000000000000.0,180.0,"Galactic Telescope","Gravity Sensor",32000,true,"Concept",100.0,"Galactic Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("QSP-001","Quantum Space Probe","Deep Space","ISRO",5600.0,LocalDateTime.of(2051,11,11,6,20),LocalDateTime.of(2072,3,28,10,15),"Quantum Ion",2750.0,"Quantum",950000000000.0,75.0,"Quantum Scanner","Particle Detector",17000,true,"Concept",100.0,"Deep Space"));
        spaceProbeDTOS.add(new SpaceProbeDTO("DSM-001","Dark Space Mapper","Oort Cloud","NASA",4700.0,LocalDateTime.of(2049,9,17,8,10),LocalDateTime.of(2070,1,30,13,50),"Fusion",2100.0,"Laser",15000000000000.0,70.0,"Dark Matter Sensor","Infrared Camera",20000,true,"Concept",100.0,"Oort Cloud"));
        spaceProbeDTOS.add(new SpaceProbeDTO("OCR-001","Oort Cloud Researcher","Oort Cloud","ESA",4850.0,LocalDateTime.of(2050,12,12,9,50),LocalDateTime.of(2072,9,15,12,30),"Fusion",2150.0,"Laser",15500000000000.0,72.0,"Particle Analyzer","Wide Camera",20500,true,"Concept",100.0,"Outer Solar System"));spaceProbeDTOS.add(new SpaceProbeDTO("EXM-001","ExoMars Rover","Mars","ESA",310.0,LocalDateTime.of(2028,9,20,10,15),LocalDateTime.of(2029,6,10,14,20),"Chemical",480.0,"X-Band",225000000.0,4.5,"PanCam","Raman Spectrometer",2180,true,"Planned",100.0,"Mars Surface"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LUN-029","Lunar Pathfinder","Moon","UK Space Agency",450.0,LocalDateTime.of(2027,11,18,9,30),LocalDateTime.of(2027,12,2,12,40),"Chemical",350.0,"S-Band",384400.0,1.6,"Communication Payload","Laser Reflector",1800,true,"Planned",100.0,"Lunar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("VMO-001","Venus Mapping Orbiter","Venus","NASA",2100.0,LocalDateTime.of(2032,8,14,8,20),LocalDateTime.of(2033,2,10,10,30),"Chemical",1120.0,"Ka-Band",41000000.0,7.3,"Synthetic Aperture Radar","Infrared Mapper",2600,true,"Planned",100.0,"Venus Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MSE-001","Mars Sample Explorer","Mars","NASA",2850.0,LocalDateTime.of(2033,6,12,7,45),LocalDateTime.of(2034,3,18,15,10),"Chemical",1380.0,"X-Band",225000000.0,5.1,"Sample Collector","Storage Module",3500,true,"Planned",100.0,"Mars Landing"));
        spaceProbeDTOS.add(new SpaceProbeDTO("EUR-003","Europa Ice Scanner","Europa","ESA",3200.0,LocalDateTime.of(2034,10,8,9,20),LocalDateTime.of(2041,4,14,11,50),"Nuclear",1520.0,"Ka-Band",628300000.0,13.8,"Ice Radar","Cryogenic Sampler",4800,true,"Planned",100.0,"Europa Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TTN-002","Titan Orbital Mapper","Titan","NASA",3650.0,LocalDateTime.of(2035,12,18,10,40),LocalDateTime.of(2043,5,20,14,15),"Nuclear",1625.0,"X-Band",1400000000.0,6.4,"Methane Analyzer","Cloud Camera",6200,true,"Planned",100.0,"Titan Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ENC-002","Enceladus Ice Probe","Enceladus","ESA",3400.0,LocalDateTime.of(2036,9,6,11,10),LocalDateTime.of(2044,8,25,13,30),"Ion",1490.0,"Ka-Band",1275000000.0,7.0,"Ice Drill","Water Analyzer",5600,true,"Planned",100.0,"Enceladus Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("MRC-001","Mercury Climate Probe","Mercury","ISRO",1850.0,LocalDateTime.of(2031,4,20,8,45),LocalDateTime.of(2036,7,12,10,50),"Ion",980.0,"X-Band",91600000.0,8.3,"Solar Spectrometer","Temperature Sensor",3900,true,"Planned",100.0,"Mercury Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("AST-002","Asteroid Resource Mission","Asteroid Psyche","NASA",2500.0,LocalDateTime.of(2037,5,18,7,30),LocalDateTime.of(2040,11,22,14,45),"Ion",1150.0,"Ka-Band",450000000.0,9.4,"Mining Scanner","Metal Detector",4500,true,"Concept",100.0,"Asteroid Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("KUP-001","Kuiper Explorer","Kuiper Belt","ESA",3100.0,LocalDateTime.of(2038,3,16,9,10),LocalDateTime.of(2051,9,18,15,20),"Nuclear",1400.0,"X-Band",6100000000.0,17.5,"Wide Camera","Dust Analyzer",7300,true,"Planned",100.0,"Kuiper Belt"));
        spaceProbeDTOS.add(new SpaceProbeDTO("SOL-002","Solar Wind Observer","Sun","NASA",950.0,LocalDateTime.of(2029,8,11,6,25),LocalDateTime.of(2029,11,20,10,15),"Solar Electric",890.0,"Ka-Band",149600000.0,38.0,"Solar Wind Sensor","Magnetometer",5000,true,"Active",79.0,"Solar Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("HEL-001","Helios Successor","Sun","DLR",780.0,LocalDateTime.of(2030,5,22,10,40),LocalDateTime.of(2030,8,28,11,55),"Solar Electric",760.0,"S-Band",149600000.0,41.5,"Radiation Monitor","UV Spectrometer",4200,true,"Planned",100.0,"Heliocentric Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("PLU-002","Pluto Explorer","Pluto","NASA",3450.0,LocalDateTime.of(2039,10,15,7,20),LocalDateTime.of(2052,12,16,12,40),"Nuclear",1480.0,"Ka-Band",5900000000.0,15.2,"Surface Mapper","Ice Analyzer",7600,true,"Planned",100.0,"Pluto Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("TRI-002","Triton Orbiter","Triton","ESA",3700.0,LocalDateTime.of(2040,11,18,8,35),LocalDateTime.of(2053,7,20,13,45),"Nuclear",1560.0,"X-Band",4500000000.0,15.9,"Cryogenic Camera","Gravity Sensor",7800,true,"Planned",100.0,"Triton Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("NEP-002","Neptune Atmosphere Probe","Neptune","NASA",5400.0,LocalDateTime.of(2041,6,12,9,15),LocalDateTime.of(2054,10,18,14,25),"Nuclear",1820.0,"Ka-Band",4500000000.0,16.6,"Atmospheric Analyzer","Pressure Sensor",8200,true,"Planned",100.0,"Neptune Descent"));
        spaceProbeDTOS.add(new SpaceProbeDTO("URA-002","Uranus Climate Orbiter","Uranus","ESA",5100.0,LocalDateTime.of(2042,4,8,10,20),LocalDateTime.of(2055,12,12,15,15),"Nuclear",1760.0,"X-Band",2900000000.0,15.4,"Cloud Imager","Infrared Spectrometer",8100,true,"Planned",100.0,"Uranus Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LGM-001","Lagrange Monitor","L1","NASA",820.0,LocalDateTime.of(2031,1,10,8,50),LocalDateTime.of(2031,2,2,11,20),"Chemical",620.0,"S-Band",1500000.0,0.9,"Solar Camera","Particle Detector",4500,true,"Active",86.0,"L1 Halo Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ORB-002","Orbital Debris Observer","Low Earth Orbit","ESA",680.0,LocalDateTime.of(2028,7,14,6,40),LocalDateTime.of(2028,7,15,10,10),"Chemical",540.0,"S-Band",550.0,7.8,"Debris Radar","Optical Camera",3650,true,"Active",70.0,"Earth Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("EAR-001","Earth Observation Next","Earth","ISRO",1450.0,LocalDateTime.of(2029,9,18,11,35),LocalDateTime.of(2029,9,19,9,20),"Chemical",910.0,"X-Band",700.0,7.6,"Multispectral Camera","SAR",5400,true,"Active",88.0,"Sun Synchronous Orbit"));
        spaceProbeDTOS.add(new SpaceProbeDTO("COM-002","Comet Dust Explorer","Comet Encke","NASA",1680.0,LocalDateTime.of(2036,10,15,9,10),LocalDateTime.of(2039,4,20,12,35),"Ion",930.0,"Ka-Band",420000000.0,11.4,"Dust Collector","Mass Spectrometer",4100,true,"Planned",100.0,"Comet Flyby"));
        spaceProbeDTOS.add(new SpaceProbeDTO("ICE-002","Ice Giant Surveyor","Ice Giants","ESA",5600.0,LocalDateTime.of(2043,3,14,8,20),LocalDateTime.of(2058,7,12,14,30),"Nuclear",1880.0,"X-Band",3500000000.0,16.3,"Magnetometer","Atmospheric Probe",9200,true,"Concept",100.0,"Multi-Planet Tour"));
        spaceProbeDTOS.add(new SpaceProbeDTO("LAV-001","Lava World Explorer","55 Cancri e","NASA",6300.0,LocalDateTime.of(2050,5,10,7,15),LocalDateTime.of(2090,10,18,11,25),"Fusion",2550.0,"Laser",41000000000000.0,82.0,"Thermal Camera","Surface Analyzer",18500,true,"Concept",100.0,"Interstellar"));
        spaceProbeDTOS.add(new SpaceProbeDTO("OCE-001","Ocean World Probe","Europa Ocean","ESA",3900.0,LocalDateTime.of(2038,11,18,9,35),LocalDateTime.of(2046,4,15,13,20),"Nuclear",1650.0,"Ka-Band",628300000.0,13.2,"Cryobot","Water Analyzer",6500,true,"Concept",100.0,"Subsurface Mission"));
        spaceProbeDTOS.add(new SpaceProbeDTO("BIO-001","BioSearch Explorer","Mars","NASA",2750.0,LocalDateTime.of(2034,1,12,10,10),LocalDateTime.of(2034,10,8,15,15),"Chemical",1350.0,"X-Band",225000000.0,5.2,"DNA Analyzer","Soil Laboratory",4300,true,"Concept",100.0,"Mars Biosignature"));
        spaceProbeDTOS.add(new SpaceProbeDTO("UNI-001","Universe Boundary Explorer","Observable Universe","International Space Consortium",12000.0,LocalDateTime.of(2090,1,1,0,0),LocalDateTime.of(2250,1,1,0,0),"Warp Drive",8000.0,"Quantum",47000000000000000.0,1500.0,"Universal Telescope","Cosmic Boundary Sensor",120000,true,"Concept",100.0,"Universal Edge"));

        Iterator<SpaceProbeDTO> space= spaceProbeDTOS.iterator();
        int count = 0;
        while (space.hasNext()) {
            SpaceProbeDTO dto = space.next();
            if ("Success".equals(dto.getStatus())) {
                count++;
            }
        }
        Iterator<SpaceProbeDTO> iterator1 = spaceProbeDTOS.iterator();
        int count1 = 0;
        while (iterator1.hasNext()) {
            SpaceProbeDTO dto = iterator1.next();
            if ("Solar Electric".equals(dto.getPropulsionType())) {
                count1++;
            }
        }
        System.out.println("Solar Electric Count : " + count1);

        Iterator<SpaceProbeDTO> iterator2 = spaceProbeDTOS.iterator();
        int count2 = 0;

        while (iterator2.hasNext()) {
            SpaceProbeDTO dto = iterator2.next();
            if (dto.isActive()) {
                count2++;
            }
        }
        System.out.println("Active Probes : " + count2);

        Iterator<SpaceProbeDTO> iterator3 = spaceProbeDTOS.iterator();
        int count3 = 0;
        while (iterator3.hasNext()) {
            SpaceProbeDTO dto = iterator3.next();
            if ("Mars".equals(dto.getTargetCelestialBody())) {
                count3++;
            }
        }
        System.out.println("Mars Probes : " + count3);

        Iterator<SpaceProbeDTO> iterator4 = spaceProbeDTOS.iterator();
        int count4 = 0;
        while (iterator4.hasNext()) {
            SpaceProbeDTO dto = iterator4.next();

            if (dto.getFuelRemaining() < 50) {
                count4++;
            }
        }
        System.out.println("Fuel < 50 : " + count4);

        Iterator<SpaceProbeDTO> iterator5 = spaceProbeDTOS.iterator();
        int count5 = 0;
        while (iterator5.hasNext()) {
            SpaceProbeDTO dto = iterator5.next();
            if ("NASA".equals(dto.getManufacturer())) {
                count5++;
            }
        }
        System.out.println("NASA Probes : " + count5);

        Iterator<SpaceProbeDTO> iterator6= spaceProbeDTOS.iterator();
        int count6 = 0;
        while (iterator6.hasNext()) {
            SpaceProbeDTO dto = iterator6.next();
            if (dto.getMissionDurationDays() > 365) {
                count6++;
            }
        }
        System.out.println("Mission > 365 Days : " + count6);

        Iterator<SpaceProbeDTO> iterator7 = spaceProbeDTOS.iterator();
        int count7 = 0;
        while (iterator7.hasNext()) {
            SpaceProbeDTO dto = iterator7.next();
            if (dto.getPowerOutput() > 1000) {
                count7++;
            }
        }
        System.out.println("Power > 1000 : " + count7);

        Iterator<SpaceProbeDTO> iterator8 = spaceProbeDTOS.iterator();
        int count8 = 0;
        while (iterator8.hasNext()) {
            SpaceProbeDTO dto = iterator8.next();
            if (dto.getDistanceFromEarth() <= 1000000) {
                count8++;
            }
        }
        System.out.println("Within 1 Million KM : " + count8);

        Iterator<SpaceProbeDTO> iterator9 = spaceProbeDTOS.iterator();
        int count9 = 0;
        while (iterator9.hasNext()) {
            SpaceProbeDTO dto = iterator9.next();
            if ("Camera".equals(dto.getPrimaryInstrument())) {
                count9++;
            }
        }
        System.out.println("Camera Instrument : " + count9);


        Iterator<SpaceProbeDTO> iterator10 = spaceProbeDTOS.iterator();
        int count10 = 0;
        while (iterator10.hasNext()) {
            SpaceProbeDTO dto = iterator10.next();
            if ("Failed".equals(dto.getStatus())) {
                count10++;
            }
        }
        System.out.println("Failed Probes : " + count10);

        Iterator<SpaceProbeDTO> iterator11 = spaceProbeDTOS.iterator();
        int count11 = 0;
        while (iterator11.hasNext()) {
            SpaceProbeDTO dto = iterator11.next();
            if (dto.getLaunchDate().isAfter(LocalDateTime.of(2020, 1, 1, 0, 0))) {
                count11++;
            }
        }

        System.out.println("Launched After 2020 : " + count11);

        Iterator<SpaceProbeDTO> iterator12 = spaceProbeDTOS.iterator();
        int count12 = 0;

        while (iterator12.hasNext()) {
            SpaceProbeDTO dto = iterator12.next();

            if (dto.getOrbitalVelocity() > 30) {
                count++;
            }
        }

        System.out.println("Orbital Velocity > 30 : " + count12);

        Iterator<SpaceProbeDTO> iterator13 = spaceProbeDTOS.iterator();
        int count13= 0;
        while (iterator13.hasNext()) {
            SpaceProbeDTO dto = iterator13.next();
            if (dto.getLaunchMass() > 1000) {
                count13++;
            }
        }
        System.out.println("Launch Mass > 1000 : " + count13);

        Iterator<SpaceProbeDTO> iterator14 = spaceProbeDTOS.iterator();
        int count14 = 0;
        while (iterator14.hasNext()) {
            SpaceProbeDTO dto = iterator14.next();
            if ("X-Band".equals(dto.getCommunicationFrequency())) {
                count14++;
            }
        }
        System.out.println("X-Band Probes : " + count14);

        Iterator<SpaceProbeDTO> iterator=spaceProbeDTOS.iterator();
        while (iterator.hasNext()) {
            SpaceProbeDTO dto = iterator.next();
            if ("Failed".equals(dto.getStatus())) {
                iterator.remove();
            }
        }
        System.out.println("Failed Probes are Removed");

        Iterator<SpaceProbeDTO> iterator15=spaceProbeDTOS.iterator();
        while (iterator15.hasNext()) {
            SpaceProbeDTO dto = iterator15.next();
            if (dto.getFuelRemaining() < 10) {
                iterator.remove();
            }
        }
        System.out.println("Fuel Less Than 10 Probes are Removed");


        while (iterator.hasNext()) {
            SpaceProbeDTO dto = iterator.next();
            if ("Moon".equals(dto.getTargetCelestialBody())) {
                iterator.remove();
            }
        }
        System.out.println("Moon Probes are Removed");

        Iterator<SpaceProbeDTO> iterator16=spaceProbeDTOS.iterator();
        while (iterator16.hasNext()) {
            SpaceProbeDTO dto = iterator16.next();
            if (dto.getMissionDurationDays() < 100) {
                iterator.remove();
            }
        }
        System.out.println("Mission Duration Less Than 100 Probes are Removed");

        Iterator<SpaceProbeDTO> iterator17=spaceProbeDTOS.iterator();
        while (iterator17.hasNext()) {
            SpaceProbeDTO dto = iterator17.next();
            if ("Chemical".equals(dto.getPropulsionType())) {
                iterator.remove();
            }
        }
        System.out.println("Chemical Propulsion Probes are Removed");


        while (iterator.hasNext()) {
            SpaceProbeDTO dto = iterator.next();
            if (dto.getDistanceFromEarth() > 10000000) {
                iterator.remove();
            }
        }
        System.out.println("Distance Greater Than 10 Million KM Probes are Removed");

        Iterator<SpaceProbeDTO> iterator19=spaceProbeDTOS.iterator();
        while (iterator19.hasNext()) {
            SpaceProbeDTO dto = iterator19.next();
            if (dto.getPowerOutput() < 500) {
                iterator.remove();
            }
        }
        System.out.println("Power Output Less Than 500 Probes are Removed");
    }
}



