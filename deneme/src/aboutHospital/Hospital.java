package aboutHospital;

public class Hospital {
    public static void main(String[] args) {
    	
    	
    	
    	
        Patient patient1 = new Patient("Ahmet Yılmaz", 45, "12345678901", "İstanbul, Türkiye", "Yüksek tansiyon");
        Doctor doctor1 = new Doctor("Dr. Ali Veli", "Kardiyoloji", "9876543210", "Kardiyoloji", 15);

        // Hasta ve doktor bilgilerini yazdıralım
        patient1.printPatientInfo();
        doctor1.printDoctorInfo();

        // Tedavi başlatma
        doctor1.startTreatment(patient1);
        
    }
}