
package hospital;

import java.util.ArrayList;


public class Hospital implements Entity{
    
    private String name, direction,telephone,fax;
    public ArrayList<Patient> patients = new ArrayList();
    public ArrayList<Personal> personals = new ArrayList();

   

    public void setPersonals(ArrayList<Personal> personals) {
        this.personals = personals;
    }
    


    @Override
    public void setDirection(String direction) {
        this.direction=direction;
    }

    @Override
    public String getDirection() {
        return direction;
    }

    @Override
    public void setTelephone(String telephone) {
        this.telephone=telephone;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    
    
}
