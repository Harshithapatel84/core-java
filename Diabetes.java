class Diabetes{

    String patientName;
    int age;
    String gender;
    double bloodSugarLevel;
    double hba1cLevel;
    String diabetesType;
    int diagnosisYear;
    double weight;
    double height;
    String doctorName;
    String hospitalName;
    String medicationName;
    int medicationDoseMg;
    boolean insulinDependent;
    boolean familyHistory;
    boolean regularExercise;
    boolean sugarControl;
    boolean dietControl;
    float bmi;
    String country;

    Diabetes(String patientName, int age, String gender,
             double bloodSugarLevel, double hba1cLevel,
             String diabetesType, int diagnosisYear,
             double weight, double height,
             String doctorName, String hospitalName,
             String medicationName, int medicationDoseMg,
             boolean insulinDependent, boolean familyHistory,
             boolean regularExercise, boolean sugarControl,
             boolean dietControl, float bmi, String country) {

        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.bloodSugarLevel = bloodSugarLevel;
        this.hba1cLevel = hba1cLevel;
        this.diabetesType = diabetesType;
        this.diagnosisYear = diagnosisYear;
        this.weight = weight;
        this.height = height;
        this.doctorName = doctorName;
        this.hospitalName = hospitalName;
        this.medicationName = medicationName;
        this.medicationDoseMg = medicationDoseMg;
        this.insulinDependent = insulinDependent;
        this.familyHistory = familyHistory;
        this.regularExercise = regularExercise;
        this.sugarControl = sugarControl;
        this.dietControl = dietControl;
        this.bmi = bmi;
        this.country = country;
    }

    void displayDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Blood Sugar Level: " + bloodSugarLevel);
        System.out.println("HbA1c Level: " + hba1cLevel);
        System.out.println("Diabetes Type: " + diabetesType);
        System.out.println("Diagnosis Year: " + diagnosisYear);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Medication Name: " + medicationName);
        System.out.println("Medication Dose (mg): " + medicationDoseMg);
        System.out.println("Insulin Dependent: " + insulinDependent);
        System.out.println("Family History: " + familyHistory);
        System.out.println("Regular Exercise: " + regularExercise);
        System.out.println("Sugar Control: " + sugarControl);
        System.out.println("Diet Control: " + dietControl);
        System.out.println("BMI: " + bmi);
        System.out.println("Country: " + country);
    }
}

