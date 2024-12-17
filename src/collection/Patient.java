package collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface PatientRecord {
	public void addPatient(String patientname,String doctorname,String diagnosis);
	public void displayPatients();
	public void searchPatientByDoctor(String doctorname);

}
public class Patient{
	private String patientname;
	private String doctorname;
	private String diagnosis;
	
	public Patient(String patientname,String doctorname,String diagnosis) {
		this.patientname=patientname;
		this.doctorname=doctorname;
		this.diagnosis=diagnosis;
	}
	//gettersetter
		public String getPatientname() {
			return patientname;
		}
		public void setPatientname(String patientname) {
			this.patientname=patientname;
		}
		public String getDoctorname() {
			return doctorname;
		}
		public void setDoctorname(String doctorname) {
			this.doctorname=doctorname;
		}
		public String getDiagnosis() {
			return diagnosis;
		}
		public void setDiagnosis(String diagnosis) {
			this.diagnosis=diagnosis;
		}
		public String toString() {
			return "Patient : "+patientname+" Doctor : "+doctorname+" Dignosis : "+diagnosis;
		}
		public static void main(String args[]) {
			HospitalRecord hr=new HospitalRecord();
			while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter choice:\n1.Add Patients\n2.display Patients\n3.search Patient by Doctor\n4.Most Diagnosis");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
			System.out.println("Enter Patient's name:");
			sc.nextLine();
			String patientname=sc.nextLine();
			System.out.println("Enter Doctor's name:");
			String doctorname=sc.nextLine();
			System.out.println("Enter diagnosis:");
			String diagnosis=sc.nextLine();
			hr.addPatient(patientname,doctorname,diagnosis);
			break;
			
			case 2:
				hr.displayPatients();
				break;
			case 3:
				System.out.println("Enter Doctor Name:");
				sc.nextLine();
				String doctor=sc.nextLine();
				hr.searchPatientByDoctor(doctor);
				break;
			case 4:
				hr.mostDiagnosis();
			}
			

		}
		}
}
class HospitalRecord implements PatientRecord{
	
	List<Patient> list=new LinkedList<>();
	
	public HospitalRecord(){
		this.list=list;
	}
	
	//methods

	@Override
	public void displayPatients() {
		for(Patient patient:list) {
			System.out.println(patient);
		}
	//	list.forEach(e->System.out.println(e));
		
	}

	@Override
	public void addPatient(String patientname,String doctorname,String diagnosis) {
		Patient patient=new Patient(patientname,doctorname,diagnosis);
		list.add(patient);
		System.out.println("Patient added: "+patient);
		
	}
	public void searchPatientByDoctor(String doctorname) {
		
		for(Patient patient:list) {
			if(patient.getDoctorname().equalsIgnoreCase(doctorname))
				System.out.println("Patient Name: "+patient.getPatientname()+" Diagnosis: "+patient.getDiagnosis());
		}
	}

	public void mostDiagnosis() {
		Map<String, Long> diagnosisCount = list.stream()
                .collect(Collectors.groupingBy(Patient::getPatientname, Collectors.counting()));
		long maxDiagnoses = diagnosisCount.values().stream()
                .max(Long::compareTo).get();
	diagnosisCount.entrySet().stream()
    .filter(entry -> entry.getValue() == maxDiagnoses)
    .forEach(entry -> {
        System.out.println("Patient with most diagnoses: " + entry.getKey() + " with " + entry.getValue() + " diagnoses.");
    });
	}
	
}



