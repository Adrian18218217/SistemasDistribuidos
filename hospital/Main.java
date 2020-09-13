
package hospital;


public class Main {
    public static void main(String[] args) {
        Patient patient_one=new Patient();
        patient_one.setDirection("A.V Los Rosales 451");
        
        Hospital hospital_one=new Hospital();
        
        hospital_one.patients.add(patient_one);
        System.out.println(hospital_one.patients.get(0).getDirection());
        
    }
}
