package aboutHospital;

public class Doctor {
    private String name;
    private String specialization;
    private String id;
    private String department;
    private int experienceYears;

    public Doctor(String name, String specialization, String id, String department, int experienceYears) {
        this.name = name;
        this.specialization = specialization;
        this.id = id;
        this.department = department;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void printDoctorInfo() {
        System.out.println("Doktor Bilgileri:");
        System.out.println("İsim: " + name);
        System.out.println("Uzmanlık Alanı: " + specialization);
        System.out.println("Kimlik Numarası: " + id);
        System.out.println("Bölüm: " + department);
        System.out.println("Tecrübe Yılı: " + experienceYears);
    }
    public void startTreatment(Patient patient) {
        System.out.println(this.name + " tarafından " + patient.getName() + " için tedavi başlatıldı.");
    }

}
