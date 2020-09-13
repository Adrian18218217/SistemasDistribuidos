package hospital;

public class Patient implements Entity {

    private String id_patient, dni, name_lastname, direction, telephone;

    @Override
    public void setDirection(String direction) {
        this.direction = direction;
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

    public String getId_patient() {
        return id_patient;
    }

    public void setId_patient(String id_patient) {
        this.id_patient = id_patient;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName_lastname() {
        return name_lastname;
    }

    public void setName_lastname(String name_lastname) {
        this.name_lastname = name_lastname;
    }
    
}
