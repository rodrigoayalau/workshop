package oop;

public class Manager extends Person{

    private String setRol;
    private String genre;

    public Manager(String name, String lastname, int age){
        super(name, lastname, age);
    }

    public Manager(){

    }


    public String getSetRol() {
        return setRol;
    }

    public void setSetRol(String setRol) {
        this.setRol = setRol;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + " Manager{" +
                "setRol='" + setRol + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
