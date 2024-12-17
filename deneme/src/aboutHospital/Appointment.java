package aboutHospital;

import java.time.LocalDateTime;

@SuppressWarnings("unused")
public class Appointment {
	
	private LocalDateTime appointmentDate;
    private Patient patient;
    private Doctor doctor;
    private String status;

    public Appointment(LocalDateTime appointmentDate, Patient patient, Doctor doctor, String status) {
        this.appointmentDate = appointmentDate;
        this.patient = patient;
        this.doctor = doctor;
        this.status = status;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void printAppointmentInfo() {
        System.out.println("Randevu Bilgileri:");
        System.out.println("Hasta: " + patient.getName());
        System.out.println("Doktor: " + doctor.getName());
        System.out.println("Tarih ve Saat: " + appointmentDate);
        System.out.println("Durum: " + status);
    }

    public void completeAppointment() {
        this.status = "Tamamlandı";
        System.out.println(patient.getName() + " için randevu tamamlandı.");
    }

}
