package oop;

public class EntryPoint {
    public static void main(String[] args) {

        Person p1 = new Person("Rodrigo", "Ayala", 30);
        p1.setName("Rodrigo");
        p1.setLastname("Ayala");
        p1.setAge(30);
        printDetails(p1);

        Manager m1 = new Manager();
        m1.setName("Maria");
        m1.setLastname("Gonzalez");
        m1.setAge(28);
        m1.setSetRol("manager");
        m1.setGenre("female");
        printDetails(m1);

    }

    public static void printDetails(Person person){
        System.out.println(person);
    }
}
