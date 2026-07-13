package com.xworkz.disease.runner;

import com.xworkz.disease.dto.DiseaseDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DiseaseRunner {
    public static void main(String[] args) {
        List<DiseaseDTO> diseaseDTOS=new ArrayList<>();
        diseaseDTOS.add(new DiseaseDTO(1, "Viral Fever", "Common viral infection", "Fever, body pain", "Virus", "Rest and medicines", "Recoverable", "Maintain hygiene", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(2, "Malaria", "Mosquito-borne disease", "Fever, chills", "Plasmodium", "Antimalarial drugs", "Curable", "Use mosquito nets", "Parasitic"));
        diseaseDTOS.add(new DiseaseDTO(3, "Dengue", "Mosquito-borne viral disease", "High fever, rash", "Dengue virus", "Fluid therapy", "Supportive care", "Avoid mosquito bites", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(4, "Typhoid", "Bacterial infection", "Fever, weakness", "Salmonella typhi", "Antibiotics", "Curable", "Drink clean water", "Bacterial"));
        diseaseDTOS.add(new DiseaseDTO(5, "Tuberculosis", "Lung infection", "Cough, weight loss", "Mycobacterium", "TB medicines", "Curable", "BCG vaccine", "Bacterial"));
        diseaseDTOS.add(new DiseaseDTO(6, "Diabetes", "Metabolic disorder", "Frequent urination", "Insulin deficiency", "Insulin therapy", "No permanent cure", "Healthy diet", "Metabolic"));
        diseaseDTOS.add(new DiseaseDTO(7, "Hypertension", "High blood pressure", "Headache", "Lifestyle", "BP medicines", "Manageable", "Exercise", "Cardiovascular"));
        diseaseDTOS.add(new DiseaseDTO(8, "Asthma", "Respiratory disease", "Wheezing", "Allergens", "Inhalers", "Manageable", "Avoid dust", "Respiratory"));
        diseaseDTOS.add(new DiseaseDTO(9, "Chickenpox", "Viral disease", "Blisters, fever", "Varicella virus", "Antivirals", "Recoverable", "Vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(10, "COVID-19", "Coronavirus infection", "Cough, fever", "SARS-CoV-2", "Supportive treatment", "Depends on severity", "Vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(11, "Pneumonia", "Lung infection", "Chest pain", "Bacteria/Virus", "Antibiotics", "Curable", "Vaccination", "Respiratory"));
        diseaseDTOS.add(new DiseaseDTO(12, "Jaundice", "Liver disorder", "Yellow skin", "Liver damage", "Medical treatment", "Depends on cause", "Avoid alcohol", "Hepatic"));
        diseaseDTOS.add(new DiseaseDTO(13, "Cholera", "Water-borne disease", "Diarrhea", "Vibrio cholerae", "ORS", "Curable", "Safe drinking water", "Bacterial"));
        diseaseDTOS.add(new DiseaseDTO(14, "Migraine", "Neurological disorder", "Severe headache", "Genetics", "Pain relievers", "Manageable", "Avoid stress", "Neurological"));
        diseaseDTOS.add(new DiseaseDTO(15, "Arthritis", "Joint disease", "Joint pain", "Ageing", "Pain management", "Manageable", "Regular exercise", "Musculoskeletal"));
        diseaseDTOS.add(new DiseaseDTO(16, "Common Cold", "Viral respiratory infection", "Sneezing, runny nose", "Rhinovirus", "Rest and fluids", "Recoverable", "Wash hands", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(17, "Influenza", "Seasonal viral infection", "Fever, cough", "Influenza virus", "Antiviral drugs", "Recoverable", "Annual vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(18, "Measles", "Highly contagious viral disease", "Rash, fever", "Measles virus", "Supportive care", "Recoverable", "MMR vaccine", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(19, "Mumps", "Viral infection", "Swollen salivary glands", "Mumps virus", "Pain relief", "Recoverable", "MMR vaccine", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(20, "Polio", "Infectious viral disease", "Muscle weakness", "Poliovirus", "Supportive care", "No cure", "Polio vaccine", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(21, "Rabies", "Fatal viral disease", "Hydrophobia, fever", "Rabies virus", "Post-exposure vaccine", "Rare after symptoms", "Animal vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(22, "Hepatitis B", "Liver infection", "Fatigue, jaundice", "HBV", "Antiviral medicines", "Manageable", "Vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(23, "Leprosy", "Chronic bacterial disease", "Skin lesions", "Mycobacterium leprae", "Multi-drug therapy", "Curable", "Early diagnosis", "Bacterial"));
        diseaseDTOS.add(new DiseaseDTO(24, "Whooping Cough", "Respiratory infection", "Severe cough", "Bordetella pertussis", "Antibiotics", "Curable", "Vaccination", "Bacterial"));
        diseaseDTOS.add(new DiseaseDTO(25, "Tetanus", "Nervous system infection", "Muscle stiffness", "Clostridium tetani", "Antitoxin", "Difficult after symptoms", "Tetanus vaccine", "Bacterial"));
        diseaseDTOS.add(new DiseaseDTO(26, "Appendicitis", "Appendix inflammation", "Abdominal pain", "Appendix blockage", "Surgery", "Curable", "Early treatment", "Inflammatory"));
        diseaseDTOS.add(new DiseaseDTO(27, "Gastritis", "Stomach lining inflammation", "Stomach pain", "H. pylori", "Antacids", "Manageable", "Healthy diet", "Gastrointestinal"));
        diseaseDTOS.add(new DiseaseDTO(28, "Anemia", "Low red blood cells", "Fatigue", "Iron deficiency", "Iron supplements", "Curable", "Iron-rich diet", "Hematological"));
        diseaseDTOS.add(new DiseaseDTO(29, "Osteoporosis", "Weak bones", "Bone fractures", "Calcium deficiency", "Calcium supplements", "Manageable", "Exercise", "Skeletal"));
        diseaseDTOS.add(new DiseaseDTO(30, "Glaucoma", "Eye disease", "Vision loss", "High eye pressure", "Eye drops", "Manageable", "Regular eye checkups", "Ophthalmic"));
        diseaseDTOS.add(new DiseaseDTO(31, "Bronchitis", "Inflammation of bronchial tubes", "Cough, mucus", "Virus or bacteria", "Antibiotics and rest", "Recoverable", "Avoid smoking", "Respiratory"));
        diseaseDTOS.add(new DiseaseDTO(32, "Sinusitis", "Sinus inflammation", "Headache, nasal congestion", "Infection", "Decongestants", "Curable", "Maintain hygiene", "Respiratory"));
        diseaseDTOS.add(new DiseaseDTO(33, "Conjunctivitis", "Eye infection", "Red eyes, itching", "Virus or bacteria", "Eye drops", "Curable", "Avoid touching eyes", "Ophthalmic"));
        diseaseDTOS.add(new DiseaseDTO(34, "Eczema", "Skin inflammation", "Itching, rash", "Allergy", "Moisturizers", "Manageable", "Avoid allergens", "Dermatological"));
        diseaseDTOS.add(new DiseaseDTO(35, "Psoriasis", "Autoimmune skin disease", "Scaly skin", "Immune disorder", "Topical creams", "Manageable", "Healthy lifestyle", "Autoimmune"));
        diseaseDTOS.add(new DiseaseDTO(36, "Parkinson's Disease", "Nervous system disorder", "Tremors", "Loss of dopamine cells", "Medications", "No permanent cure", "Regular exercise", "Neurological"));
        diseaseDTOS.add(new DiseaseDTO(37, "Alzheimer's Disease", "Memory disorder", "Memory loss", "Brain cell damage", "Medications", "No permanent cure", "Mental exercises", "Neurological"));
        diseaseDTOS.add(new DiseaseDTO(38, "Epilepsy", "Brain disorder", "Seizures", "Abnormal brain activity", "Anti-seizure drugs", "Manageable", "Take medicines regularly", "Neurological"));
        diseaseDTOS.add(new DiseaseDTO(39, "Heart Attack", "Blocked blood flow to heart", "Chest pain", "Coronary artery blockage", "Emergency treatment", "Depends on severity", "Healthy lifestyle", "Cardiovascular"));
        diseaseDTOS.add(new DiseaseDTO(40, "Stroke", "Brain blood supply interruption", "Weakness, speech difficulty", "Blood clot", "Emergency treatment", "Depends on severity", "Control BP", "Neurological"));
        diseaseDTOS.add(new DiseaseDTO(41, "Kidney Stones", "Mineral deposits in kidneys", "Severe back pain", "Calcium buildup", "Medicines or surgery", "Curable", "Drink plenty of water", "Renal"));
        diseaseDTOS.add(new DiseaseDTO(42, "Chronic Kidney Disease", "Progressive kidney damage", "Fatigue, swelling", "Diabetes, hypertension", "Dialysis", "Manageable", "Healthy diet", "Renal"));
        diseaseDTOS.add(new DiseaseDTO(43, "Liver Cirrhosis", "Liver scarring", "Fatigue, swelling", "Alcohol, hepatitis", "Medical management", "Manageable", "Avoid alcohol", "Hepatic"));
        diseaseDTOS.add(new DiseaseDTO(44, "Pancreatitis", "Pancreas inflammation", "Abdominal pain", "Gallstones, alcohol", "Hospital treatment", "Curable", "Avoid alcohol", "Gastrointestinal"));
        diseaseDTOS.add(new DiseaseDTO(45, "Peptic Ulcer", "Sores in stomach lining", "Burning stomach pain", "H. pylori", "Antibiotics and antacids", "Curable", "Avoid spicy food", "Gastrointestinal"));

        System.out.println("total diseases:"+diseaseDTOS.size());

        diseaseDTOS.stream()
                .filter(disease->disease.getName().length()>5)
                .map(disease->disease.getName())
                .forEach(d-> System.out.println(d));

        Long count=diseaseDTOS.stream()
                .filter(disease -> disease.getName().length() > 5)
                .count();
        System.out.println("count:"+count);

        System.out.println("-------------------------------------------");

        diseaseDTOS.stream().filter(disease->disease.getName().startsWith("M"))
        .map(disease->disease.getName())
                .forEach(System.out::println);

        System.out.println("---------------------------------------------");

        diseaseDTOS.stream()
        .map(diseaseDTO -> diseaseDTO.getName().toUpperCase()).forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream().map(diseaseDTO -> diseaseDTO.getName().toLowerCase()).forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .map(diseaseDTO -> diseaseDTO.getName().length())
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getId() > 10)
                .map(diseaseDTO -> diseaseDTO.getId() * 2)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getName().startsWith("A"))
                .filter(diseaseDTO -> diseaseDTO.getName().length() > 5)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------");

        diseaseDTOS.stream()
                .map(diseaseDTO -> diseaseDTO.getDescription())
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------");

        diseaseDTOS.stream()
                .map(diseaseDTO -> diseaseDTO.getCure().startsWith("M"))
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .map(diseaseDTO->diseaseDTO.getSymptoms())
                .sorted()
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .sorted((p1, p2) -> p2.getPrevention().compareTo(p1.getPrevention()))
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .sorted((d1, d2) -> d1.getName().compareTo(d2.getName()))
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .sorted((d1, d2) -> {
                    int result = d1.getCause().compareTo(d2.getCause());
                    if (result == 0) {
                        return d1.getName().compareTo(d2.getName());
                    }
                    return result;
                })
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getTreatment() != null)
                .sorted((d1, d2) -> d1.getTreatment().compareTo(d2.getTreatment()))
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .sorted((d1, d2) -> d2.getPrevention().compareTo(d1.getPrevention()))
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .map(diseaseDTO -> diseaseDTO.getName())
                .sorted((s1, s2) -> s1.length() - s2.length())
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .map(diseaseDTO -> diseaseDTO.getName())
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .sorted((d1, d2) -> d1.getDescription().length() - d2.getDescription().length())
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        ArrayList<String> list = diseaseDTOS.stream()
                .map(diseaseDTO -> diseaseDTO.getName())
                .collect(Collectors.toCollection(() -> new ArrayList<>()));

        System.out.println(list);

        System.out.println("--------------------------------");

        HashSet<String> set = diseaseDTOS.stream()
                .map(diseaseDTO -> diseaseDTO.getName())
                .collect(Collectors.toCollection(() -> new HashSet<>()));

        System.out.println(set);

        System.out.println("--------------------------------");

        System.out.println(
                diseaseDTOS.stream()
                        .noneMatch(diseaseDTO -> diseaseDTO.getName().startsWith("Z")));

        System.out.println("--------------------------------");

        System.out.println(
                diseaseDTOS.stream().anyMatch(diseaseDTO -> diseaseDTO.getCause().startsWith("V")));

        System.out.println("--------------------------------");

        System.out.println(
                diseaseDTOS.stream().allMatch(diseaseDTO -> diseaseDTO.getId() > 0));

        System.out.println("--------------------------------");

        System.out.println(
                diseaseDTOS.stream().findFirst());

        System.out.println("--------------------------------");

        System.out.println(
                diseaseDTOS.parallelStream().findAny());

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .map(diseaseDTO -> diseaseDTO.getCause())
                .distinct()
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .skip(10)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.parallelStream()
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        DiseaseDTO[] diseases = diseaseDTOS.toArray(new DiseaseDTO[0]);

        Arrays.stream(diseases).forEach(System.out::println);

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getSymptoms().contains("Fever"))
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        System.out.println(
                diseaseDTOS.stream().collect(Collectors.groupingBy(diseaseDTO -> diseaseDTO.getEtiology())));

        System.out.println("--------------------------------");

        System.out.println(
                diseaseDTOS.stream().collect(Collectors.partitioningBy(diseaseDTO -> diseaseDTO.getCure() != null)));

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .sorted((d1, d2) -> {
                    int result = d1.getCure().compareTo(d2.getCure());
                    if (result == 0) {
                        return d1.getTreatment().compareTo(d2.getTreatment());
                    }
                    return result;
                })
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        System.out.println(
                diseaseDTOS.stream().collect(Collectors.toMap(
                                diseaseDTO -> diseaseDTO.getName(),
                                diseaseDTO -> diseaseDTO.getDescription())));

        System.out.println("--------------------------------");

        System.out.println(
                diseaseDTOS.stream()
                        .filter(diseaseDTO -> diseaseDTO.getCause().equalsIgnoreCase("Virus")).findFirst());

        System.out.println("--------------------------------");

        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO != null)
                .forEach(System.out::println);

        System.out.println("--------------------------------");














    }
}
