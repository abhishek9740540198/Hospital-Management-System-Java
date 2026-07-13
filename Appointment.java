public class Appointment {
    int appointmentId;
    Patient patient;
    Doctor doctor;
    String date;
    String time;

    public Appointment(int appointmentId, Patient patient, Doctor doctor, String date, String time) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    public void display() {
        System.out.println("-----------------------------------------");
        System.out.println("Appointment ID : " + appointmentId);
        System.out.println("Patient Name   : " + patient.name);
        System.out.println("Doctor Name    : " + doctor.name);
        System.out.println("Specialization : " + doctor.specialization);
        System.out.println("Date           : " + date);
        System.out.println("Time           : " + time);
    }
}
