package aboutHospital;

public class Patient {
	private String name;
    private int age;
    private String id;
    private String address;
    private String healthHistory;
    public Patient(String name, int age, String id, String address, String healthHistory) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
        this.healthHistory = healthHistory;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHealthHistory() {
        return healthHistory;
    }

    public void setHealthHistory(String healthHistory) {
        this.healthHistory = healthHistory;
    }
    public void printPatientInfo() {
        System.out.println("Hasta Bilgileri:");
        System.out.println("İsim: " + name);
        System.out.println("Yaş: " + age);
        System.out.println("Kimlik Numarası: " + id);
        System.out.println("Adres: " + address);
        System.out.println("Sağlık Geçmişi: " + healthHistory);
    }
}
