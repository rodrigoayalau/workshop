package challenges2;

public class ParentClass {

    protected String lastname;

    public ParentClass (String lastname){
        this.lastname = lastname;
    }

    public String polimorfismo(){
        return "Hola soy el padre de apellido: " + this.lastname;
    }

    public String verDetalles(){
        return "Soy el Padre";
    }

    public String verDetalles(String lastname){
        return "Soy el Padre de apellido: " + this.lastname;
    }


}
