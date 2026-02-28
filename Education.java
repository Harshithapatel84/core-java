class Education {

    String institutionName;
    String courseName;
    String degreeType;
    String universityName;
    String location;
    int durationYears;
    int establishedYear;
    int totalStudents;
    int totalFaculty;
    int ranking;
    boolean governmentApproved;
    boolean scholarshipAvailable;
    boolean hostelFacility;
    boolean placementSupport;
    String accreditation;
    String mediumOfInstruction;
    double annualFee;
    float rating;
    String country;
    boolean onlineClasses;

    Education(String institutionName, String courseName, String degreeType,
              String universityName, String location,
              int durationYears, int establishedYear,
              int totalStudents, int totalFaculty, int ranking,
              boolean governmentApproved, boolean scholarshipAvailable,
              boolean hostelFacility, boolean placementSupport,
              String accreditation, String mediumOfInstruction,
              double annualFee, float rating,
              String country, boolean onlineClasses) {

        this.institutionName = institutionName;
        this.courseName = courseName;
        this.degreeType = degreeType;
        this.universityName = universityName;
        this.location = location;
        this.durationYears = durationYears;
        this.establishedYear = establishedYear;
        this.totalStudents = totalStudents;
        this.totalFaculty = totalFaculty;
        this.ranking = ranking;
        this.governmentApproved = governmentApproved;
        this.scholarshipAvailable = scholarshipAvailable;
        this.hostelFacility = hostelFacility;
        this.placementSupport = placementSupport;
        this.accreditation = accreditation;
        this.mediumOfInstruction = mediumOfInstruction;
        this.annualFee = annualFee;
        this.rating = rating;
        this.country = country;
        this.onlineClasses = onlineClasses;
    }

    void displayDetails() {
        System.out.println("Institution Name: " + institutionName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Degree Type: " + degreeType);
        System.out.println("University Name: " + universityName);
        System.out.println("Location: " + location);
        System.out.println("Duration (Years): " + durationYears);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Total Faculty: " + totalFaculty);
        System.out.println("Ranking: " + ranking);
        System.out.println("Government Approved: " + governmentApproved);
        System.out.println("Scholarship Available: " + scholarshipAvailable);
        System.out.println("Hostel Facility: " + hostelFacility);
        System.out.println("Placement Support: " + placementSupport);
        System.out.println("Accreditation: " + accreditation);
        System.out.println("Medium Of Instruction: " + mediumOfInstruction);
        System.out.println("Annual Fee: " + annualFee);
        System.out.println("Rating: " + rating);
        System.out.println("Country: " + country);
        System.out.println("Online Classes: " + onlineClasses);
    }
}

