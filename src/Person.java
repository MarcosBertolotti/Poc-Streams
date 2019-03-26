import java.util.Objects;

public class Person {

    private String name;
    private int dni;
    private int age;

    public Person(){

    }

    public Person(String name, int dni, int age){

        this.setAge(age);
        this.setDni(dni);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return dni == person.dni &&
                age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dni, age);
    }

    @Override
    public String toString(){
        return this.getName() + ", Edad: " + this.getAge() + ", Dni:" + this.getDni() + "\n";
    }
}
