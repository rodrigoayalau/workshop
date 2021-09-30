package challenges2;

public class EntryPoint1 {

    public static void main(String[] args) {
        ParentClass padre = new ParentClass("Ayala");
        System.out.println(padre.verDetalles());
        ChildClass hijo = new ChildClass(padre.lastname);
        imprimir(hijo);

    }

    public static void imprimir(ParentClass parent){
        System.out.println(parent.polimorfismo());
    }
    public static void thisSolveSomething(Object[] arrayOfItems){}
}
