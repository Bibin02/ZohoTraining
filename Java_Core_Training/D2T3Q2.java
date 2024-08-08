/*
2(L3).Create a simple hospital management system using inheritance in Java
*/
public class D2T3Q2 {
    public static void main(String[] args) {

        // Hospital 1 Created withour SR Dr as manager.
        Hospital hsptl = new Hospital();
        hsptl.manage();
        Patient p1 = new Patient("A", "Heart");
        Patient p2 = new Patient("B", "Lungs");
        Patient p3 = new Patient("C", "something");
        Patient p4 = new Patient("D", "don't know");
        hsptl.addPatient(p1);
        hsptl.addPatient(p2);
        hsptl.addPatient(p3);
        hsptl.addPatient(p4);

        // Again patients become ill due to poor manager

        // Hospital 2 with Senior Dr as manager
        Hospital hspt2 = new SeniorDoctor();
        System.out.println("\n");
        hspt2.manage();
        hspt2.heal();
        hspt2.addPatient(p1);
        hspt2.addPatient(p2);
        hspt2.addPatient(p3);
        hspt2.addPatient(p4);

        // Again patients go to check the hospital Quality
        System.out.println("\n");
        hspt2.addPatient(p1);
        hspt2.addPatient(p2);
        hspt2.addPatient(p3);
        hspt2.addPatient(p4);
    }
}

class Hospital{

    void manage(){
        System.out.println("Someone is managing me");
    }

    void heal(){
        System.out.println("Hospital heals");
    }

    void addPatient(Patient p){
        if (!p.isFine) {
            System.out.println("\nPatient "+p.name+" Admited");
            if (p.problemIn == "Heart") {
                Doctor dd = new Cardiologist();
                dd.heal();
                // p.isFine = true;
            }
            else if (p.problemIn == "Lungs") {
                Doctor dd = new Pulmonologist();
                dd.heal();
                // p.isFine = true;
            }
            else if (p.problemIn == "something") {
                Doctor dd = new SeniorDoctor();
                dd.heal();
                // p.isFine = true;
            }
            else{
                Doctor dd = new Doctor();
                dd.heal();
                // p.isFine = true;
            }

        }
        else{
            System.out.println("Patient Alright");
        }
    }


}

class Doctor extends Hospital{
    String name;
    String speciality = null;

    @Override
    void heal(){
        System.out.println("I'm Healing");
        giveMedicine();
    }

    void giveMedicine(){
        System.out.println("I'm pescribing Medicine");
    }
}

class Cardiologist extends Doctor{
    String name = "CDX";
    String speciality = "Heart";

    @Override
    void heal(){
        System.out.println(name+" I'm Healing The "+speciality);
        giveMedicine();
    }

    
}

class Pulmonologist extends Doctor{
    String name = "PMX";
    String speciality = "Lungs";

    @Override
    void heal(){
        System.out.println(name+" I'm Healing The "+speciality);
        giveMedicine();
    }
}

class SeniorDoctor extends Doctor{
    String name = "SDR";
    String speciality = "Everything";

    @Override
    void heal(){
        System.out.println(name+" I'm Healing "+speciality);
        giveMedicine();
    }

    @Override
    void manage(){
        System.out.println("I'm Senior doctor managing the hospital");
    }

    @Override
    void addPatient(Patient p) {
        if (!p.isFine) {
            System.out.println("\nPatient "+p.name+" Admited");
            if (p.problemIn == "Heart") {
                Doctor dd = new Cardiologist();
                dd.heal();
                p.isFine = true;
            }
            else if (p.problemIn == "Lungs") {
                Doctor dd = new Pulmonologist();
                dd.heal();
                p.isFine = true;
            }
            else if (p.problemIn == "something") {
                Doctor dd = new SeniorDoctor();
                dd.heal();
                p.isFine = true;
            }
            else{
                Doctor dd = new Doctor();
                dd.heal();
                p.isFine = true;
            }

        }
        else{
            System.out.println("Patient Alright");
        }
    }

}

class Patient extends Hospital{
    String name;
    String problemIn;
    boolean isFine = false;

    Patient(String name, String problemIn){
        this.name = name;
        this.problemIn = problemIn;
    }
}