import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DAO{

	// Load from file
	static {
		
		String filePath1 = "population.txt"; // Path to file
		String filePath2 = "city.txt"; // Path to file
		String filePath3 = "hospital.txt"; // Path to file
		String filePath4 = "medicine.txt"; // Path to file
		String filePath5 = "doctor.txt"; // Path to file
        try {
			BufferedReader br = new BufferedReader(new FileReader(filePath1));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                State.public_data.total_people = Integer.parseInt(parts[0]);  
                State.public_data.total_tested = Integer.parseInt(parts[1]);  
				State.public_data.total_affected = Integer.parseInt(parts[2]);
				State.public_data.total_cured = Integer.parseInt(parts[3]);
				State.public_data.total_death = Integer.parseInt(parts[4]);
            }
			br.close();

			br = new BufferedReader(new FileReader(filePath2));
			List <City> cities = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
				City c = new City();
                c.city_name = parts[0];  
                c.city_population = Integer.parseInt(parts[1]); 
				State.public_data.total_people += c.city_population; 

				c.tested = Integer.parseInt(parts[2]);
				State.public_data.total_tested += c.tested; 

				c.affected = Integer.parseInt(parts[3]);
				State.public_data.total_affected += c.affected; 

				c.cured = Integer.parseInt(parts[4]);
				State.public_data.total_cured += c.cured; 

				c.death = Integer.parseInt(parts[5]);
				State.public_data.total_death += c.death; 
				cities.add(c);
            }
			State.cities = cities;
			br.close();

			br = new BufferedReader(new FileReader(filePath3));
			List <Hospital> hospitals = new ArrayList<>();
            while ((line = br.readLine()) != null) {
				Hospital h = new Hospital();
                String[] parts = line.split(" ");
                h.hospital_name = parts[0];  
                h.total_beds = Integer.parseInt(parts[1]);  
				h.beds_occupied = Integer.parseInt(parts[2]);
				h.doctors_count = Integer.parseInt(parts[3]);
				h.death = Integer.parseInt(parts[4]);
				hospitals.add(h);
            }
			State.hospitals = hospitals;
			br.close();

			br = new BufferedReader(new FileReader(filePath4));
			List <Medicine> medicines = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
				Medicine m = new Medicine();
                m.medicine_name = parts[0];  
                m.stock = Integer.parseInt(parts[1]);  
				m.efficacy = Integer.parseInt(parts[2]);
				medicines.add(m);
            }
			State.medicines = medicines;
			br.close();

			br = new BufferedReader(new FileReader(filePath5));
			List <Doctor> doctors = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
				Doctor d = new Doctor();
                d.doctor_name = parts[0];  
                d.experience = Integer.parseInt(parts[1]);  
				d.atHospital = parts[2];
				doctors.add(d);
            }
			State.doctors = doctors;
			br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

    public void displayDash(Scanner scan) {
        System.out.println("\n\tData Portal ");
		System.out.println("-> Get Data in (TOTAL, CITY, HOSP, MED, DOC) : ");
		String option = scan.nextLine();
		DAO dao = new DAO();
		
		switch(option){
				case "TOTAL" -> {
					// Display Population Chart
					dao.displayPopulation();
				}
				
				case "CITY" -> {
					// Display City Chart
					System.out.println("Enter the City : ");
					String city = scan.nextLine();
					dao.displayCity(city);
				}
				case "HOSP" -> {
					// Display Hospital Chart
					System.out.println("Enter the Hospital Name : ");
					String hosp = scan.nextLine();
					dao.displayHosp(hosp);
				}
					
				case "MED" -> {
					// Display Medicine Chart
					System.out.println("Enter the Medicine Name : ");
					String med = scan.nextLine();
					dao.displayMed(med);
				}
					
				case "DOC" -> {
					// Display Doctor Chart
					System.out.println("Enter the Doctor Name : ");
					String doc = scan.nextLine();
					dao.displayDoc(doc);
				}
					
				default -> {System.out.println("Please provide valid respose.");}
			}
		}
    private void displayDoc(String doc) {
		State st = new State();
		st.getDoctor(doc).barChart();
	}
	private void displayMed(String med) {
		State st = new State();
		st.getMedicine(med).barChart();
	}
	private void displayHosp(String hosp) {
		State st = new State();
		st.getHospital(hosp).barChart();
	}
	private void displayCity(String city) {
		State st = new State();
		st.getCity(city).barChart();
	}
	private void displayPopulation() {
		State st = new State();
		st.getPopulation().barChart();
	}
	

    public boolean updateCityData(Admin admin, Scanner scan) throws IOException{
		System.out.print("Enter City Name : ");
		State st = new State();
		String city = scan.nextLine();
		City c = st.getCity(city);
		if (c != null) {
			State.cities.remove(c);
		}
		else{
			c = new City();
			c.city_name = city;
			System.out.print("Enter New City Population : ");
			c.city_population = scan.nextInt();
			System.out.print("Enter City Affected Population : ");
			c.affected = scan.nextInt();
			System.out.print("Enter City Tested Population : ");
			c.tested = scan.nextInt();
			System.out.print("Enter City Cured Population : ");
			c.cured = scan.nextInt();
			System.out.print("Enter City Death Population : ");
			c.death = scan.nextInt();
			State.cities.add(c);
		}
		FileWriter fr = new FileWriter("city.txt");
		fr.write(System.lineSeparator());
		fr.write(c.city_name+" "+c.city_population+" "+c.tested+" "+c.affected+" "+c.cured+" "+c.death);
		fr.close();
        return true;
    }

    public boolean updateHospData(Admin admin, Scanner scan) throws IOException {
        System.out.print("Enter Hospital Name : ");
		State st = new State();
		String hosp = scan.nextLine();
		Hospital h = st.getHospital(hosp);
		if (h != null) {
			State.hospitals.remove(h);
		}
		else{
			h= new Hospital();
			h.hospital_name = hosp;
			System.out.print("Enter Total Beds : ");
			h.total_beds = scan.nextInt();
			System.out.print("Enter Beds Occupied : ");
			h.beds_occupied = scan.nextInt();
			System.out.print("Enter Death count : ");
			h.death = scan.nextInt();
			System.out.print("Enter Doctors count : ");
			h.doctors_count = scan.nextInt();
		}
			
		FileWriter fr = new FileWriter("hospital.txt");
		fr.write(System.lineSeparator());
		fr.write(h.hospital_name+" "+h.total_beds+" "+h.beds_occupied+" "+h.doctors_count+" "+h.death);
		fr.close();
        return true;
    }

    public boolean updateMedData(Admin admin, Scanner scan) throws IOException {
        System.out.print("Enter Medicine Name : ");
		State st = new State();
		String med = scan.nextLine();
		Medicine m = st.getMedicine(med);
		if (m != null) {
			State.medicines.remove(m);
		}
		else{
			m = new Medicine();
			m.medicine_name = med;
			System.out.print("Enter Medicine Stock : ");
			m.stock = scan.nextInt();
			System.out.print("Enter Enter Medicine Efficacy : ");
			m.efficacy = scan.nextInt();
		}
		FileWriter fr = new FileWriter("medicine.txt");
		fr.write(System.lineSeparator());
		fr.write(m.medicine_name+" "+m.stock+" "+m.efficacy);
		fr.close();
        return true;
    }

    public boolean updateDocData(Admin admin, Scanner scan) throws IOException{
        System.out.print("Enter Doctor Name : ");
		State st = new State();
		String doc = scan.nextLine();
		Doctor d = st.getDoctor(doc);
		if (d != null) {
			State.doctors.remove(d);
		}
		else{
			d = new Doctor();
			d.doctor_name = doc;
			System.out.print("Enter Doctor Experience : ");
			d.experience = scan.nextInt();
			System.out.print("Enter Doctor working Hospital : ");
			d.atHospital = scan.nextLine();
		}
		FileWriter fr = new FileWriter("doctor.txt");
		fr.write(System.lineSeparator());
		fr.write(d.doctor_name+" "+d.experience+" "+d.atHospital);
		fr.close();
        return true;
    }
	
}