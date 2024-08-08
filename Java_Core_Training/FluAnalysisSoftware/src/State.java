import java.util.*;
public class State{
	static List <City> cities;
	static List <Hospital> hospitals;
	static Population public_data = new Population();
	static List <Medicine> medicines;
	static List <Doctor> doctors;

	
	public Hospital getHospital(String hosp){
		Iterator <Hospital> iterator = State.hospitals.iterator();
		while (iterator.hasNext()) {
			Hospital h = iterator.next();
			if (h.hospital_name.equals(hosp)) {
				return h;
			}
		}
		return null;
	}
	public City getCity(String city){
		Iterator <City> iterator = State.cities.iterator();
		while (iterator.hasNext()) {
			City c = iterator.next();
			if (c.city_name.equals(city)) {
				return c;
			}
		}
		return null;
	}
	public Population getPopulation(){
		return State.public_data;
	}
	public Medicine getMedicine(String med){
		Iterator <Medicine> iterator = State.medicines.iterator();
		while (iterator.hasNext()) {
			Medicine m = iterator.next();
			if (m.medicine_name.equals(med)) {
				return m;
			}
		}
		return null;
	}
	public Doctor getDoctor(String doc){
		Iterator <Doctor> iterator = State.doctors.iterator();
		while (iterator.hasNext()) {
			Doctor d = iterator.next();
			if (d.doctor_name.equals(doc)) {
				return d;
			}
		}
		return null;
	}
	
}

class BarChart{
	public void barChart(String name, int main, int[] ele, String[] strs) {
		System.out.println("\t"+name);
		for (String s : strs) {
			System.out.print("\t"+s);		
		}System.out.println();

		for (int i = 20; i > 0 ; i--) {
			char dash = '_';
			for (int j = 0; j < ele.length; j++) {
				if ((ele[j]*20/main) >= i) {
					System.out.print("\t\t"+dash);
				}
				else{
					System.out.print("\t \t");
				}
			}
			System.out.println();
			
		}
		System.out.println();
		for (int j : ele) {
			System.out.print("\t \t"+j);		
		}System.out.println();
	}
}

class City extends BarChart{
	String city_name;
	int city_population;
	int tested;
	int affected;
	int cured;
	int death;
	public void barChart() {
		super.barChart(this.city_name, this.city_population, 
		new int[] {this.city_population, this.tested, this.affected, this.cured, this.death}
		, new String[]{"City Population", "Total Tested","Total Affected","Total Cured","Total Death"});
		
	}
	
	
}

class Hospital extends BarChart{
	String hospital_name;
	int total_beds;
	int beds_occupied;
	int doctors_count;
	List <Medicine> medicines_available; 
	List <Doctor> doctors_available;
	int death;
    public void barChart() {
        super.barChart(this.hospital_name, this.total_beds, 
		new int[] {this.total_beds, this.beds_occupied}, new String[] {"Total Beds", "Beds Occupied"});
    }
	
	
}

class Population extends BarChart{
	int total_people;
	int total_tested;
	int total_affected;
	int total_cured;
	int total_death;
    public void barChart() {
		int[] arr = new int[5];
		arr[0] = State.public_data.total_people;
		arr[1] = State.public_data.total_tested;
		arr[2] = State.public_data.total_affected;
		arr[3] = State.public_data.total_cured;
		arr[4] = State.public_data.total_death;
        super.barChart("State", State.public_data.total_people, arr, 
		new String[]{"Total People", "Total Tested","Total Affected","Total Cured","Total Death"});
    }
	
	
}


class Medicine extends BarChart{
	String medicine_name;
	int stock;
	int efficacy;
    public void barChart() {
        super.barChart(this.medicine_name, 10, new int[] {this.stock, this.efficacy}
		, new String[]{"Total Stock","Efficacy"});
    }
	
	
}

class Doctor extends BarChart{
	String doctor_name;
	int experience;
	boolean isAvailable = true;
	String atHospital;
	public void barChart() {
		super.barChart(this.doctor_name, 10, new int[] {this.experience}
		, new String[]{"Experience"});
	}

}