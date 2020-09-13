
package hospital;

public class Personal implements Entity{
    
    private String dni,direction,telephone,postition;

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPostition() {
        return postition;
    }

    public void setPostition(String postition) {
        this.postition = postition;
    }
    
}
