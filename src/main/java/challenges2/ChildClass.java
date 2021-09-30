package challenges2;

public class ChildClass extends ParentClass{

    public ChildClass(String lastname) {
        super(lastname);
    }

    public String polimorfismo(){
        return "Hola soy el hijo de apellido: " + super.lastname;
    }

    @Override
    public String verDetalles(){
        return super.verDetalles() + " Y yo el hijo";
    }

    @Override
    public String toString() {
        return "ChildClass{" + this.lastname + "}";
    }
}
